package de.telran;

public class forexemple {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        int i = 0;
        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (int j = 0; j < 10; j++) {
            System.out.println("Hello");
        }
        //print all numbers from 20 down to 0
        for (int t = 20; t >= 0; t -= 2) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}
