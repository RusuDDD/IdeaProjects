package de.telran;

import java.util.Arrays;

public class ex {
    public static void main(String[] args) {
        int[] array1 = new int[]{5, 6, 5, 8, 11};
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
}
