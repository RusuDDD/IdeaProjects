package de.telran;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[][] array10x10 = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array10x10[i][j] = 99 - 10 * i - j;

            }
        }
        print2DimArray(array10x10);

        int[] array = new int[]{1, 2, -3, 5, -5};
        multiplyPositivesBy3(array);
        printArray(array);

        makeOddIndicisesZero(array);
        printArray(array);

        int[][] array2Dim = new int[][]
                {
                        {1, 2, 3, -5},
                        {6, 7, 8, 9, 10},
                        {6, 7, 8, 56, 10},
                        {6, 12, 8, 9, 10, 156}
                };

        System.out.println(containsNegative(array2Dim));

        getNumbersSubarrayWithNegative(array2Dim);

    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    static void print2DimArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            printArray(array[i]);
        }
    }

    static void multiplyPositivesBy3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                array[i] *= 3;
            }
        }
    }

    static void makeOddIndicisesZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
    }

    static boolean containsNegative(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    static int getNumbersSubarrayWithNegative(int[][] array) {
        int res = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}

