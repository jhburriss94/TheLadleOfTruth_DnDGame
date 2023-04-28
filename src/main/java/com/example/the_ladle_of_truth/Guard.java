/**
 * @author James Burriss
 * @date 03/07/2023
 * @purpose Guard class. Will inherit from Characters.
 */

package com.example.the_ladle_of_truth;

public class Guard extends Characters { // Guard inherits class

    private int health;

    // Constructor

    /**
     * Setting instance variables and inheriting class.
     * @param str
     * @param dex
     * @param con
     * @param inte
     * @param wis
     * @param cha
     */
    Guard(int str, int dex, int con, int inte, int wis, int cha) {

        super(str, dex, con, inte, wis, cha);

        this.health = Health();
    }

    // Getters / Setters / Methods

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Guard attacks
     * @return
     */
    public int Attack() {
        return dEight.roll() + getStr();
    }

    /**
     * Guard's Health
     * @return
     */
    public int Health() {
        return dTwelve.roll() + dTwelve.roll() + dTwelve.roll() + this.getCon();
    }
}
