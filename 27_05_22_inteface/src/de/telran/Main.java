package de.telran;

public class Main {

    public static void main(String[] args) {

        String st1 = "Hello";
        String st2 = "Hello";
        String st3 = new String("Hello");

        System.out.println("-------------");
        System.out.println(st1 == st2);
        System.out.println(st1 == st3);
        System.out.println(st1.equals(st3));

        Person p1 = new Person("P1", 10);
        Person p2 = new Person("P2", 20);
        Person p3 = new Person("P3", 30);
        if (p1.equals(p2)) {
            System.out.println(p1 + "equals" + p2);
        }else
            System.out.println(p1 + "not equals" + p2);
    }

}
