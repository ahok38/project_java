package dnd;

/**
 * Created by tito on 04.07.16.
 */
public class Creature {

    String name;
    int hp;
    int baseDamage;
    int armor;
    Weapon weapon;

    public Creature(String name, int hp, int baseDamage, int armor, Weapon weapon) {
        this.setName(name);
        this.setHp(hp);
        this.setBaseDamage(baseDamage);
        this.setArmor(armor);
        this.setWeapon(weapon);
    }

    // object methods
    public void attack() {
        // TODO: implement
    }

    public void defend() {
        // TODO: implement
    }


    // setters and getters
    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public int getBaseDamage() {
        return this.baseDamage;
    }

    public int getArmor() {
        return this.armor;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

}
