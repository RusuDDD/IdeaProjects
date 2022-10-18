package quickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // quickSort(array ,start , end ) : void method for sort
        // partition(array , start , end ) : int indexPivot -> helper method  for rearrange array element for pivot
        //  swap(array , first , second) : void  -> helper method for swapping two elements

        int[] array = {39, 22, 2, 55, 6, 20};
        quickSort(array, 0, array.length-1 );
        System.out.println(Arrays.toString(array));
    }
    private static void quickSort(int[] array, int start, int end) {
        if (start >= end) { // basic case
            return;
        }
        int indexPivot = partition(array, start, end);
        quickSort(array,start, indexPivot - 1);
        quickSort(array, indexPivot + 1, end);
    }
    private static int partition(int[] array, int start, int end) {
        int pivot = array[end]; // choose pivot element
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
    private static void swap(int[] array, int sours, int destination) {
        int temp = array[sours];
        array[sours] = array[destination];
        array[destination] = temp;
    }
}
