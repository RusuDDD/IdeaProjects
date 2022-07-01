package de.telran;

import java.lang.module.FindException;

public class AdvancedIntArray {


    private int[] source;

    public AdvancedIntArray(int initialsize) {
        source = new int[initialsize];
    }

    public int get(int index) {
        return source[index];
    }

    public void set(int index, int value) {
        source[index] = value;
    }

    public int size() {
        return source.length;
    }

    public void append(int value) {
        int[] newSource = new int[source.length + 1];

        for (int i = 0; i < source.length; i++) {
            newSource[i] = source[i];
        }
        newSource[newSource.length - 1] = value;
        source = newSource;
    }

    public void insert(int index, int value) {
        //TODO complete
        int[] newsource = new int[source.length - 1];

        for (int i = 0; i < source.length - 1; i++) {
            source[i] = newsource[i];
        }

    }

    public void delete(int index) {
        //TODO complete
    }

    public boolean contains(int value) {
        //TODO complete
        for (int i = 0; i < source.length; i++) {
            if (source[i] == value) {
                return true;
            }
        }
        return false;
    }
}


