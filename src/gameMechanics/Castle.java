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
    public static String roomsInput = new String();

    public Castle(Room[] roomsInCastle) {
        this.roomsInCastle = roomsInCastle;
    }

    public static void buildCastle() {
        roomsInput = readFile("../rooms.txt");
        //System.out.println(roomsInput);
        parseRoomsText(roomsInput);
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
        roomsInCastle[index] = inputRoom;
    }
    public static Room getRoomInCastle(int index){
        return roomsInCastle[index];
    }

    public Room generateRoom() {
        // TODO: implement
        return null;
    }

    private static void parseRoomsText(String roomAllocation) {

        Pattern pattern = Pattern.compile("(.[^:]*):\\s(.*)");

        String[] roomsLineSep = roomAllocation.split("\n");
        Room newRoom = new Room();
        //System.out.println(roomAllocation.split("Name: ", -1).length-1);
        setCastleSize( roomAllocation.split("Name: ", -1).length-1);
        int idx = 0;
        for (String line : roomsLineSep) {
            if (!line.isEmpty()) {

                Matcher match = pattern.matcher(line);
                if (match.find()) {
                    String key = match.group(1);
                    String value = match.group(2);
                    //System.out.println(value);
                    switch (key) {
                        case "Name":
                            newRoom.setName(value);
                            switch (value) {
                                case "Entry":
                                    newRoom.setStart(true);
                                    newRoom.setWayOut(true);
                                    break;
                                default:
                                    newRoom.setStart(false);
                                    newRoom.setWayOut(false);
                                    break;
                            }
                            break;
                        case "N":
                            newRoom.setRoomNorth(value);
                            break;
                        case "O":
                            newRoom.setRoomEast(value);
                            break;
                        case "S":
                            newRoom.setRoomSouth(value);
                            break;
                        case "W":
                            newRoom.setRoomWest(value);
                            break;
                        case "Description":
                            newRoom.setDescription(value);
                            break;
                        case "Content":
                            newRoom.setContent(value);
                            System.out.println(idx);
                            setRoomInCastle(newRoom, idx);
                            System.err.println(roomsInCastle[idx].getName());
                            idx++;
                            break;
                    }

                } else {
                    System.out.println("Something wrong with room input");

                }

            }// end if line.isEmpty 
        } // end for roomsLineSep
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
