package de.telran;

public class Main {

    public static void main(String[] args) {

        new Runner().start();
        new Runner().start();
        new Runner().start();

        System.out.println("The end");

        new Thread(new RunnerRunnable()).start();
        new Thread(new RunnerRunnable()).start();
        new Thread(new RunnerRunnable()).start();

        SumIntegers sumIntegers = new SumIntegers();
        sumIntegers.start();
        SumIntegers.join();
        System.out.println(sumIntegers.get.Counter);

    }

}
