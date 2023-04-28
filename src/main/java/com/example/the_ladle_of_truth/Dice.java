/**
 * @author James Burriss
 * @date 03/07/2023
 * @purpose Dice class.
 */

package com.example.the_ladle_of_truth;

public class Dice {

    private int numSides;
    private int[] sideValues;

    /**
     * Creates Die.
     * @param numSides
     * @param sideValues
     */
    Dice(int numSides, int[] sideValues) {
        this.numSides = numSides;
        this.sideValues = sideValues;
    }

    /**
     * Rolls the dice.
     * @return
     */
    public int roll() {
        int randRoll = (int)(Math.random()*sideValues.length);
        System.out.printf("d%d: %d\n", numSides, sideValues[randRoll]);
        return sideValues[randRoll];
    }
}
