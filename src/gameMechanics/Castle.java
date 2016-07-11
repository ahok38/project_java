/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

package dnd;

/**
 *
 * @author Martins
 */
public class Castle {

    private Room[] roomsInCastle;

    public Castle(Room[] roomsInCastle) {
        this.roomsInCastle = roomsInCastle;
    }

    void buildCastle() {

    }

    public void setRoomsInCastle(Room[] roomsInCastle) {
        this.roomsInCastle = roomsInCastle;
    }

    public Room[] getRoomsInCastle() {
        return this.roomsInCastle;
    }

    public Room generateRoom() {
        // TODO: implement
        return null;
    }

    String readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            return sb.toString();
        } finally {
            br.close();
        }
    }

    String roomsInput = readFile("rooms.txt") ;
    
    

}
