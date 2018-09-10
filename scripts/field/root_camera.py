# Swamp : Silent Swamp (105010000)  |  Used for camera movement for the Root Abyss QuestLine

AN_URGENT_SUMMONS = 30000

if sm.hasQuest(AN_URGENT_SUMMONS):
    sm.lockInGameUI(True)
    sm.moveCamera(170, 400, -850)
    sm.sendDelay(8500) # used to increment the status with 1, after 8000 ms

    sm.setPlayerAsSpeaker()
    sm.removeEscapeButton()
    sm.sendNext("Oh, there's a new area.")

    sm.moveCameraBack(20000)
    sm.lockInGameUI(False)