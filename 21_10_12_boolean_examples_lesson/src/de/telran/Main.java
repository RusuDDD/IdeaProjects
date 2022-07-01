package de.telran;

public class Main {
    // de scris o functie care da rexutatul se imparte la 15
    public static void main(String[] args) {
        System.out.println(isDividedBy15(10));
        System.out.println(isDividedBy15(0));
        System.out.println(isDividedBy15(15));
        System.out.println(isDividedBy15(45));
        System.out.println(isDividedBy15(37));
        System.out.println(isDividedBy15Second(10));
        System.out.println(isDividedBy15Second(0));
        System.out.println(isDividedBy15Second(15));
        System.out.println(isDividedBy15Second(45));
        System.out.println(isDividedBy15Second(37));

    }

    static boolean isDividedBy15(int number) {
       // int remainder = number % 15;
        //boolean result = number % 15 == 0;
        //return number % 15 == 0;
        return number % 15 ==0;
    }
    static boolean isDividedBy15Second(int number) {
        boolean res = (number % 3 == 0) & (number % 5 == 0);
        //return number % 15 ==0;
        return res;
    }
}
