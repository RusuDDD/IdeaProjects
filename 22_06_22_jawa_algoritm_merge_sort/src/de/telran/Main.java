package de.telran;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {15, 45, 8, 6, 7, 10, 9};
        System.out.println(Arrays.toString(arr));
        meergeSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    private static void meergeSort(int[] arr) {
        int lengthArr = arr.length;//dlina masiva
        if (lengthArr == 1) {//uslovia vihoda
            return;

        }
        int mid = lengthArr / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[lengthArr - mid];
        //kopiruem elementi is masiva b podmasiva

        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }
        for (int j = 0; j < lengthArr - mid; j++) {
            rightArr[j] = arr[j + mid];
            
        }
        meergeSort(leftArr);
        meergeSort(rightArr);
        
        //kogda mi dostigli basavova uslovia
        meerge(arr, leftArr, rightArr);
        
    }

    private static void meerge(int[] arr, int[] leftArr, int[] rightArr) {
    }
}
