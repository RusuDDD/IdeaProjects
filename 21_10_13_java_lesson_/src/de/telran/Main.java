package de.telran;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    static boolean isDividedBy3Positive(int number) {
        return number % 3 == 0 & number > 0;
    }
    static boolean isDividedBy3Or7(int number) {
        return number % 3 == 0 | number % 7 == 0;
    }
    static boolean isEvenAndBetween100And200(int number) {
        return number >= 100 & number <= 200 &; % 2 == 0;
    }

}
