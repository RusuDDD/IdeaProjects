package de.telran;

public class ChrarThread extends Thread {

    private final char symbol;

    public ChrarThread(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(symbol);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}
