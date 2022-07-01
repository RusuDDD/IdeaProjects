package de.telran;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //quickSort(array , start, end) : void -> method for sort
        // parttition (array ,start , end) : int indexpivot-> helper method for rerrange array elements from pivot
        // swap (array ,first , second): void -> helper method for swaping two elements

        int[] array = {45, 84, 2, 6, 10, 80, 95};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
    private static void quickSort(int[] array, int start, int end) {
        if (start >= end) {  //basic case
            return;
        }
        int indexPivot = parttition(array, start, end);
        quickSort(array, start, indexPivot - 1);
        quickSort(array, indexPivot + 1, end);
    }
    private static int parttition(int[] array, int start, int end) {
        int pivot = array[end];// choose pivot element
        int index = start;
        for (int i = start; i < end; i++) {
            if (array[i] <= pivot) {
                swap(array, i, index);
                index++;
            }
            }
            swap(array, end, index);

        return index;
    }

    private static void swap(int[] array, int source, int destination) {
        int temp = array[source];
        array[source] = array[destination];
        array[destination] = temp;

    }
}
