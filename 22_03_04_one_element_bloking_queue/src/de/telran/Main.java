package de.telran;

public class Main {

    public static void main(String[] args) {
        SingleStringBlokingQueue queue =new  SingleStringBlokingQueue();

        ConsumerTask consumerTask = new ConsumerTask(queue);


        SupplierTask supplierTask = new SupplierTask(queue);

        Thread consumerThread1 = new Thread(consumerTask);
        Thread consumerThread2 = new Thread(consumerTask);
        Thread consumerThread3 = new Thread(consumerTask);

        consumerThread1.setDaemon(true);
        consumerThread2.setDaemon(true);
        consumerThread3.setDaemon(true);

        consumerThread1.start();
        consumerThread2.start();
        consumerThread3.start();

        Thread suplierThread = new Thread(supplierTask);
        suplierThread.start();
    }
}
