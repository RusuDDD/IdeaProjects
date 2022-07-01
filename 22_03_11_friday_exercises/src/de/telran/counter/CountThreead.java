package de.telran.counter;

public class CountThreead implements Runnable {
    Counter counter;
    boolean inc;

    public CountThreead(Counter counter, boolean inc) {
        this.counter = counter;
        this.inc = inc;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (inc) {
                counter.increment();
                System.out.println("Incrementing " + counter.value());
            } else {
                counter.decrement();
                System.out.println("Drcrementing " + counter.value());
            }
        }
    }
}
