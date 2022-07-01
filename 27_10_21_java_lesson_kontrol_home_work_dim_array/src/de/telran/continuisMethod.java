package de.telran;

public class continuisMethod {
    public static void main(String[] args) {
        int[][]array={{5,6,-7,8},{9,6,-5,4,1}};



    }

    static int getNumbersSubarrayWithNegative(int[][] array) {
        int res = 0;

        outerFor:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    res++;
                    continue outerFor;
                }
            }
        }
        return res;
    }

    static boolean containsNegative(int[][] array) {

        boolean res = false;
        outerFor:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    res = true;
                    break outerFor;
                }
            }
        }
        return false;
    }
}
