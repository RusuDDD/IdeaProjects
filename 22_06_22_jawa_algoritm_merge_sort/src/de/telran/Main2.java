package de.telran;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        int num = 5;
        int[] arr = new int[num+ 1];
        for (int i = 2; i <= num; i++) {
            arr[i] = -1;
        }
        //System.out.println(Arrays.toString(arr));

        System.out.println(fibonacciRecursion(num));
        System.out.println(fibonacciDpMemoization(num, arr));
        System.out.println(fibonacciDpTabulation(num));
    }


    private static int fibonacciRecursion(int num) {
        if (num < 2) {
            return 1;
        }
        return fibonacciRecursion(num - 1) + fibonacciRecursion(num - 2);
    }

    private static int fibonacciDpMemoization(int num, int[] arr) {
        if (num < 2) {
            return 1;
        }
        if (arr[num] != -1) {
            return arr[num];
        }
        arr[num] = fibonacciDpMemoization(num - 1, arr) + fibonacciDpMemoization(num - 2, arr);
        return arr[num];
    }

    private static int fibonacciDpTabulation(int num) {
        int[] arr = new int[num + 1];
        arr[0] = 0;
        arr[1] = 1;
        int res = 0;

        for (int i = 2; i <= num; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
            if (i == num) {
                res = arr[i]+arr[i-1];
            }

        }
        return res;

    }
}
