package de.telran;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{21, -6, 7, 4, 10};

        System.out.println(findMind(array));

        inserationSort(array);
        printarray(array);//{-6 4,, 7, 10 ,21}
    }

    static void printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    static void inserationSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && temp < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
    }

    static int findMind(int[] array) {
        int min = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println(minIndex);
        return min;
    }
}
