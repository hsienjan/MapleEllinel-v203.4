package net.swordie.ms.world;

import net.swordie.ms.ServerConstants;
import net.swordie.ms.client.Account;
import net.swordie.ms.client.Client;
import net.swordie.ms.client.character.Char;
import net.swordie.ms.connection.OutPacket;
import net.swordie.ms.loaders.FieldData;
import net.swordie.ms.util.Util;
import net.swordie.ms.util.container.Tuple;
import net.swordie.ms.world.field.Field;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created on 11/2/2017.
 */
public class Channel {
    //CHANNELITEM struct
    private int port;
    private String name;
    private int worldId, channelId;
    private boolean adultChannel;
    private List<Field> fields;
    private Map<Integer, Tuple<Byte, Client>> transfers;
    private Map<Integer, Char> chars = new HashMap<>();
    public final int MAX_SIZE = 1000;

    private Channel(String name, World world, int channelId, boolean adultChannel) {
        this.name = name;
        this.worldId = world.getWorldId();
        this.channelId = channelId;
        this.adultChannel = adultChannel;
        this.port = ServerConstants.LOGIN_PORT + 100 + channelId;
        this.fields = new CopyOnWriteArrayList<>();
        this.transfers = new HashMap<>();
    }

    public Channel(World world, int channelId) {
        this(world.getName() + "-" + channelId, world, channelId, false);
    }

    public Channel(String worldName, int worldId, int channelId) {
        this.name = worldName + "-" + channelId;
        this.worldId = worldId;
        this.channelId = channelId;
        this.adultChannel = false;
        this.port = ServerConstants.LOGIN_PORT + 100 + channelId;
        this.fields = new CopyOnWriteArrayList<>();
        this.transfers = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getGaugePx() {
        return Math.max(1, (chars.size() * 64) / MAX_SIZE);
    }

    public int getWorldId() {
        return worldId;
    }

    public int getChannelId() {
        return channelId;
    }

    public boolean isAdultChannel() {
        return adultChannel;
    }

    public void setAdultChannel(boolean adultChannel) {
        this.adultChannel = adultChannel;
    }

    public int getPort() {
        return port;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    /**
     * Gets a {@link Field} corresponding to a given ID. If it doesn't exist, creates one.
     *
     * @param id The map ID of the field.
     * @return The (possibly newly created) Field.
     */
    public Field getField(int id) {
        return getFields().stream().filter(field -> field.getId() == id).findFirst().orElse(createAndReturnNewField(id));
    }

    private Field createAndReturnNewField(int id) {
        Field newField = FieldData.getFieldCopyById(id);
        if (newField != null) {
            newField.setChannelField(true);
            newField.setChannel(getChannelId());
            getFields().add(newField);
        }
        return newField;
    }

    public Map<Integer, Tuple<Byte, Client>> getTransfers() {
        if (transfers == null) {
            transfers = new HashMap<>();
        }
        return transfers;
    }

    public void addClientInTransfer(byte channelId, int characterId, Client client) {
        getTransfers().put(characterId, new Tuple<>(channelId, client));
    }

    public void removeClientFromTransfer(int characterId) {
        getTransfers().remove(characterId);
    }

    public Map<Integer, Char> getChars() {
        return chars;
    }

    public void addChar(Char chr) {
        getChars().put(chr.getId(), chr);
    }

    public void removeChar(Char chr) {
        getChars().remove(chr.getId());
    }

    public Char getCharById(int id) {
        return getChars().get(id);
    }

    public Char getCharByName(String name) {
        return Util.findWithPred(getChars().values(), chr -> chr.getName().equals(name));
    }

    public Account getAccountByID(int accID) {
        for (Char chr : getChars().values()) {
            if (chr.getAccId() == accID) {
                return chr.getAccount();
            }
        }
        return null;
    }

    public void broadcastPacket(OutPacket outPacket) {
        for(Char chr : getChars().values()) {
            chr.write(outPacket);
        }
    }

    public void clearCache() {
        Set<Field> toRemove = new HashSet<>();
        for (Field field : getFields()) {
            if (field.getChars().size() == 0 && field.getDrops().size() == 0) {
                toRemove.add(field);
            }
        }
        getFields().removeAll(toRemove);

    }
}
