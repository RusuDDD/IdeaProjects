package de.telran;

public class Main {

    public static void main(String[] args) {
        printA(5, 50, 1);
        printB(50,5,1);
        printN(50);
        System.out.println(sumA(100, 150,5));
    }

    static void printA(int a, int b, int d) {
        for (int i = a; i <= b; i += d) {
            System.out.println(i + " ");
        }
    }

    static void printB(int a, int b, int d) {
        for (int i = a; i >= b; i += d) {
            System.out.println(i + " ");
        }
    }

    static int sumA(int a, int b, int d) {
        int sum = 0;
        for (int i = a; i <= b; i += d) {
            sum += i;
        }
        return sum;
    }

    static void printN(int max) {
        for (int i = 1; i <= max; i++) {
            if (i % 5 == 0 || i % 7 == 0 || i % 13 == 0) {
                System.out.println(i + " ");
            }
        }
    }

}
