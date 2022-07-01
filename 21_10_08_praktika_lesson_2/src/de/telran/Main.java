package de.telran;

public class Main {

    public static void main(String[] args) {
        System.out.println("Result of divideed: = " + divided(50, 3));
        System.out.println("Result of mathOperation1 : = " + mathOperation1(-5, 8, 6));
        System.out.println("Result of mathOperation1 : = " + mathOperation2(55, 9, 9));
        System.out.println("Result of mathOperation : = " + squar(4));
        System.out.println("Average of mathOperation1 : = " + averageOfThree(1, 2, 3));
        System.out.println("Average of purchase : = " + purchase(1000, 500, 100));
    }

    static double divided(double n1, double n2) {
        return n1 / n2;
    }

    static int mathOperation1(int n1, int n2, int marca) {
        int result = n1 + n2 * n3;
        return result;
    }
    static int mathOperation2(int n1, int n2, int n3) {
        int result = n1 + n2 % n3;
        return result;
    }

    static int squar(int n) {
        return n * n;
    }

    static int averageOfThree(int n1, int n2, int n3) {
        return (n1 + n2 + n3) / 3;
    }

    static int purchase(int priceA, int priceB, int discount) {
        System.out.println(discount);
        return priceA + priceB - discount;
    }
}
