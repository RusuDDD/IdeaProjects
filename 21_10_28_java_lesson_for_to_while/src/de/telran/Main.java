package de.telran;

public class Main {

    public static void main(String[] args) {
        int number = f(10);
        System.out.println(number);
    }

    static int f(int n) {
        if (n == 1)
            return 2;
        int res = 2 * f(n - 1);
        return res;
    }
}
