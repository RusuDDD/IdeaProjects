package de.telran;

public class Main {
    public static void main(String[] args) {

        // an explicit way to initialise an array
        int[] intArray = new int[]{15, 8, 10, -5};
        int[] intArray1 = {15, 5, 7, 10};

        // the implicit way to initialies an array
        int[] intArray2 = new int[10];//{0,0,....,0}

        intArray1 = new int[]{-5, 0, 3};
        intArray1 = intArray2;

        // how to obtain on element by its index
        int zerElement = intArray[0];//15
        int firstElement = intArray[1];//8
        int secondlement = intArray[2];//10
        int thirdlement = intArray[3];//-5

        System.out.println(intArray[2]);

        // how to set a new value to on element by its index
        intArray[2] = 12;//{15.8.12.-5}

        //how
        int length = intArray.length;
        System.out.println(length);

        printArray(intArray);
        printArray(intArray1);
        printArray(intArray2);

        fillArrayIncressingFrom0(intArray2);

        printArray(intArray2);
        printArray(intArray1);
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Fill the array from 0to (length-1)
    static void fillArrayIncressingFrom0(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }
}
