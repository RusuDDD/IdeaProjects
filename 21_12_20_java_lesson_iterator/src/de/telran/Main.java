package de.telran;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        int[] array = {5, 1, 27};

        Iterator<Integer> iterator = new ForwartArrayIterator(array);

        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println(number);
        }
        Iterator<Integer> increasingIterator = new IncreassingArrayIterator(array);

        while (increasingIterator.hasNext()) {
            int number = iterator.next();
            System.out.println(number); //  print elements by increassing order expected

        }

    }
}
