package de.telran;

public class SumaNumere {
    public static void main(String[] args) {
       /*
        Напишите метод, возвращающий сумму двух целых чисел. А в случае,
                если эти числа равны, возвращающий двойную сумму.

        sumDouble(1, 2) → 3 sumDouble(3, 2) → 5 sumDouble(2, 2) → 8
        */
        sumDouble(1, 2);
        sumDouble(3, 2);
        sumDouble(2, 2);
    }

    static  void sumDouble(int a, int b) {
        if (a == b) {
            System.out.println("Then the numbers are equal  " + (a + b) * 2);
        } else {
            System.out.println("The numbers are plus " + (a + b));
        }
    }
}