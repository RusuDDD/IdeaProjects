package de.telran;

import javax.swing.text.html.HTMLDocument;
import java.sql.Array;
import java.util.Iterator;

public class ArrayList implements Iterable<Car> {
    Car[] cars = new Car[]{};


    @Override
    public Iterator<Car> iterator() {

        Iterator iterator=new Iterator(cars) {

            @Override
            public boolean hasNext() {

                return currentIndex < array.length;
            }

            @Override
            public Object next() {
                return null;
            }
        }

        return null;
    }

    private int[] array;
    private int capacity;
    private int current;

    public ArrayList() {
        this.array = new int[1];
        this.capacity = 1;
        this.current = 0;
    }

    public void add(int v) {
        if (current == capacity) {
            capacity *= 2;
            int newArray[] = new int[capacity];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[current] = v;
        current++;
    }

    public int size() {
        return current;
    }

    public int get(int index) {
        if (index < current) {
            return array[index];

        }
        return -1;
    }

    public void remove() {
        current--;
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            result += (i == 0) ? array[i] : "," + array[i];
        }
        return result + "]\n";
    }

    public void add(int index, int v) {
        if (index < current && index >= 0) {
            array[index] = v;
        } else {
            add(v);
        }
    }
}
