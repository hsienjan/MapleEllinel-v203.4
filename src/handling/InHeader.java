package handling;

import java.util.Arrays;
import java.util.List;

public enum InHeader {


    PONG(147),

    // Login ops
    REDISPLAY_SERVERLIST(7),
    GUEST_LOGIN(22),
    TOS(29),
    VIEW_SERVERLIST(33),
    VIEW_REGISTER_PIC(50),
    VIEW_SELECT_PIC(53),
    CLIENT_FAILED(57),
    PART_TIME_JOB(59),
    CHARACTER_CARD(60),
    ENABLE_LV50_CHAR(61),
    CREATE_LV50_CHAR(62),
    ENABLE_SPECIAL_CREATION(62),
    CREATE_SPECIAL_CHAR(65),
    LOCALE(102), // I guess
    CONNECT(103),
    LOGIN_PASSWORD(105),
    CHARLIST_REQUEST(106),
    AUTH_SECOND_PASSWORD(107),
    CHAR_SELECT(108),
    CHAR_LOGIN(110),
    LAST_SELECTED_WORLD(114),
    CHECK_DUPLICATE_ID(116),
    WORLD_LIST_RE_REQUEST(117),
    CREATE_CHAR(125),
    DELETE_CHAR(128),
    HEARTBEAT_REQUEST(134),
    CLIENT_ERROR(149),
    CLIENT_START(152),
    SERVERSTATUS_REQUEST(-1), // disconnects upon sending message (no error given)
    WVS_SET_UP_STEP(154),
    WVS_CRASH_CALLBACK(155),
    WORLD_STATUS_REQUEST(157),
    WORLD_LIST_REQUEST(160),
    WORLD_LIST_REQ(162),
    CHAR_SELECT_NO_PIC(166),
    CHANGE_PIC_REQUEST(170),
    USE_AUTH_SERVER(171),

    // Field
//    USER_TRANSFER_FIELD_REQUEST(175),
//    USER_TRANSFER_CHANNEL_REQUEST(176),
//    USER_TRANSFER_TO_HUB_REQUEST(177),
//    WORLD_TRANSFER_REQUEST(178),
//    WORLD_TRANSFER_SHINNING_STAR_REQUEST(179),
//    USER_MIGRATE_TO_CASH_SHOP_REQUEST(180),
//    USER_MIGRATE_TO_PVP_REQUEST(181),
//    PARTY_MIGRATE_TO_PVP_REQUEST(182),
//    USER_MIGRATE_TO_MONSTER_FARM(183),
//    USER_MIGRATE_TO_MONSTER_FARM_BY_INVITE_ITEM(184),
//    USER_TRANSFER_ASWAN_REQUEST(185),
//    USER_TRANSFER_ASWAN_READY_REQUEST(186),
//    ASWAN_RETIRE_REQUEST(187),
//    USER_REQUEST_PVP_STATUS(188),
//    USER_MIGRATE_TO_PVE_REQUEST(189),
//    USER_MOVE(190),
//    USER_SIT_REQUEST(191),
//    USER_PORTABLE_CHAIR_SIT_REQUEST(192),
//    USER_EMOTICON_ITEM_USE_REQUEST(193),
//    USER_DANCE_STOP_REQUEST(194),
//    USER_MELEE_ATTACK(195),
//    USER_SHOOT_ATTACK(196),
//    USER_MAGIC_ATTACK(197),
//    USER_BODY_ATTACK(198),
//    USER_AREA_DOT_ATTACK(199),
//    USER_MOVING_SHOOT_ATTACK_PREPARE(200),
//    HIT(201),
//    ATTACK_USER(202),
//    CHAT(203),
//    AD_BOARD_CLOSE(204),
//    EMOTION(205),
//    INVENTORY_OPERATION(241),
//    ABILITY_POINT_DISTRIBUTE(298),
//    AUTO_ABILITY_POINT_DISTRIBUTE(299),
//    STAT_CHANGE_REQUEST(301),
//    SKILL_RECORD_UPDATE_REQUEST(304),
//    SKILL(305),
//    TEMPORARY_STAT_RESET_REQUEST(306),
//    KEYMAP_UPDATE_REQUEST(414),
//
//    SUMMONED_MOVE(564),
//    SUMMONED_ATTACK(565),
//    SUMMONED_HIT(566),
//    SUMMONED_SKILL(567),
//    SUMMONED_REMOVE(568),
//    SUMMONED_ATTACK_PVP(569),
//    SUMMONED_ACTION(570),
//    SUMMONED_ASSIST_ATTACK_DONE(571),
//
//    DRAGON_MOVE(574),
//    DRAGON_GLIDE(575),
//
//    ANDROID_MOVE(578),
//    ANDROID_ACTION_SET(579),
//
//    FOX_MAN_MOVE(582),
//    FOX_MAN_ACTION_SET_USE_REQUEST(583),
//
//    QUICKSLOT_KEY_MAPPED_MODIFIED(585),
//    PASSIVE_SKILL_INFO_UPDATE(586),
//    UPDATE_CLIENT_INVIRONMENT(587),
//
//    CREATE_PSYCHIC_LOCK(708),
//    RESET_PATH_PSYCHIC_LOCK(709),
//    RELEASE_PSYCHIC_LOCK(710),
//    RESERVE_DAMAGE_PSYCHIC_LOCK(711),
//    CREATE_KINESIS_PSYCHIC_AREA(712),
//    DO_ACTIVE_PSYCHIC_AREA(713),
//    DEBUFF_PSYCHIC_AREA(714),
//    RELEASE_PSYCHIC_AREA(715),
//    PSYCHIC_OVER_REQUEST(716),
//    DEC_PSYCHIC_POINT_REQUEST(717),
//    TOUCH_ME_END_REQUEST(718),
//
//    RW_CLEAR_CURRENT_ATTACK_REQUEST(731),
//    RW_MULTI_CHARGE_CANCEL_REQUEST(732),
//
//    MOVE_LIFE(825),

