package de.telran;

public class Main {

    public static void main(String[] args) {
        double someDouble = 10.5;
        float someFloat = 13.7f;
        float anotherFloat = 3.4f;

        float resultingFloat = someFloat + anotherFloat;
        double resultingDouble = someFloat + someDouble;

        float floatPlusLong = someFloat + 10L;

        int someInt = 10;
        int anotherInt = 3;

        //int divisionINtResult = someInt / anotherInt;

        double devisionResult = someInt / anotherInt;
        System.out.println(devisionResult);

        double correctDevisionResult = (double) someInt / anotherInt;//3.33333333333335
        System.out.println(correctDevisionResult);

        System.out.println((byte) 128);


	// write your code here
    }
}
