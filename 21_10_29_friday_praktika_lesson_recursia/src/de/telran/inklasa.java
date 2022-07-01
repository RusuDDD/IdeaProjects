package de.telran;

import java.util.Arrays;

public class inklasa {
    public static void main(String[] args) {
        int[] array1 = new int[]{5, 6, 5, 8, 11};
        int[] array2 = new int[]{8, 9, 3, 7, 5};

        int[][] array3 = new int[][]
                {
                        {5, 8, 9, 6, 4, 3},
                        {6, 9, 3, 2, 8, 7}
                };

        findTwoSmaeElements(array1, array2);

        System.out.println(findCounterNumbers(array3));

        System.out.println(diferrent(array1));

        System.out.println(isWithoutZero(array1));
        System.out.println(equalityCheck(array1, array2));

        System.out.println(secondMaxArray(array1) + " " + "Spatiu care nu trebuie");

    }

    static void findTwoSmaeElements(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j])
                    System.out.println("Common elements is : " + array1[i]);
            }
        }
    }

    static int findCounterNumbers(int[][] array3) {

        int sum = 0;
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                if (array3[i][j] % 2 == 0) {
                    sum++;
                }
            }

        }
        return sum;
    }

    static int diferrent(int[] array1) {
        int max = array1[0];
        int min = array1[0];

        for (int i = 0; i < array1.length; i++) {

            if (array1[i] > max)
                max = array1[i];
            else if (array1[i] < min)
                min = array1[i];
        }
        return min;
    }

    // napisati metod ,provereaesii soderjetsea li v masive zelih cisel 0 i -1
    static boolean isWithoutZero(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 0 || array1[i] == -1) {
                return false;
            }
        }
        return true;
    }

    static boolean equalityCheck(int[] array1, int[] array2) {
        if (array1.length != array2.length) return false;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i])
                return false;
        }
        return true;
    }

    // find second largest elements in array
    static int secondMaxArray(int[] array) {
        int max = array[0];
        int secontMax = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > secontMax && array[i] < max)
                secontMax = array[i];

        }
        return secontMax;
    }

    static int secondMaxSort(int[] array) {
        Arrays.sort(array);
        int secondMax = array[0];
        for (int i = 1; i < array.length - 2; i++) {
            if (array[i] > secondMax && array[i] != array[array.length - 1])
                secondMax = array[i];
        }
        return secondMax;
    }

    //selection sort
    static void selectionSort(int[] array1) {
        for (int i = 0; i < array1.length - 1; i++) {
            int index = i;

            for (int j = i + 0; j < array1.length; j++) {
                if (array1[j] < array1[index]) {
                    index = j;
                }
            }
            int buffer = array1[index];
            array1[index] = array1[i];
            array1[i] = buffer;
        }

    }
}


