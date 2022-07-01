package de.telran;

public class Main {

    public static void main(String[] args) {
	/*
	    1.  Написать функцию, которая распечатывает все числа от A до B с щагом D.
	        (функция принимает три аргумента: A, B, D, причем A < B и D > 0)
        2.  Написать функцию, которая распечатывает все числа от A до B с щагом D.
            (функция принимает три аргумента: A, B, D, причем A > B и D > 0)
        3.  Написать функцию, которая считает (отдает, возвращает - return)
            сумму чисел от A до B с шагом D. (функция принимает три аргумента: A, B, D, причем A < B и D > 0)

	 */
        printATwoBWithStepD(5, 50, 3);

        printABWithStepD(50, 4, 1);

        System.out.println();
        System.out.println(retunetAless(10, 100, 5));

        fromAtwoB(50);

    }

    static void printATwoBWithStepD(int a, int b, int d) {
        for (int i = a; i < b; i += d) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void printABWithStepD(int a, int b, int d) {
        for (int i = a; i > b; i -= d) {
            System.out.print(i + " ");
        }
    }

    static int retunetAless(int a, int b, int d) {
        int res = 0;
        for (int i = a; i < b; i += d) {
            System.out.print(i + " ");
            res = i;
        }
        return res;
    }

    /* 4.  Написать функцию, которая распечатывает все числа от 1 до A, кратные 5, 7 или 13
             (которые делятся на одно из этих чисел).*/
    static void fromAtwoB(int a) {
        for (int i = 1; i < a; i++) {
            if (i % 5 == 0 || i % 7 == 0 || i % 13 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
