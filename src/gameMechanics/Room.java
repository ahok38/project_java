/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameMechanics;

/**
 *
 * @author Martins
 */
public class Room {
    boolean start;
    boolean wayOut;
    boolean roomNorth;
    boolean roomSouth;
    boolean roomEast;
    boolean roomWest;
    NPC[] npcInsideRoom;
    Player[] playersInRoom;
    Item[] itemsInsideRoom;
    FixItem[] itemsFixInRoom;
    Door[] doorsInsideRoom;
    FixItem[] fixItemsInRoom;

    void events () {
        // TODO
    }

    public Room(boolean start, boolean wayOut, boolean roomNorth, boolean roomSouth, boolean roomEast, boolean roomWest,
        NPC[] npcInsideRoom, Player[] playersInRoom, Item[] itemsInsideRoom, FixItem[] itemsFixInRoom,
        Door[] doorsInsideRoom) {
            // TODO: implement constructor
    }

    public void populateRoom() {
        // TODO
    }

    public void createInventory() {
        // TODO
    }

    public void createEncounter() {
        // TODO
    }

}

