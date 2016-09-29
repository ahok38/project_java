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
public class Weapon extends Item{

    String name;
    int force;
    String description;

    public Weapon(String name, int force, String description) {
        this.setName(name);
        this.setForce(force);
        this.setDescription(description);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
