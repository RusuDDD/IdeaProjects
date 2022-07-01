package de.telran;

public class Main {

    public static void main(String[] args) {
        // print out the first number ,wich is greater than A and dividet by 5 and 7 and 11.
        printFirstNumber(-1000);
        printFirstNumberBreak(1000);
    }

    static void printFirstNumber(int a) {
        int number = a;
        while (number % 5 != 0 && number % 11 != 0 && number % 13 != 0) {
            number++;
        }
        System.out.println(number);
    }

    static void printFirstNumberBreak(int a) {
        int number = a;
        while (true) {
            if (number % 5 == 0 || number % 11 == 0 || number % 13 == 0) {
                System.out.println(number);
                break;
            }
            number++;
        }
    }
}