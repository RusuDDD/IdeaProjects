package de.telran;

public class Main {

    public static void main(String[] args) {

        int sum = sum(10, 15);
        System.out.println(sum);

        //vasea and masa apples
        // asta atunci cind nu se schima mai mult niciodata int
        final int mashaApplesNumbers = 3;
        final int vasyaApplesNumbers = 2;
        final int applesInTotal = mashaApplesNumbers + vasyaApplesNumbers;
        System.out.println(applesInTotal);

        int another = sum(122, 200);
        System.out.println(another);
    }

    static int sum(int x, int y) {
        int result = x + y;
        return result;
    }
}
