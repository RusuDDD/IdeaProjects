package de.telran;

public class ex2 {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {5, 6, 8, -5, 9},
                {6, -8, 9, 3, -5},
                {8, 6, 9, 4, 5, 3, 56}
        };
        System.out.println(noNegativeElements(array));
        printarray(array);

    }

    static void printarray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array);
        }
    }

    /*
    2.сложить числа в двумерном массиве только из тех подмассивов,
     где нету отрицательных элементов.
     */
    static int noNegativeElements(int[][] araay) {
        int sum=0;
        for (int i = 0; i < araay.length; i++) {
            for (int j = 0; j < araay.length; j++) {
                if (araay[i][j] == 0)
                sum++;

            }
        }
        return sum;
    }
}
