package de.telran;

public class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    public synchronized void howAreYouDoing(Person person) throws InterruptedException {
        System.out.println("How are you doing" + person.name + "?");
        Thread.sleep(1000);

        person.iAmFineThanks(this);
    }

    private synchronized void iAmFineThanks(Person person) {
        System.out.println("I am Fine thanks " + person.name + " ,and you?");

    }

    public static void main(String[] args) throws InterruptedException {
        Person ivan = new Person("Ivan");
        Person piotr = new Person("Piotr");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ivan.howAreYouDoing(piotr);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });
        thread.start();

        thread.join();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    piotr.howAreYouDoing(ivan);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });
        thread.start();

    }
}