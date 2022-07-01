package de.telran;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(15);

        IRandomRule listRandomRule = new ListRandomRule(numbers);
        RandomGenerator listGenerator = new RandomGenerator(listRandomRule);
        System.out.println(listGenerator.generate(10));

        numbers.add(20);
        System.out.println(listGenerator.generate(10));

        IRandomRule maxRandomRule = new MaxRandomRule(10);
        RandomGenerator maxGenerator = new RandomGenerator(maxRandomRule);

        maxGenerator.generate(20);

    }
}
