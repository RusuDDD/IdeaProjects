package de.telran.counter;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread thread1 = new Thread(new CountThreead(c, true));
        Thread thread2 = new Thread(new CountThreead(c, false));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        Thread.sleep(1000);
        System.out.println("Final count " + c.value());

    }

}
