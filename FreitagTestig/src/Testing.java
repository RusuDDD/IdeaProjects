import javax.swing.*;

public class Testing {
    public static void main(String[] args) {
        System.out.println(quadrat(123));
        System.out.println(divisionTwoNumbers(50, 3));
        System.out.println(mixNumbers(-5, 8, 6));
        System.out.println(moduloX(55, 9, 9));
        System.out.println(tenNumbers(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        discount();
    }

    public static int quadrat(int n) {
        return n * n;
    }

    public static int divisionTwoNumbers(int a, int b) {
        return a / b;
    }

    public static int mixNumbers(int a, int b, int c) {
        return a + b * c;
    }

    public static int moduloX(int a, int b, int c) {
        return (a + b) % c;
    }

    public static int tenNumbers(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k) {
        return (a + b + c + d + e + f + g + h + i + j) / k;
    }

    public static int discount() {
        int a = 1000;
        int b = 500;
        int c = 100;
        int d = a + b - c;
        System.out.println("total = " + d);
        System.out.println("discound 100");
        return d;
    }
}
