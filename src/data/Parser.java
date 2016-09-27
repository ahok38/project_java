package data;

import gameMechanics.Creature;
import gameMechanics.NPC;
import gameMechanics.Weapon;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Patrick on 15.09.2016.
 */
public class Parser {

    public static void main(String[] args) throws IOException{
        Creature[] yoo = collectCreatures();
        for(int i=0;i<yoo.length;i++){
            System.out.println("Name: " + yoo[i].getName());
            System.out.println("Name: " + yoo[i].getSpecies());
            System.out.println("Name: " + yoo[i].getDescription());
            System.out.println("Name: " + yoo[i].getHp());
        }
    }

    private Parser(){}


    private static Creature[] parseCreatures (String file)throws IOException{
        BufferedReader br=readFile(file);

        Creature[] allCreatures=new Creature[countLines(br)/9+1];

        String name="";
        String species="";
        String description="";
        int xp=0;
        int hp=0;
        int baseDamage=0;
        int armor=0;
        Weapon weapon=new Weapon();

        int arrayCount=0;

        String line;

        br=readFile(file);

        while((line=br.readLine())!=null){

            if(line.matches("Name: .*")){
                name=line.substring(6);
            } else if(line.matches("Species: .*")){
                species=line.substring(9);
            } else if(line.matches("Description: .*")){
                description=line.substring(13);
            } else if(line.matches("Experience: .*")){
                xp=Integer.valueOf(line.substring(12));
            } else if(line.matches("HealthStatus: .*")){
                hp=Integer.valueOf(line.substring(14));
            } else if(line.matches("BaseDamage: .*")){
                baseDamage=Integer.valueOf(line.substring(12));
            } else if(line.matches("Armor: .*")){
                armor=Integer.valueOf(line.substring(7));
            } else if(line.matches("Weapon: .*")){
                weapon=new Weapon();
            } else if(line.matches("")){
                allCreatures[arrayCount]=new Creature(name,species,description,xp,hp,baseDamage,armor,weapon);
                arrayCount++;
            }
        }
        allCreatures[arrayCount]=new Creature(name,species,description,xp,hp,baseDamage,armor,weapon);

        return allCreatures;
    }

    private static int countLines(BufferedReader br)throws IOException{
        int lineNumber=0;
        while(br.readLine() != null){
            lineNumber++;
        }
        return lineNumber;
    }

    public static Creature[] collectCreatures()throws IOException{
        return parseCreatures("src/data/creatures.txt");
    }

    private static BufferedReader readFile(String file) throws IOException{
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        return br;
    }
}
