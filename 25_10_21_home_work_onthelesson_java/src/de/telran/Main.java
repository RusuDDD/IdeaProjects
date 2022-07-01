package de.telran;

public class Main {

    public static void main(String[] args) {
        System.out.println("The year is a Leap " + isLeapYear(2021));
        triangle(6);
        System.out.println(factoryal(5));
        System.out.println(powerMethod(2, 3));
        int[] array = new int[]{1, 2, 3};
        System.out.println(sumValues(array));
    /* 1.Вася рано встает на работу и поэтому рано ложится спать.Сосед Васи любит слушать громкую музыку. У Васи проблемы,
    если сосед слушает музыку и еще нет семи утра или уже позже 20 часов. Напишите метод, возвращающий true если у Васи проблемы.
    (int hour - это время в диапазоне от 0 до 23.)
    vasiaInTrouble(true, 6) → true
    vasiaInTrouble(true, 7) → false
    vasiaInTrouble(false, 6) → false*/
    }

    static boolean vasyaTrouble(boolean singing, int hour) {
        return singing && (hour < 7 || hour > 20);
    }

    /*2.Даны два целые числа а и в. Написать метод, возвращающий true если одно из чисел 10 или их сумма равна 10.
        isTen(9, 10) → true
        isTen(9, 9) → false
        isTen(1, 9) → true*/
    static boolean isTen(int a, int b) {
        return a == 10 || b == 10 || a + b == 10;
    }

    /*3* Написать метод, определяющий является ли год високосным.
        15:27 Uhr*/
    static boolean isLeapYear(int year) {
        boolean a = (year % 4) == 0;
        boolean b = (year % 100) != 0;
        boolean c = ((year % 100 == 0) && (year % 400 == 0));
        return a && (b || c);
    }

    /* 4** Вывести на экран треугольник состоящий из цифр до числа n:
        1
        12
        123
        1234
        12345
        123456*/
    static void triangle(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println();
        }
    }

    // 5! = 5*4*3*2*1 to write method what can find a factoryal numbers n
    static int factoryal(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;

        }
        return fact;
    }

    // to writh method what find numbers in the cube
    static int powerMethod(int base, int power) {
        int sum = 1;
        for (int i = 1; i <= power; i++) {
            sum *= base;
        }
        return sum;
    }

    // write method sum all element arrays
    static int sumValues(int[] ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum = sum + ints[i];
        }
        return sum;
    }

    // write amethod katorii scitatet srednie znacenie vceh elementov masiva zelih cisel
    static double averageOfArray(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];
            double average = sum / numbers.length;
            return average
        }

    // Naiti maximalinii element celix cisel
    static int maxArray(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
        if (numbers[i]>max) max = numbers[i];
        }
        return max;
    }
    }

