package de.telran;

public class Main {

    public static void main(String[] args) {
	/*1.	Написать функцию, которая распечатывает все числа от A до B с щагом D.
	(функция принимает три аргумента: A, B, D, причем A < B и D > 0) */
        printNumbersAtoBslashD(5, 100, 2);
        printsNumbersAtoBslashD(999, 10, 25);
    }


    static void printNumbersAtoBslashD(int a, int b, int d) {
        while (a <= b) {
            System.out.print(a + " ");
            a = a + d;
            a+=2;
        }
        System.out.println();
    }

    //2.	Написать функцию, которая распечатывает все числа от A до B с щагом D.
    //      (функция принимает три аргумента: A, B, D, причем A > B и D > 0)
    static void printsNumbersAtoBslashD(int a, int b, int d) {
        while (a >= b) {
            System.out.print(a + " ");
            a = a - d;
            a-=10;
        }
        System.out.println();
    }
}
