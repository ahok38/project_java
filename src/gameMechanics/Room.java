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
    String Name = "";
    boolean start = false;
    boolean wayOut = false;
    String roomNorth = "none";
    String roomSouth = "none";
    String roomEast = "none";
    String roomWest = "none";
    String description = "none";
    String content = "none";
    NPC[] npcInsideRoom;
    Player[] playersInRoom;
    Item[] itemsInsideRoom;
    FixItem[] itemsFixInRoom;
    Door[] doorsInsideRoom;
    FixItem[] fixItemsInRoom;

    void events () {
        // TODO
    }

    public Room(String ininitalName, boolean ininitalStart, boolean ininitalWayOut, String ininitalRoomNorth, String ininitalRoomSouth, String ininitalRoomEast, String ininitalRoomWest,
            String ininitalDescription, String ininitalContent, NPC[] ininitalNpcInsideRoom, Player[] ininitalPlayersInRoom, Item[] ininitalItemsInsideRoom,
            FixItem[] ininitalItemsFixInRoom, Door[] ininitalDoorsInsideRoom, FixItem[] ininitalFixItemsInRoom) {
        Name = ininitalName;
        start = ininitalStart;
        wayOut = ininitalWayOut;
        roomNorth = ininitalRoomNorth;
        roomSouth = ininitalRoomSouth;
        roomEast = ininitalRoomEast;
        roomWest = ininitalRoomWest;
        description = ininitalDescription;
        content = ininitalContent;
        npcInsideRoom = ininitalNpcInsideRoom;
        playersInRoom = ininitalPlayersInRoom;
        itemsInsideRoom = ininitalItemsInsideRoom;
        itemsFixInRoom = ininitalItemsFixInRoom;
        doorsInsideRoom = ininitalDoorsInsideRoom;
        fixItemsInRoom = ininitalFixItemsInRoom;
    }
    
    public Room(){
        
    }
    
    public String getName(){
        return Name;
    }
    public void setName(String nameInput){
        Name = nameInput;
    }
    public boolean getStart(){
        return start;
    }
    public void setStart(boolean startInput){
        start = startInput;
    }
     public boolean getWayOut(){
        return wayOut;
    }
    public void setWayOut(boolean wayOutInput){
        wayOut = wayOutInput;
    }
    public String getRoomNorth(){
        return roomNorth;
    }
    public void setRoomNorth(String roomNorthInput){
        roomNorth = roomNorthInput;
    }
    public String getRoomSouth(){
        return roomSouth;
    }
    public void setRoomSouth(String roomSouthInput){
        roomSouth = roomSouthInput;
    }
    public String getRoomEast(){
        return roomEast;
    }
    public void setRoomEast(String roomEastInput){
        roomEast = roomEastInput;
    }
    public String getRoomWest(){
        return roomWest;
    }
    public void setRoomWest(String roomWestInput){
        roomWest = roomWestInput;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String descriptionInput){
        description = descriptionInput;
    }
    public String getContent(){
        return content;
    }
    public void setContent(String contentInput){
        content = contentInput;
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

