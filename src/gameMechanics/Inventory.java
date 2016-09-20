package gameMechanics;

/**
 * Created by tito on 7/1/16.
 */
public class Inventory {

    private Weapon[] weapons;
    private Treasure[] treasures;

    public Inventory(Weapon[] weapons, Treasure[] treasures) {
        this.setWeapons(weapons);
        this.setTreasures(treasures);
    }



    // getters and setters
    public void setWeapons(Weapon[] weapons) {
        this.weapons = weapons;
    }

    public void setTreasures(Treasure[] treasures) {
        this.treasures = treasures;
    }

    public Weapon[] getWeapons() {
        return this.weapons;
    }

    public Treasure[] getTreasures() {
        return this.treasures;
    }
}
