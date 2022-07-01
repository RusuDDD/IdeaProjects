package de.telran;

public class Main {

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1, 5, 7, 12} ,7));
        System.out.println(binarySearch(new int[]{1, 5, 7, 12} ,1));
        System.out.println(binarySearch(new int[]{1, 5, 7, 12} ,15));
        System.out.println(binarySearch(new int[]{1, 5, 7, 12} ,6));
        System.out.println(binarySearch(new int[]{1, 5, 7, 12} ,0));
        System.out.println(binarySearch(new int[]{1, 5, 7, 12} ,3));
        System.out.println(binarySearch(new int[]{1, 5, 7, 12} ,10));
        System.out.println(binarySearch(new int[]{1, 5, 7, 12} ,14));
        System.out.println(binarySearch(new int[]{1, 5, 7, 12} ,18));
    }

    static int binarySearch(int[] array, int number) {
        int minIndex=0;
        int maxIndex = array.length - 1;
        while (minIndex <= maxIndex) {
            int midIndex = (maxIndex + minIndex) / 2;

            if (array[midIndex] < number) {
                minIndex = midIndex + 1;
            } else if (array[midIndex] > number) {
                maxIndex = midIndex - 1;
            } else {
                return midIndex;
            }
        }
        return -(minIndex + 1);
    }
}