    B_E_G_I_N__U_S_E_R(174),
    USER_TRANSFER_FIELD_REQUEST(175),
    USER_TRANSFER_CHANNEL_REQUEST(176),
    USER_TRANSFER_TO_HUB_REQUEST(177),
    WORLD_TRANSFER_REQUEST(178),
    WORLD_TRANSFER_SHINNING_STAR_REQUEST(179),
    USER_MIGRATE_TO_CASH_SHOP_REQUEST(180),
    USER_MIGRATE_TO_PVP_REQUEST(181),
    PARTY_MIGRATE_TO_PVP_REQUEST(182),
    USER_MIGRATE_TO_MONSTER_FARM(183),
    USER_MIGRATE_TO_MONSTER_FARM_BY_INVITE_ITEM(184),
    USER_TRANSFER_ASWAN_REQUEST(185),
    USER_TRANSFER_ASWAN_READY_REQUEST(186),
    ASWAN_RETIRE_REQUEST(187),
    USER_REQUEST_PV_P_STATUS(188),
    USER_MIGRATE_TO_PVE_REQUEST(189),
    USER_MOVE(190),
    USER_SIT_REQUEST(191),
    USER_PORTABLE_CHAIR_SIT_REQUEST(192),
    USER_EMOTICITEM_USE_REQUEST(193),
    USER_DANCE_STOP_REQUEST(194),
    USER_MELEE_ATTACK(195),
    USER_SHOOT_ATTACK(196),
    USER_MAGIC_ATTACK(197),
    USER_BODY_ATTACK(198),
    USER_AREA_DOT_ATTACK(199),
    USER_MOVING_SHOOT_ATTACK_PREPARE(200),
    USER_HIT(201),
    USER_ATTACK_USER(202),
    USER_CHAT(203),
    USER_A_D_BOARD_CLOSE(204),
    USER_EMOTION(205),
    ANDROID_EMOTION(206),
    USER_ACTIVATE_EFFECT_ITEM(207),
    USER_MONKEY_EFFECT_ITEM(208),
    USER_ACTIVATE_NICK_ITEM(209),
    USER_ACTIVATE_DAMAGE_SKIN(210),
    USER_ACTIVATE_DAMAGE_SKIN__PREMIUM(211),
    USER_DAMAGE_SKIN_SAVE_REQUEST(212),
    USER_DEFAULT_WING_ITEM(213),
    USER_KAISER_TRANSFORM_WING(214),
    USER_KAISER_TRANSFORM_TAIL(215),
    USER_UPGRADE_TOMB_EFFECT(216),
    USER_H_P(217),
    PREMIUM(218),
    USER_BAN_MAP_BY_MOB(219),
    USER_MONSTER_BOOK_SET_COVER(220),
    USER_SELECT_NPC(221),
    USER_REMOTE_SHOP_OPEN_REQUEST(222),
    USER_SCRIPT_MESSAGE_ANSWER(223),
    USER_SHOP_REQUEST(224),
    USER_TRUNK_REQUEST(225),
    USER_ENTRUSTED_SHOP_REQUEST(226),
    USER_STORE_BANK_REQUEST(227),
    USER_PARCEL_REQUEST(228),
    USER_EFFECT_LOCAL(229),
    USER_SPECIAL_EFFECT_LOCAL(230),
    USER_FINAL_ATTACK_REQUEST(231),
    USER_CREATE_AREA_DOT_REQUEST(232),
    USER_CREATE_HOLIDOM_REQUEST(233),
    REQ_MAKING_SKILL_EFF(234),
    SHOP_SCANNER_REQUEST(235),
    SHOP_LINK_REQUEST(236),
    AUCTIREQUEST(237),
    ADMIN_SHOP_REQUEST(238),
    USER_GATHER_ITEM_REQUEST(239),
    USER_SORT_ITEM_REQUEST(240),
    USER_CHANGE_SLOT_POSITION_REQUEST(241),
    USER_TEXT_EQUIP_INFO(242),
    USER_POP_OR_PUSH_BAG_ITEM_TO_INVEN(243),
    USER_BAG_TO_BAG_ITEM(244),
    USER_POUR_IN_BAG_TO_BAG(245),
    USER_STAT_CHANGE_ITEM_USE_REQUEST(246),
    USER_STAT_CHANGE_ITEM_CANCEL_REQUEST(247),
    USER_STAT_CHANGE_BY_PORTABLE_CHAIR_REQUEST(248),
    USER_MOB_SUMMITEM_USE_REQUEST(249),
    USER_PET_FOOD_ITEM_USE_REQUEST(250),
    USER_TAMING_MOB_FOOD_ITEM_USE_REQUEST(251),
    USER_SCRIPT_ITEM_USE_REQUEST(252),
    USER_RECIPE_OPEN_ITEM_USE_REQUEST(253),
    USER_CONSUME_CASH_ITEM_USE_REQUEST(254),
    USER_ADDITIONAL_SLOT_EXTEND_ITEM_USE_REQUEST(255),
    USER_CASH_PET_PICK_UP_OFF_REQUEST(256),
    USER_CASH_PET_SKILL_SETTING_REQUEST(257),
    USER_OPTICHANGE_REQUEST(258),
    USER_DESTROY_PET_ITEM_REQUEST(259),
    USER_BRIDLE_ITEM_USE_REQUEST(260),
    USER_SKILL_LEARN_ITEM_USE_REQUEST(261),
    USER_SKILL_RESET_ITEM_USE_REQUEST(262),
    USER_ABILITY_RESET_ITEM_USE_REQUEST(263),
    USER_ABILITY_CHANGE_ITEM_USE_REQUEST(264),
    USER_EXP_CONSUME_ITEM_USE_REQUEST(265),
    USER_MONSTER_LIFE_INVITE_ITEM_USE_REQUEST(266),
    USER_EXP_ITEM_GET_REQUEST(267),
    USER_CHAR_SLOT_INC_ITEM_USE_REQUEST(268),
    USER_CHAR_RENAME_ITEM_USE_REQUEST(269),
    USER_KAISER_COLOR_CHANGE_ITEM_USE_REQUEST(270),
    USER_SHOP_SCANNER_ITEM_USE_REQUEST(271),
    USER_MAP_TRANSFER_ITEM_USE_REQUEST(272),
    USER_PORTAL_SCROLL_USE_REQUEST(273),
    USER_FIELD_TRANSFER_REQUEST(274),
    USER_UPGRADE_ITEM_USE_REQUEST(275),
    USER_UPGRADE_ASSIST_ITEM_USE_REQUEST(276),
    USER_HYPER_UPGRADE_ITEM_USE_REQUEST(277),
    USER_EX_ITEM_UPGRADE_ITEM_USE_REQUEST(278),
    USER_KARMA_CONSUME_ITEM_USE_REQUEST(279),
    USER_EVENT_UPGRADE_ITEM_USE_REQUEST(280),
    USER_ITEM_OPTIUPGRADE_ITEM_USE_REQUEST(281),
    USER_ADDITIONAL_OPT_UPGRADE_ITEM_USE_REQUEST(282),
    USER_ITEM_SLOT_EXTEND_ITEM_USE_REQUEST(283),
    USER_WEAPTEMP_ITEM_OPTIREQUEST(284),
    USER_ITEM_SKILL_SOCKET_UPGRADE_ITEM_USE_REQUEST(285),
    USER_ITEM_SKILL_OPTIUPGRADE_ITEM_USE_REQUEST(286),
    USER_FREE_MIRACLE_CUBE_ITEM_USE_REQUEST(287),
    USER_EQUIPMENT_ENCHANT_WITH_SINGLE_U_I_REQUEST(288),
    USER_U_I_OPEN_ITEM_USE_REQUEST(289),
    USER_BAG_ITEM_USE_REQUEST(290),
    USER_ITEM_RELEASE_REQUEST(291),
    USER_MEMORIAL_CUBE_OPTIREQUEST(292),
    USER_USE_NAVI_FLYING_SKILL_REQUEST(293),
    USER_TOADS_HAMMER_REQUEST(294),
    USER_TOADS_HAMMER_HELP_REQUEST(295),
    USER_CHANGE_SOUL_COLLECTIREQUEST(296),
    USER_SELECT_SOUL_SKILL_UP_REQUEST(297),
    USER_ABILITY_UP_REQUEST(298),
    USER_ABILITY_MASS_UP_REQUEST(299),
    USER_DOT_HEAL(300),
    USER_CHANGE_STAT_REQUEST(301),
    USER_CHANGE_STAT_REQUEST_BY_ITEM_OPTION(302),
    SET_SOF_LINKED_SKILL_REQUEST(303),
    USER_SKILL_UP_REQUEST(304),
    USER_SKILL_USE_REQUEST(305),
    USER_SKILL_CANCEL_REQUEST(306),
    USER_SKILL_PREPARE_REQUEST(307),
    USER_DROP_MONEY_REQUEST(308),
    USER_GIVE_POPULARITY_REQUEST(309),
    USER_PARTY_REQUEST(310),
    USER_CHARACTER_INFO_REQUEST(311),
    USER_ACTIVATE_PET_REQUEST(312),
    USER_REGISTER_PET_AUTO_BUFF_REQUEST(313),
    USER_TEMPORARY_STAT_UPDATE_REQUEST(314),
    USER_PORTAL_SCRIPT_REQUEST(315),
    USER_PORTAL_TELEPORT_REQUEST(316),
    USER_CALLING_TELEPORT_REQUEST(317),
    USER_MAP_TRANSFER_REQUEST(318),
    USER_ANTI_MACRO_ITEM_USE_REQUEST(319),
    USER_ANTI_MACRO_SKILL_USE_REQUEST(320),
    USER_OLD_ANTI_MACRO_QUESTIRESULT(321),
    USER_ANTI_MACRO_REFRESH_REQUEST(322),
    USER_CLAIM_REQUEST(323),
    USER_QUEST_REQUEST(324),
    USER_MEDAL_REISSUE_REQUEST(325),
    USER_CALC_DAMAGE_STAT_SET_REQUEST(326),
    USER_B2_BODY_REQUEST(327),
    USER_THROW_GRENADE(328),
    USER_DESTROY_GRENADE(329),
    USER_CREATE_AURA_BY_GRENADE(330),
    USER_SET_MOVE_GRENADE(331),
    USER_MACRO_SYS_DATA_MODIFIED(332),
    USER_SELECT_NPC_ITEM_USE_REQUEST(333),
    USER_LOTTERY_ITEM_USE_REQUEST(334),
    USER_ROULETTE_START_REQUEST(335),
    USER_ROULETTE_RESULT_REQUEST(336),
    USER_ITEM_MAKE_REQUEST(337),
    USER_REPAIR_DURABILITY_ALL(338),
    USER_REPAIR_DURABILITY(339),
    USER_QUEST_RECORD_SET_STATE(340),
    USER_CLIENT_TIMER_END_REQUEST(341),
    USER_CLIENT_RESOLUTIRESULT(342),
    USER_FOLLOW_CHARACTER_REQUEST(343),
    USER_FOLLOW_CHARACTER_WITHDRAW(344),
    USER_SELECT_P_Q_REWARD(345),
    USER_REQUEST_P_Q_REWARD(346),
    SET_PASSENSER_RESULT(347),
    USER_REQUEST_INSTANCE_TABLE(348),
    USER_REQUEST_CREATE_ITEM_POT(349),
    USER_REQUEST_REMOVE_ITEM_POT(350),
    USER_REQUEST_INC_ITEM_POT_LIFE_SATIETY(351),
    USER_REQUEST_CURE_ITEM_POT_LIFE_SICK(352),
    USER_REQUEST_COMPLATE_TO_ITEM_POT(353),
    USER_REQUEST_RESPAWN(354),
    USER_CONSUME_HAIR_ITEM_USE_REQUEST(355),
    USER_FORCE_ATOM_COLLISION(356),
    USER_DEBUFF_OBJ_COLLISION(357),
    USER_UPDATE_LAPIDIFICATION(358),
    USER_REQUEST_CHARACTER_POTENTIAL_SKILL_RAND_SET(359),
    USER_REQUEST_CHARACTER_POTENTIAL_SKILL_RAND_SET_U_I(360),
    USER_REQUEST_OCCUMPATIDATA(361),
    USER_REQUEST_ASWAN_TIME_TABLE_CLIENT_INIT(362),
    USER_PROTECT_BUFF_DIE_ITEM_REQUEST(363),
    USER_PROTECT_BUFF_DIE_MAPLE_POINT_REQUEST(364),
    USER_PROTECT_EXP_DIE_MAPLE_POINT_REQUEST(365),
    USER_KEY_DOWN_AREA_MOVING(366),
    USER_CHECK_WEDDING_EX_REQUEST(367),
    USER_CATCH_DEBUFF_COLLISION(368),
    USER_AFFECTED_AREA_CREATED(369),
    USER_AFFECTED_AREA_REMOVED(370),
    USER_DAZZLE_HIT(371),
    USER_MESO_EXCHANGE_REQUEST(372),
    ZERO_TAG(373),
    ZERO_SHARE_CASH_EQUIP_PART(374),
    ZERO_LAST_ASSIST_STATE(375),
    USER_SHOOT_ATTACK_IN_F_P_S(376),
    USER_LUCKY_ITEM_USE_REQUEST(377),
    USER_MOB_MOVE_ABILITY_CHANGE(378),
    USER_DRAGACTION(379),
    USER_DRAGBREATH_EARTH_EFFECT(380),
    USER_RENAME_REQUEST(381),
    BROADCAST_MSG(382),
    GROUP_MESSAGE(383),
    FIELD_UNIVERSE_MESSAGE(384),
    WHISPER(385),
    MESSENGER(386),
    MINI_ROOM(387),
    PARTY_REQUEST(388),
    PARTY_RESULT(389),
    PARTY_INVITABLE_SET(390),
    EXPEDITIREQUEST(391),
    PARTY_ADVER_REQUEST(392),
    URUS_PARTY_REQUEST(393),
    GUILD_REQUEST(394),
    GUILD_RESULT(395),
    GUILD_JOIN_REQUEST(396),
    GUILD_JOIN_CANCEL_REQUEST(397),
    GUILD_JOIN_ACCEPT(398),
    GUILD_JOIN_REJECT(399),
    GUILD_CONTENT_RANK_REQUEST(400),
    TOWER_RANK_REQUEST(401),
    ADMIN(402),
    LOG(403),
    FRIEND_REQUEST(404),
    STAR_FRIEND_REQUEST(405),
    STAR_PLANET_POINT_REQUEST(406),
    LOAD_ACCOUNT_I_D_OF_CHARACTER_FRIEND_REQUEST(407),
    MEMO_REQUEST(408),
    MEMO_FLAG_REQUEST(409),
    ENTER_TOWN_PORTAL_REQUEST(410),
    ENTER_RANDOM_PORTAL_REQUEST(411),
    ENTER_OPEN_GATE_REQUEST(412),
    SLIDE_REQUEST(413),
    FUNC_KEY_MAPPED_MODIFIED(414),
    R_P_S_GAME(415),
    G_S_R_P_S_GAME(416),
    STAR_PLANET__G_S_R_P_S_GAME(417),
    G_S_R_P_S_FORCE_SELECT(418),
    MARRIAGE_REQUEST(419),
    WEDDING_WISH_LIST_REQUEST(420),
    GUEST_BLESS(421),
    BOOBY_TRAP_ALERT(422),
    STALK_BEGIN(423),
    ALLIANCE_REQUEST(424),
    ALLIANCE_RESULT(425),
    FAMILY_CHART_REQUEST(426),
    FAMILY_INFO_REQUEST(427),
    FAMILY_REGISTER_JUNIOR(428),
    FAMILY_UNREGISTER_JUNIOR(429),
    FAMILY_UNREGISTER_PARENT(430),
    FAMILY_JOIN_RESULT(431),
    FAMILY_USE_PRIVILEGE(432),
    FAMILY_SET_PRECEPT(433),
    FAMILY_SUMMRESULT(434),
    TALK_TO_TUTOR(435),
    TALK_TO_PARTNER(436),
    USER_SWITCH_R_P(437),
    REQUEST_INC_COMBO(438),
    REQUEST_DEC_COMBO(439),
    REQUEST_SET_BLESS_OF_DARKNESS(440),
    REQUEST_SET_HP_BASE_DAMAGE(441),
    MOB_CRC_KEY_CHANGED_REPLY(442),
    MOB_CRC_DATA_RESULT(443),
    MAKING_SKILL_REQUEST(444),
    BROADCAST_EFFECT_TO_SPLIT(445),
    BROADCAST_ONE_TIME_ACTITO_SPLIT(446),
    BROADCAST_AFFECTED_EFFECT_TO_SPLIT(447),
    DEBUG_ONLY_COMMAND(448),
    MICRO_BUFF_END_TIME(449),
    REQUEST_SESSIVALUE(450),
    USER_TRANSFER_FREE_MARKET_REQUEST(451),
    USER_REQUEST_SET_STEAL_SKILL_SLOT(452),
    USER_REQUEST_STEAL_SKILL_MEMORY(453),
    USER_REQUEST_STEAL_SKILL_LIST(454),
    USER_REQUEST_STEAL_SKILL(455),
    REWARD_MOB_LIST_REQUEST(456),
    USER_LV_UP_GUIDE_NOTICE(457),
    RESET_CROSS_HUNTER_ALERT(458),
    CROSS_HUNTER_COMPLETE_REQUEST(459),
    CROSS_HUNTER_SHOP_REQUEST(460),
    USER_EQUIP_SLOT_LEVEL_MINUS_ITEM_USE_REQUEST(461),
    BOARD_GAME_REQUEST(462),
    USER_REQUEST_FLYING_SWORD_START(463),
    BINGO_REQUEST(464),
    BINGO_CASSANDRA_REQUEST(465),
    ACTIBAR_REQUEST(466),
    USER_REQUEST_SET_OFF_TRINITY(467),
    MESO_RANGER_REQUEST(468),
    USER_REQUEST_SET_SMASH_COUNT(469),
    USER_HYPER_SKILL_UP_REQUEST(470),
    USER_HYPER_SKILL_RESET_REQUSET(471),
    USER_HYPER_STAT_SKILL_UP_REQUEST(472),
    USER_HYPER_STAT_SKILL_RESET_REQUEST(473),
    USER_SET_DRESS_CHANGED_REQUEST(474),
    ENTRY_RECORD_REQUEST(475),
    SET_MAX_GAUGE(476),
    USER_RETURN_EFFECT_RESPONSE(477),
    GET_SERVER_TIME(478),
    GET_CHARACTER_POSITION(479),
    USER_REQUEST_CHANGE_MOB_ZONE_STATE(480),
    EVOLVING_REQUEST(481),
    USER_MIXER_REQUEST(482),
    SUMMEVENT_REWARD(483),
    MYSTIC_FIELD_MOVE(484),
    YUT_GAME_REQUEST(485),
    USER_JEWEL_CRAFT_REQUEST(486),
    VALUE_PACK_REQUEST(487),
    REQUEST_RELOGIN_COOKIE(488),
    WAIT_QUEUE_REQUEST(489),
    CHECK_TRICK_OR_TREAT_REQUEST(490),
    MONSTER_FARM_MIGRATE_OUT_REQUEST(491),
    HALLOWEEN_CANDY_RANKING_REQUEST(492),
    GET_REWARD_REQUEST(493),
    MAPLE_STYLE_BONUS_REQUEST(494),
    MAPLE_STYLE_ADVICE_REQUEST(495),
    MAPLE_STYLE_SET_SCORE_REQUEST(496),
    MENTORING(497),
    GET_LOTTERY_RESULT(498),
    ROOTABYSS_ENTER_REQUEST(499),
    USER_SET_ITEM_ACTION(500),
    USER_SET_BITS_CASE(501),
    USER_SET_BITS_SLOT(502),
    USER_ANTI_MACRO_QUESTIRESULT(503),
    USER_PINKBEAN_ROLLING(504),
    USER_PINKBEAN_YO_YO_STACK(505),
    USER_QUICK_MOVE_SCRIPT(506),
    TIME_GATE_REQUEST(507),
    USER_SELECT_ANDROID(508),
    USER_COMPLETE_NPC_SPEECH(509),
    USER_COMPLETE_ANOTHER_USER_CHECK(510),
    USER_COMPLETE_COMBO_KILL_COUNT_CHECK(511),
    USER_COMPLETE_MULTI_KILL_COUNT_CHECK(512),
    USER_COMPLETE_MULTI_KILL_CHECK(513),
    USER_DAMAGE_FALLING_CHECK(514),
    USER_COMPLETE_PERSONAL_SHOP_BUY_CHECK(515),
    USER_DAILY_COMMITMENT_CHECK(516),
    USER_MOB_DROP_MESO_PICKUP(517),
    USER_BREAK_TIME_FIELD_ENTER(518),
    USER_RUN_ACT_QUEST(519),
    JOURNAL_AVATAR_REQUEST(520),
    REQUEST_EVENT_LIST(521),
    USER_SIGN_REQUEST(522),
    ADD_ATTACK_RESET(523),
    SET_EVENT_NAME_TAG(524),
    USER_AFFECTED_AREA_REMOVE_BY_TIME(525),
    REQUEST_FREE_CHANGE_JOB(526),
    LIBRARY_START_SCRIPT(527),
    CHANNEL_USER_COUNT_REQUEST(528),
    UN_URUS_SELECTED_SKILL_LIST(529),
    SOUL_DUNGESYS(530),
    USER_COORDINATICONTEST_REQUEST(531),
    USER_SOUL_EFFECT_REQUEST(532),
    USER_SPIN_OFF_NEW_MODIFY_REQUEST(533),
    BLACK_LIST(534),
    SKILL_HELPER_POPUP(535),
    BLOCKBUSTER(536),
    M_TALK_OFFLINE_ACCOUNT_FRIENDS_NAME_REQUEST(537),
    CHARACTER_BURNING(538),
    UPDATE_CHARACTER_SELECT_LIST(539),
    DIRECT_GO_TO_FIELD(540),
    TRY_REGISTER_TELEPORT(541),
    USER_TOWER_CHAIR_SETTING(542),
    USER_LAST_COLLECT_MONSTER_RESET(543),
    END_OVER_HEAT(544),
    TRADE_KING_SHOP_REQ(545),
    TRADE_KING_SHOP_INFO_REQ(546),
    B_E_G_I_N__P_E_T(546),
    PET_MOVE(547),
    PET_ACTION(548),
    PET_INTERACTIREQUEST(549),
    PET_DROP_PICK_UP_REQUEST(550),
    PET_STAT_CHANGE_ITEM_USE_REQUEST(551),
    PET_UPDATE_EXCEPTILIST_REQUEST(552),
    PET_FOOD_ITEM_USE_REQUEST(553),
    PET_OPEN_SHOP(554),
    E_N_D__P_E_T(555),
    B_E_G_I_N__S_K_I_L_L_P_E_T(556),
    SKILL_PET_MOVE(557),
    SKILL_PET_ACTION(558),
    SKILL_PET_STATE(559),
    SKILL_PET_DROP_PICK_UP_REQUEST(560),
    SKILL_PET_UPDATE_EXCEPTILIST_REQUEST(561),
    E_N_D__S_K_I_L_L_P_E_T(562),
    B_E_G_I_N__S_U_M_M_O_N_E_D(563),
    SUMMONED_MOVE(564),
    SUMMONED_ATTACK(565),
    SUMMONED_HIT(566),
    SUMMONED_SKILL(567),
    SUMMONED_REMOVE(568),
    SUMMONED_ATTACK_PV_P(569),
    SUMMONED_ACTION(570),
    SUMMONED_ASSIST_ATTACK_DONE(571),
    E_N_D__S_U_M_M_O_N_E_D(572),
    B_E_G_I_N__D_R_A_G_O_N(573),
    DRAGMOVE(574),
    DRAGGLIDE(575),
    E_N_D__D_R_A_G_O_N(576),
    B_E_G_I_N__A_N_D_R_O_I_D(577),
    ANDROID_MOVE(578),
    ANDROID_ACTISET(579),
    E_N_D__A_N_D_R_O_I_D(580),
    B_E_G_I_N__F_O_X_M_A_N(581),
    FOX_MAN_MOVE(582),
    FOX_MAN_ACTISET_USE_REQUEST(583),
    E_N_D__F_O_X_M_A_N(584),
    QUICKSLOT_KEY_MAPPED_MODIFIED(585),
    PASSIVESKILL_INFO_UPDATE(586),
    UPDATE_CLIENT_ENVIRONMENT(587),
    DIRECTINODE_COLLISION(588),
    USER_LASER_INFO_FOR_REMOTE(589),
    RETURN_TELEPORT_DEBUFF(590),
    CHECK_PROCESS(591),
    MEMO_IN_GAME_REQUEST(592),
    EGO_EQUIP_GAUGE_COMPLETE_RETURN(593),
    EGO_EQUIP_CREATE_UPGRADE_ITEM(594),
    EGO_EQUIP_CREATE_UPGRADE_ITEM_COST_REQUEST(595),
    EGO_EQUIP_TALK_REQUEST(596),
    EGO_EQUIP_CHECK_UPDATE_ITEM_REQUEST(597),
    INHERITANCE_INFO_REQUEST(598),
    INHERITANCE_UPGRADE_REQUEST(599),
    MIRROR_READING_SELECT_BOOK_REQUEST(600),
    LIKE_POINT(601),
    USER10TH_STREAMING_U_R_L_REQUEST(602),
    USER_UPDATE_MAPLE_T_V_SHOW_TIME(603),
    REDUCE_DOT_DAMGE_BASE_BUFF_REQUEST(604),
    MIRROR_STUDY_COMPLETE(604), // -1
    REQUEST_ARROW_PLATER_OBJ(605), // -1
    USER_TIME_EVENT_U_I_OPEN_REQUEST(607),
    USER_TIME_EVENT_RESULT_REQUEST(608),
    USER_TIME_EVENT_COMPLETE_REQUEST(609),
    USER_TIME_EVENT_PASSED_TIME_SET(610),
    INVASISETTING_REQUEST(611),
    USER_FIELD_ATTACK_OBJ_REQUEST_BOARDING(612),
    USER_FIELD_ATTACK_OBJ_REQUEST_GET_OFF(613),
    MONSTER_BATTLE(614),
    BOSS_ARENA_MATCH_REQUEST(615),
    BOSS_ARENA_MIGRATE_REQUEST(616),
    MOB_USER_CONTROL_SKILL_Q_PUSH(617),
    MOB_USER_CONTROL_SKILL_Q_POP(618),
    MOB_USER_CONTROL_SKILL_FORCED_Q_POP(619),
    PARTY_QUEST_RANKING_REQUEST(620),
    ATTENDANCE_EVENT(621),
    ATTENDANCE_EVENT_REWARD_REQ(622),
    UI_ATTENDANCE_GHOST_CHANGE_REQ(623),
    EVENT_UI_REQ(624),
    ATTENDANCE_EVENT_SELECT_REWARD(625),
    USER_SET_CUSTOMIZE_EFFECT(626),
    USER_CUSTOMIZE_EFFECT_ITEM_MODIFY(627),
    USER_GROWTH_HELPER_REQUEST(628),
    USER_CONTENTS_MAP_REQUEST(629),
    USER_TIMER_REQ(630),
    UAER_MANNEQUIN(631),
    USER_BUFFER_FLY_REQ(632),
    USER_NTARGET_FORCE_ATOM_ATTACK(633),
    USER_RUN_SCRIPT(634),
    CHECK_BOSS_PARTY_BY_SCRIPT(635),
    SET_GO_TO_SHINE_CITY_WAIT_FIELD(636),
    SET_STARPLANET_MINI_GAME_CUSTOMIZING_OPTION(637),
    STAR_PLANET_TREND_SHOP_SET_AVATAR(638),
    STAR_PLANET_TREND_SHOP_RESTORE_AVATAR(639),
    STAR_PLANET_REQUEST(640),
    STAR_PLANET_MATCHING_REENTRANCE(641),
    STAR_PLANET_RESULT_U_I_EXIT_SCRIPT(642),
    MOVE_TO_URUS_WAITING_FIELD(643),
    MONSTER_COLLECI_COMPLETE_REWARD__REQ(644),
    MONSTER_COLLECI_EXPLORE__REQ(645),
    PLAT_FORMAR_ENTER_REQUEST(646),
    STIGMA_DELEVERY_REQUEST(647),
    B_E_G_I_N__E_V_E_N_T__G_R_O_U_P(648),
    INVITATIACCEPT_USER(649),
    INVITATICANCLE_USER(650),
    EVENT_GROUP_LEAVE(651),
    B_E_G_I_N__E_V_E_N_T__G_R_O_U_P__P_A_C_K_E_T(652),
    E_N_D__E_V_E_N_T__G_R_O_U_P__P_A_C_K_E_T(653),
    E_N_D__E_V_E_N_T__G_R_O_U_P(654),
    B_E_G_I_N__E_V_E_N_T__R_A_N_K_I_N_G(655),
    EVENT_RANKING_OPEN(656),
    EVENT_RANKING_HELP(657),
    E_N_D__E_V_E_N_T__R_A_N_K_I_N_G(658),
    B_E_G_I_N__A_F_R_E_E_C_A_T_V(659),
    AFREECA_TV_BROAD_START(660),
    AFREECA_TV_BROAD_STOP(661),
    E_N_D__A_F_R_E_E_C_A_T_V(662),
    B_E_G_I_N__S_T_A_R_P_L_A_N_E_T__M_A_T_C_H_I_N_G(663),
    STAR_PLANET_MATCHING__REGISTER_REQ(664),
    STAR_PLANET_MATCHING__UN_REGISTER_REQ(665),
    STAR_PLANET_MATCHING__REGISTER_PARTY_REQ(666),
    STAR_PLANET_MATCHING__JOIN_PARTY_PLAY_REQ(667),
    STAR_PLANET_MATCHING__TRANSFER_ASSENT(668),
    STAR_PLANET_MATCHING__HELP_SCRIPT(669),
    E_N_D__S_T_A_R_P_L_A_N_E_T__M_A_T_C_H_I_N_G(670),
    B_E_G_I_N__S_T_A_R_P_L_A_N_E_T__Q_U_E_U_E(671),
    STAR_PLANET_QUEUE__REGISTER_REQ(672),
    STAR_PLANET_QUEUE__UN_REGISTER_REQ(673),
    E_N_D__S_T_A_R_P_L_A_N_E_T__Q_U_E_U_E(674),
    B_E_G_I_N__S_T_A_R_P_L_A_N_E_T__I_N_V_I_T_A_T_I_O_N(675),
    STAR_PLANET_INVITATI_ACCEPT(676),
    STAR_PLANET_INVITATI_CANCLE(677),
    E_N_D__S_T_A_R_P_L_A_N_E_T__I_N_V_I_T_A_T_I_O_N(678),
    USER_SURVEY_REQUEST(679),
    N_P_S_INFO(680),
    USER_FLAME_ORB_REQUEST(681),
    USER__S_A_D_RESULT_U_I__CLOSE(682),
    FREE_LOOK_CHANGE_REQUEST(683),
    FREE_LOOK_CHANGE_U_I_OPEN_FAILED(684),
    USER_SMART_PHONE_CALL_REQUEST(685),
    USER_JAGUAR_CHANGE_REQUEST(686),
    F_P_S_LOG(687),
    PACKET_MODIFY_LOG(688),
    BATTLE_USER_AVATAR_SELECT(689),
    BATTLE_USER_ATTACK(690),
    BATTLE_USER_ATTACK_EXPIRE(691),
    BATTLE_USER_ATTACK_POSITION(692),
    BATTLE_USER_HIT(693),
    BATTLE_USER_HIT_BY_MOB(694),
    BATTLE_STAT_CORE_REQUEST(695),
    BATTLE_USER_ALIVE(696),
    USER_CONTENTS_BOOK_REQUEST(697),
    PERFORMANCE_CLIENT_LOGIN(698),
    PERFORMANCE_CLIENT_IN_FIELD(699),
    PING_CHECK_REQUEST__CLIENT_TO_GAME(700),
    PING__CLIENT_TO_GAME(701),
    PLANT_POT_CLICK(702),
    RANDOM_MISSIREQUEST(703),
    ITEM_COLLECTI_SET_FLAG(704),
    ITEM_COLLECTI_CHECK_COMPLETE(705),
    SELF_STAT_CHANGE_REQUEST(706),
    CASH_BUFF_EVENT_CANCLE(707),
    CREATE_PSYCHIC_LOCK(708),
    RESET_PATH_PSYCHIC_LOCK(709),
    RELEASE_PSYCHIC_LOCK(710),
    RESERVE_DAMAGE_PSYCHIC_LOCK(711),
    CREATE_KINESIS_PSYCHIC_AREA(712),
    DO_ACTIVE_PSYCHIC_AREA(713),
    DEBUFF_PSYCHIC_AREA(714),
    RELEASE_PSYCHIC_AREA(715),
    PSYCHIC_OVER_REQUEST(716),
    DEC_PSYCHIC_POINT_REQUEST(717),
    TOUCH_ME_END_REQUEST(718),
    BITE_ATTACK_RESPONSE(719),
    SAVE_URUS_SKILL(720),
    GET_SAVED_URUS_SKILL(721),
    URUS_SHOP_REQUEST(722),
    URUS_PARTY_MEMBER_LIST(723),
    USER_KEY_DOWN_STEP_REQUEST(724),
    DAILY_GIFT_REQUEST(725),
    SKILL_COMMAND_LOCK(726),
    BEAST_FORM_WING_OFF(727),
    RESET_AIR_HIT_COUNT_REQUEST(728),
    R_W_ACTICANCEL(729),
    RELEASE_R_W_GRAB(730),
    R_W_CLEAR_CURRENT_ATTACK_REQUEST(731),
    R_W_MULTI_CHARGE_CANCEL_REQUEST(732),
    FUNTIFOOTHOLD_MAN(733),
    E_N_D__U_S_E_R(734),
    B_E_G_I_N__F_I_E_L_D(735),
    B_E_G_I_N__L_I_F_E_P_O_O_L(736),
    B_E_G_I_N__M_O_B(824),
    MOB_MOVE(825),
    MOB_APPLY_CTRL(826),
    MOB_DROP_PICK_UP_REQUEST(827),
    MOB_HIT_BY_OBSTACLE(828),
    MOB_HIT_BY_OBSTACLE_ATOM(829),
    MOB_HIT_BY_MOB(830),
    MOB_SELF_DESTRUCT(831),
    MOB_SELF_DESTRUCT_COLLISIGROUP(832),
    MOB_ATTACK_MOB(833),
    MOB_SKILL_DELAY_END(834),
    MOB_TIME_BOMB_END(835),
    MOB_ESCORT_COLLISION(836),
    MOB_REQUEST_ESCORT_INFO(837),
    MOB_ESCORT_STOP_END_REQUEST(838),
    MOB_AREA_ATTACK_DISEASE(839),
    MOB_EXPLOSISTART(840),
    MOB_LIFTING_END(841),
    MOB_UPDATE_FIXED_MOVE_DIR(842),
    MOB_CREATE_FIRE_WALK(843),
    MOB_AFTER_DEAD_REQUEST(844),
    MOB_DAMAGE_SHARE_INFO(845),
    MOB_CREATE_AFFECTED_AREA(846),
    MOB_DOWN_RESPONSE(847),
    E_N_D__M_O_B(848),
    B_E_G_I_N__N_P_C(849),
    NPC_MOVE(850),
    NPC_SPECIAL_ACTION(851),
    E_N_D__N_P_C(852),
    E_N_D__L_I_F_E_P_O_O_L(853),
    B_E_G_I_N__D_R_O_P_P_O_O_L(854),
    DROP_PICK_UP_REQUEST(855),
    E_N_D__D_R_O_P_P_O_O_L(856),
    B_E_G_I_N__R_E_A_C_T_O_R_P_O_O_L(857),
    REACTOR_HIT(858),
    REACTOR_CLICK(859),
    REACTOR_RECT_IN_MOB(860),
    REACTOR_KEY(861),
    E_N_D__R_E_A_C_T_O_R_P_O_O_L(862),
    B_E_G_I_N__F_I_S_H_I_N_G_Z_O_N_E_P_O_O_L(863),
    FISHING_INFO(864),
    FISHING_END(865),
    E_N_D__F_I_S_H_I_N_G_Z_O_N_E_P_O_O_L(866),
    B_E_G_I_N__P_E_R_S_O_N_A_L__O_B_J_E_C_T(867),
    DECOMPOSER_REQUEST(868),
    E_N_D__P_E_R_S_O_N_A_L__O_B_J_E_C_T(869),
    B_E_G_I_N__E_V_E_N_T__F_I_E_L_D(870),
    EVENT_START(871),
    SNOW_BALL_HIT(872),
    SNOW_BALL_TOUCH(873),
    COCONUT_HIT(874),
    TOURNAMENT_MATCH_TABLE(875),
    PULLEY_HIT(876),
    E_N_D__E_V_E_N_T__F_I_E_L_D(877),
    B_E_G_I_N__M_O_N_S_T_E_R__C_A_R_N_I_V_A_L__F_I_E_L_D(878),
    M_CARNIVAL_REQUEST(879),
    E_N_D__M_O_N_S_T_E_R__C_A_R_N_I_V_A_L__F_I_E_L_D(880),
    B_E_G_I_N__D_E_F_E_N_S_E__F_I_E_L_D(881),
    DEFENSE_GAME_REQUEST(882),
    E_N_D__D_E_F_E_N_S_E__F_I_E_L_D(883),
    C_O_N_T_I_S_T_A_T_E(884),
    B_E_G_I_N__P_A_R_T_Y__M_A_T_C_H(885),
    I_N_V_I_T_E__P_A_R_T_Y__M_A_T_C_H(886),
    C_A_N_C_E_L__I_N_V_I_T_E__P_A_R_T_Y__M_A_T_C_H(887),
    PARTY_MEMBER_CANDIDATE_REQUEST(888),
    URUS_PARTY_MEMBER_CANDIDATE_REQUEST(889),
    PARTY_CANDIDATE_REQUEST(890),
    INTRUSIFRIEND_CANDIDATE_REQUEST(891),
    INTRUSILOBBY_CANDIDATE_REQUEST(892),
    E_N_D__P_A_R_T_Y__M_A_T_C_H(893),
    REQUEST_FOOT_HOLD_MOVE(894),
    GATHER_REQUEST(895),
    GATHER_END_NOTICE(896),
    ACT_CHANGE_REACTOR_USE_REQUST(897),
    USER_ANTI_MACRO_BOMB_REQUEST(898),
    MAKE_ENTER_FIELD_PACKET_FOR_QUICK_MOVE(899),
    RUNE_STONE_USE_REQ(900),
    RUNE_STONE_SKILL_REQ(901),
    OBTACLE_ATOM_COLLISION(902),
    TIMER_GAUGE_TIMEOUT(903),
    FALLING_CATCHER_HACK_CHECK(904),
    COOK_GAME_REQUEST(905),
    F_P_S_MODE_EXIT_REQUEST(906),
    MAKE_ENTER_FIELD_PACKET_FOR_MIRROR_DUNGEON(907),
    LEAVE_MIRROR_DUNGEON(908),
    B_E_G_I_N__R_H_Y_T_H_M_G_A_M_E(909),
    RHYTHM_GAME__HIT_NOTE(910),
    RHYTHM_GAME__START_REGION(911),
    RHYTHM_GAME__END_REGION(912),
    RHYTHM_GAME__END_SPECIAL_ATTACK(913),
    RHYTHM_GAME__SELECT_MODE(914),
    RHYTHM_GAME__ATTACK_REQUEST(915),
    RHYTHM_GAME__NPC_ACTIREQUEST(916),
    RHYTHM_GAME__EXIT_GAME(917),
    E_N_D__R_H_Y_T_H_M_G_A_M_E(918),
    B_E_G_I_N__M_O_U_N_T_A_I_N_R_I_D_I_N_G(919),
    MOUNTAIN_RIDING_HP_INFO(920),
    MOUNTAIN_RIDING_MOB_INFO(921),
    E_N_D__M_O_U_N_T_A_I_N_R_I_D_I_N_G(922),
    B_E_G_I_N__P_I_R_A_N_H_A(923),
    PIRANHA_INFO(924),
    PIRANHA_DIE(925),
    PIRANHA_DAMAGE(926),
    PIRANHA_PREPARE(927),
    E_N_D__P_I_R_A_N_H_A(928),
    B_E_G_I_N__R_O_B_B_I_N_S(929),
    ROBBINS__INC_BOMB(930),
    ROBBINS__DEC_BOMB(931),
    ROBBINS__TOSS_BOMB(932),
    E_N_D__R_O_B_B_I_N_S(933),
    B_E_G_I_N__F_A_L_L_I_N_G_S_T_O_N_E(934),
    FALLING_STONE_INFO(935),
    FALLING_STONE_HP_INFO(936),
    FALLING_STONE_PREPARE(937),
    E_N_D__F_A_L_L_I_N_G_S_T_O_N_E(938),
    B_E_G_I_N__B_A_T_T_L_E_F_I_E_L_D(939),
    BATTLE_FIELD_DAMAGE(940),
    BATTLE_FIELD_SHEEP_REVIVAL_REQ(941),
    BATTLE_FIELD_SHEEP_REVIVE(942),
    E_N_D__B_A_T_T_L_E_F_I_E_L_D(943),
    B_E_G_I_N__B_O_S_S_A_R_E_N_A(944),
    BOSS_ARENA_SELECT_BOSS(945),
    BOSS_ARENA_SELECT_SKILL(946),
    BOSS_ARENA_SELECT_DIFFICULTY(947),
    BOSS_ARENA_SELECT_CONFIRM(948),
    E_N_D__B_O_S_S_A_R_E_N_A(949),
    B_E_G_I_N__C_A_T_A_P_U_L_T(950),
    CATAPULT__UPGRADE_SKILL(951),
    E_N_D__C_A_T_A_P_U_L_T(952),
    FIELD_ATTACK_OBJ_PUSH_ACT(953),
    FIELD_RESPAWN(954),
    B_E_G_I_N__S_O_U_L__D_U_N_G_E_O_N(955),
    SOUL_ITEM_USE(956),
    SOUL_ITEM_USE_VOTE(957),
    SOUL_DUNGE_SUMM_SOUL_BOSS(958),
    E_N_D__S_O_U_L__D_U_N_G_E_O_N(959),
    B_E_G_I_N__S_P_A_C_E_M_O_O_N_R_A_B_B_I_T(960),
    SPACE_MORABBIT_HIT_EFF(961),
    SPACE_MORABBIT_DAMAGE(962),
    E_N_D__S_P_A_C_E_M_O_O_N_R_A_B_B_I_T(963),
    B_E_G_I_N__H_U_N_D_R_E_D_B_I_N_G_O(964),
    H_BINGO_CHECK_NUMBER(965),
    H_BINGO_CHECK_BINGO(966),
    E_N_D__H_U_N_D_R_E_D_B_I_N_G_O(967),
    B_E_G_I_N__T_Y_P_I_N_G_G_A_M_E(968),
    TYPING_GAME_CHECK_MSG(969),
    TYPING_GAME_WORD_MOB_ATTACK(970),
    TYPING_GAME_LEVEL_SELECT(971),
    TYPING_GAME_SKILL_ATTACK(972),
    TYPING_GAME_FIELD_OUT(973),
    E_N_D__T_Y_P_I_N_G_G_A_M_E(974),
    B_E_G_I_N__H_U_N_D_R_E_D_O_X_Q_U_I_Z(975),
    H_OX_QUIZ_SELECTED(976),
    E_N_D__H_U_N_D_R_E_D_O_X_Q_U_I_Z(977),
    B_E_G_I_N__S_T_A_R_P_L_A_N_E_T_R_P_S(978),
    S_P_RPS_GAME_USER_SELECT(979),
    S_P_RPS_GAME_ANSWER(980),
    S_P_RPS_GAME_LEAVE(981),
    E_N_D__S_T_A_R_P_L_A_N_E_T_R_P_S(982),
    B_E_G_I_N__S_I_D_E_S_C_R_O_L_L_F_L_Y_S_H_O_O_T_I_N_G(983),
    S_S_F_S_HIT_USER(984),
    S_S_F_S_LETHAL_ATTACK(985),
    S_S_F_S_EXIT(986),
    E_N_D__S_I_D_E_S_C_R_O_L_L_F_L_Y_S_H_O_O_T_I_N_G(987),
    B_E_G_I_N__F_I_E_L_D_S_T_A_T_E(988),
    STAR_PLANET__H_BINGO_CHECK_NUMBER(989),
    STAR_PLANET__H_BINGO_CHECK_BINGO(990),
    STAR_PLANET__H_BINGO_SEND_NUMBER(991),
    STAR_PLANET__H_RPS_SELECTED(992),
    STAR_PLANET__GROUP_DANCE_SELECTED(993),
    STAR_PLANET__GROUP_DANCE_CANCEL(994),
    E_N_D__F_I_E_L_D_S_T_A_T_E(995),
    B_E_G_I_N__M_O_M_E_N_T_S_W_I_M_A_R_E_A(996),
    MOMENT_SWIM_AREA__WATER_LEVEL(997),
    E_N_D__M_O_M_E_N_T_S_W_I_M_A_R_E_A(998),
    B_E_G_I_N__G_H_O_S_T_P_A_R_K(999),
    GHOST_PARK_USE_RUNE_REQ(1000),
    GHOST_PARK_RUNE_HEAL_REQ(1001),
    GHOST_PARK_HIT_BULLET(1002),
    E_N_D__G_H_O_S_T_P_A_R_K(1003),
    B_E_G_I_N__F_I_E_L_D__U_R_U_S(1004),
    URUS_SAVE_DEADLY_USER(1005),
    E_N_D__F_I_E_L_D__U_R_U_S(1006),
    FIELD_SKILL_USE_REQUEST(1007),
    FIELD_WEATHER__MSG(1008),
    FIELD_STAT_Q_R_EX_DAY(1009),
    B_E_G_I_N__P_O_L_O_F_R_I_T_O_B_O_U_N_T_Y_H_U_N_T_I_N_G(1010),
    POLO_FRITO_BOUNTY_HUNTING_REQUEST(1011),
    E_N_D__P_O_L_O_F_R_I_T_O_B_O_U_N_T_Y_H_U_N_T_I_N_G(1012),
    B_E_G_I_N__P_O_L_O_F_R_I_T_O_T_O_W_N_D_E_F_E_N_S_E(1013),
    POLO_FRITO_TOWN_DEFENSE_REQUEST(1014),
    E_N_D__P_O_L_O_F_R_I_T_O_T_O_W_N_D_E_F_E_N_S_E(1015),
    B_E_G_I_N__P_O_L_O_F_R_I_T_O_C_O_U_R_T_S_H_I_P_D_A_N_C_E(1016),
    POLO_FRITO_COURTSHIP_DANCE_RESULT(1017),
    E_N_D__P_O_L_O_F_R_I_T_O_C_O_U_R_T_S_H_I_P_D_A_N_C_E(1018),
    B_E_G_I_N__B_O_S_S__D_E_M_I_A_N__F_L_Y_I_N_G_S_W_O_R_D(1019),
    DEMIAN_OBJECT_MAKE_ENTER_ACK(1020),
    DEMIAN_OBJECT_NODE_END(1021),
    DEMIAN_OBJECT_ERR__RECREATE(1022),
    E_N_D__B_O_S_S__D_E_M_I_A_N__F_L_Y_I_N_G_S_W_O_R_D(1023),
    E_N_D__F_I_E_L_D(1024),
    B_E_G_I_N__C_A_S_H_S_H_O_P(1025),
    CASH_SHOP_CHARGE_PARAM_REQUEST(1026),
    CASH_SHOP_QUERY_CASH_REQUEST(1027),
    CASH_SHOP_CASH_ITEM_REQUEST(1028),
    CASH_SHOP_CHECK_COUPREQUEST(1029),
    CASH_SHOP_MEMBER_SHOP_REQUEST(1030),
    CASH_SHOP_GIFT_MATE_INFO_REQUEST(1031),
    CASH_SHOP_SEARCH_LOG(1032),
    CASH_SHOP_COODINATIREQUEST(1033),
    CASH_SHOP_CHECK_MILEAGE_REQUEST(1034),
    CASH_SHOP_NAVER_USAGE_INFO_REQUEST(1035),
    M_V_P__DAILY_PACK__REQUEST(1036),
    M_V_P__SPECIAL_PACK__REQUEST(1037),
    E_N_D__C_A_S_H_S_H_O_P(1038),
    CHECK_S_P_W_CREATE_NEW_CHARACTER(1039),
    SET_S_P_W(1040),
    B_E_G_I_N__R_A_I_S_E(1041),
    RAISE_REFESH(1042),
    RAISE_U_I_STATE(1043),
    RAISE_INC_EXP(1044),
    RAISE_ADD_PIECE(1045),
    E_N_D__R_A_I_S_E(1046),
    SEND_MATE_MAIL(1047),
    REQUEST_GUILD_BOARD_AUTH_KEY(1048),
    REQUEST_CONSULT_AUTH_KEY(1049),
    REQUEST_CLASS_COMPETITIAUTH_KEY(1050),
    REQUEST_WEB_BOARD_AUTH_KEY(1051),
    IRBOX_EVENT(1052),
    B_E_G_I_N__I_T_E_M_U_P_G_R_A_D_E(1053),
    GOLD_HAMMER_REQUEST(1054),
    GOLD_HAMMER_COMPLETE(1055),
    E_N_D__I_T_E_M_U_P_G_R_A_D_E(1056),
    B_E_G_I_N__B_A_T_T_L_E_R_E_C_O_R_D(1057),
    BATTLE_RECORD_OFF_REQUEST(1058),
    BATTLE_RECORD_SKILL_DAMAGE_LOG(1059),
    E_N_D__B_A_T_T_L_E_R_E_C_O_R_D(1060),
    B_E_G_I_N__F_A_R_M(1061),
    INSERT_FARM_OBJECT(1062),
    DELETE_FARM_OBJECT(1063),
    INSERT_FARM_TILE(1064),
    DELETE_FARM_TILE(1065),
    TRANSFER_FARM_FIELD(1066),
    BUY_FARM_OBJECT(1067),
    SEL_FARM_OBJECT(1068),
    MY_HOUSE_UPGRADE(1069),
    FARM_ADMIN_COMMAND(1070),
    REQUEST_QUEST_COMPLETE(1071),
    CHECK_FARM_NAME(1072),
    REQUEST_INTERACT_OBJECT(1073),
    REQUEST_CONSUME_OBJECT(1074),
    REQUEST_CLICK_NPC(1075),
    REQUEST_RANDOM_FARM(1076),
    REQUEST_FARM_VISIT(1077),
    REQUEST_ADD_FARM_FRIEND(1078),
    FARM_IN_GAME_FRIEND_REQUEST(1079),
    REQUEST_DELETE_FARM_FRIEND(1080),
    REQUEST_ADD_BLACK_LIST(1081),
    REQUEST_DELETE_BLACK_LIST(1082),
    REQUEST_FARM_INFO_U_I(1083),
    CHECK_FARM_NAME_BY_CONSUME(1084),
    REQUEST_AUTO_HARVEST(1085),
    REQUEST_SOUL_RECHARGE(1086),
    REQUEST_TRANFER_FARM_BY_NAME(1087),
    MY_FARM_MONSTER_REQUEST(1088),
    FARM_MONSTER_COMBINE(1089),
    FARM_MONSTER_SET_NAME_REQUEST(1090),
    FARM_MONSTER_CARE(1091),
    FARM_MONSTER_PLAY(1092),
    FARM_MONSTER_RELEASE(1093),
    FARM_MONSTER_SEARCH_REQUEST(1094),
    FARM_MONSTER_POS_RECODE(1095),
    FARM_MONSTER_LOCKER_REQUEST(1096),
    FARM_MONSTER_LIFE_EXTEND(1097),
    PHOTO_UPDATE(1098),
    PHOTO_GET_REQUEST(1099),
    MY_HOME_SEND_NOTICE_REQUEST(1100),
    MY_HOME_LOAD_MAIN_LOG_REQUEST(1101),
    MY_HOME_DELETE_LOG_REQUEST(1102),
    FARM_WHISPER(1103),
    FARM_GROUP_MESSAGE(1104),
    REQUEST_FARM_FRIEND_RECOMMEND(1105),
    FARM_REQUEST_IN_GAME_INFO_SET(1106),
    FARM_REQUEST_IN_GAME_INFO_MOD(1107),
    REQUEST_FARM_FRIEND_INFO(1108),
    REQUEST_FARM_TODAY(1109),
    REQUEST_FIRST_ENTER_REWARD(1110),
    CHECK_ADMIN_ACCOUNT_LOG(1111),
    E_N_D__F_A_R_M(1112),
    CHARACTER_LIST_REQUEST(1113),
    COPY_CHARACTER_TO_TEST_REQUEST(1114),
    NO(1115),



    ;
    /**
     * Created on 2/18/2017.
     */
    private short value;

    InHeader(int op) {
        this.value = (short) op;
    }

    public short getValue() {
        return value;
    }

    public static InHeader getInHeaderByOp(int op) {
        for (InHeader inHeader : InHeader.values()) {
            if (inHeader.getValue() == op) {
                return inHeader;
            }
        }
        return null;
    }

    public static boolean isSpamHeader(InHeader inHeaderByOp) {
        List<InHeader> spam = Arrays.asList(
                UPDATE_CLIENT_ENVIRONMENT,
                PONG,
                WVS_SET_UP_STEP,
                LOCALE,
                HEARTBEAT_REQUEST,
                MOB_MOVE,
                USER_MOVE,
                PASSIVESKILL_INFO_UPDATE,
                USER_CHANGE_STAT_REQUEST,
                SUMMONED_MOVE,
                USER_TEMPORARY_STAT_UPDATE_REQUEST,
                USER_CALC_DAMAGE_STAT_SET_REQUEST
        );
        return spam.contains(inHeaderByOp);
    }
}
