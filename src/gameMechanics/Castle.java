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

import com.sun.xml.internal.ws.util.StringUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.*;


// remove call of method to test in FXwithMVC.java !!!!!!!!

public class Castle {

    private static Room[] roomsInCastle;
    private static Room[][] orderedRooms;
    public static String roomsInput = new String();

    public Castle(Room[] roomsInCastle) {
        this.roomsInCastle = roomsInCastle;
    }

    public static void buildCastle() {
        roomsInput = readFile("../rooms.txt");
        //System.out.println(roomsInput);
       roomsInCastle= parseRoomsText(roomsInput);
        orderRoomPosition();
    }
    public static void setCastleSize(int inputSize){
        roomsInCastle = new Room[inputSize];
    }
    public static int getCastleSize(){
        return roomsInCastle.length;
    }
    public void setRoomsInCastle(Room[] roomsInCastle) {
        this.roomsInCastle = roomsInCastle;
    }

    public Room[] getRoomsInCastle() {
        return this.roomsInCastle;
    }
    public static void setRoomInCastle(Room inputRoom, int index){
       //System.out.println(inputRoom.getName());
       roomsInCastle[index] =  inputRoom;
        //roomsInCastle[index] =  inputRoom;
        
        System.out.println(getRoomInCastle(index).getName());
    }
    public static Room getRoomInCastle(int index){
        return roomsInCastle[index];
    }

    public Room generateRoom() {
        // TODO: implement
        return null;
    }
    private static void orderRoomPosition (){
        int toSetSize = getCastleSize() * 2;
        
        
        orderedRooms = new Room[toSetSize][toSetSize];
        
        for(int i = 0; i < getCastleSize(); i++){
            
            Pattern pattern = Pattern.compile("(.+)-(.+)");
            String tmpString = (getRoomInCastle(i).getName()).replaceAll("\\s+","");
           System.out.println(getRoomInCastle(i).getName());
            Matcher match = pattern.matcher(tmpString);
            if (match.find()) {
                    String rowNum = match.group(1);
                    String colNum = match.group(2);
                    System.out.println(rowNum);
                    //System.out.println(colNum);
            }
            
            if(getRoomInCastle(i).getName() == "Entry"){
                
                orderedRooms[toSetSize/2][toSetSize/2] = roomsInCastle[i];
            }
        }
        
    }
    private static Room[] parseRoomsText(String roomAllocation) {

        Pattern pattern = Pattern.compile("(.[^:]*):\\s(.*)");
        //Room newRoom = new Room();
        String[] roomsLineSep = roomAllocation.split("\n");
        
        //System.out.println(roomAllocation.split("Name: ", -1).length-1);
        setCastleSize( roomAllocation.split("Name: ", -1).length-1);
        int idx = 0;
        for (String line : roomsLineSep) {
             roomsInCastle[idx] = new Room();
            if (!line.isEmpty()) {

                Matcher match = pattern.matcher(line);
                if (match.find()) {
                    String key = match.group(1);
                    String value = match.group(2);
                    //System.out.println(value);
                    switch (key) {
                        case "Name":
                            roomsInCastle[idx].setName(value);
                            //System.out.println (roomsInCastle[idx].getName());
                            switch (value) {
                                case "Entry":
                                    roomsInCastle[idx].setStart(true);
                                    roomsInCastle[idx].setWayOut(true);
                                    break;
                                default:
                                    roomsInCastle[idx].setStart(false);
                                    roomsInCastle[idx].setWayOut(false);
                                    break;
                            }
                            break;
                        case "N":
                            roomsInCastle[idx].setRoomNorth(value);
                            break;
                        case "O":
                            roomsInCastle[idx].setRoomEast(value);
                            break;
                        case "S":
                            roomsInCastle[idx].setRoomSouth(value);
                            break;
                        case "W":
                            roomsInCastle[idx].setRoomWest(value);
                            break;
                        case "Description":
                            roomsInCastle[idx].setDescription(value);
                            break;
                        case "Content":
                            roomsInCastle[idx].setContent(value);
                          // System.out.println(idx);
                            //setRoomInCastle(roomsInCastle[idx], idx);
                           //System.out.println(roomsInCastle[idx].getName());
                            idx++;
                            break;
                    }

                } else {
                    System.out.println("Something wrong with room input");

                }

            }// end if line.isEmpty 
        } // end for roomsLineSep
        return roomsInCastle;
    } // end parseRoomsText
    
 

    public static String readFile(String fileName) {
        File file = new File(Castle.class.getResource(fileName).getFile());
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("no file for rooms: " + fileName);
        }

        return sb.toString();
    }

}
