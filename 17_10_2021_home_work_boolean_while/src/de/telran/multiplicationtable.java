package de.telran;

public class multiplicationtable {
    public static void main(String[] args) {
        int mul1 = 1;

        while (mul1 < 10) {
            int mul2 = 1;
            while (mul2 < 10) {
                System.out.print(mul1 * mul2 + "\t");
                mul2++;
            }
            System.out.println();
            mul1++;

        }
    }
}
