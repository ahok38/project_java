package gameMechanics;

/**
 * Created by Andreas on 28.09.2016.
 */
public class TestCreature {

    public static void main(String[] args){
        Weapon schwert = new Weapon();
        schwert.setForce(10);
        Player testKreatur = new Player("Klaus", "Zwerg", "Kampfzwerg", 0, 100, 15, 0, schwert);
        System.out.println(testKreatur.attack());
    }
}