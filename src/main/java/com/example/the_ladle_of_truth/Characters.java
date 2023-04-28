/**
 * @author James Burriss
 * @date 03/07/2023
 * @purpose Abstract Super Class. All Characters inherit from here.
 */

package com.example.the_ladle_of_truth;

// The Attributes of Characters

public abstract class Characters {
    private int str;
    private int dex;
    private int con;
    private int inte;
    private int wis;
    private int cha;
    public Dice dFour;
    public Dice dSix;
    public Dice dEight;
    public Dice dTen;
    public Dice dTwelve;
    public Dice dTwenty;

    /**
     * Setting Attributes. Every Character gets their own Dice.
     * @param str
     * @param dex
     * @param con
     * @param inte
     * @param wis
     * @param cha
     */
    Characters(int str, int dex, int con, int inte, int wis, int cha) {
        this.str = str;
        this.dex = dex;
        this.con = con;
        this.inte = inte;
        this.wis = wis;
        this.cha = cha;
        dFour = new Dice(4, new int[] {1, 2, 3, 4});
        dSix = new Dice(6, new int[] {1, 2, 3, 4, 5, 6});
        dEight = new Dice(8, new int[] {1, 2, 3, 4, 5, 6, 7, 8});
        dTen = new Dice(10, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        dTwelve = new Dice(12, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        dTwenty = new Dice(20, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20});
    }

    // Getters // Abstract Method

    public int getStr() {
        return str;
    }

    public int getDex() {
        return dex;
    }

    public int getCon() {
        return con;
    }

    public int getInte() {
        return inte;
    }

    public int getWis() {
        return wis;
    }

    public int getCha() {
        return cha;
    }

    public abstract int Health();
}

