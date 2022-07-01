package de.telran;

public class Main {

    public static void main(String[] args) {
        int[][] array = new int[][]{
                {5, -5, 9, 6, 7},
                {-9, 3, 4, 8,},
                {6, 5, 7, 8}
        };
        System.out.println(countSubarray(array));

        System.out.println(sumNumbersWithoutNegativ(array));
        System.out.println(fibanaciArray(1));
        System.out.println(fibanaciArray(2));
        System.out.println(fibanaciArray(3));
        System.out.println(fibanaciArray(4));
        System.out.println(fibanaciArray(5));
        System.out.println(fibanaciArray(150));
    }

    static int countSubarray(int[][] array) {
        int res = 0;
        outerFor:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] <= 0) {
                    continue outerFor;
                }
            }
            res++;
        }
        return res;
    }

    static int sumNumbersWithoutNegativ(int[][] array) {
        int res = 0;
        outerFor:
        for (int i = 0; i < array.length; i++) {
            int localsum = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {

                    continue outerFor;
                } else {
                    localsum += array[i][j];
                }

            }
            res += localsum;
        }
        return res;
    }

    static long fibanaciArray(int n) {
        if (n == 0) {
            return 0;
        }

        long[] fibanacies = new long[n + 1];

        fibanacies[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibanacies[i] = fibanacies[i - 1] + fibanacies[i - 2];
        }
        return fibanacies[n];
    }
}
