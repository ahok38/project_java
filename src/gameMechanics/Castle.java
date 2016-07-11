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


//public static void main(String[] args) {
// 
//}
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

    String readFile(String fileName)  {
       
        StringBuilder sb = new StringBuilder();
        try {
             BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            br.close();
        }catch (IOException e){
            System.out.println(e);
            System.out.println("no file for rooms: "+fileName);
        }
            
        return sb.toString();
    }

    String roomsInput = readFile("rooms.txt") ;
    
    

}
