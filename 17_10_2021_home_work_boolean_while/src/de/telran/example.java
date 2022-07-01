package de.telran;

public class example {
    public static void main(String[] args) {
        printA(1, 15, 3);
        printA(1, 15, 4);
        printA(1, 15, 5);
        printB(15,1,3);
        printB(15,1,4);
        printB(15, 1, 5);
        int sum = sumProgresion(1, 10, 1);
        System.out.println(sum);
        printNumbersUpToMax(100);
        printNumbersUpToMax(50);

    }
    /*
     * The method prints out all numbers from a to b with the step d
     * @param a starting point
     * @param b the greatest posible number . Must be great than a. Otherwise the behavior of the method ungreadictable
     * @param d the step
     */
    static void printA(int a, int b, int d) {
        int curentNumber = a;
        while (curentNumber <= b) {
            System.out.print(curentNumber + " ");
            curentNumber += d;
        }
        System.out.println();
    }

    static void printB(int a, int b, int d) {
        int curentNumber = a;
        while (curentNumber >= b) {
            System.out.print(curentNumber + " ");
            curentNumber -= d;
        }
        System.out.println();
    }

    static int sumProgresion(int a, int b, int d) {
        int curentNumber = a;
        int sum = 0;

        while (curentNumber <= b) {
            sum += curentNumber;
            curentNumber += d;
        }
        return sum;
    }

    static void printNumbersUpToMax(int max) {
        int curetNumber = 1;
        while (curetNumber <= max) {
            if (curetNumber % 5 == 0 || curetNumber % 7 == 0 || curetNumber % 13 == 0) {
                System.out.print(curetNumber + " ");
            }
            curetNumber++;
        }
        System.out.println();
    }
}

