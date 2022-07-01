package de.telran;

public class ConsumerTask implements Runnable {

    private final SingleStringBlokingQueue queue;

    public ConsumerTask(SingleStringBlokingQueue queue) {
        this.queue = queue;

    }

    @Override
    public void run() {
        while (true) {
            try {
                // хотим, чтобы в этом месте поток засыпал, если очередь пуста.
                String line = queue.remove();
                System.out.println("Thread: " + Thread.currentThread().getName() + ":" + line);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}
