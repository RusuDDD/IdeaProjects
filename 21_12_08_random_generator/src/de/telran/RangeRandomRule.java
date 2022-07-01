package de.telran;

import java.util.Random;

//TODO the rule must generate random numbers between 'min' inclusive and 'max' exclusive
// min and max must be the fields of the class

public class RangeRandomRule implements IRandomRule {


    private final int max;
    private final int min;
    private final Random rnd = new Random();

    public RangeRandomRule(int max, int min) {
        this.max = max;
        this.min = min;
    }

    @Override
    public int nextInt() {
        int diff = max - min;
        return rnd.nextInt(diff) + min;
    }
}
