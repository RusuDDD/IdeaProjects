package de.telran;

public class DacaEZero {
    public static void main(String[] args) {
        //Напишите метод , определяющий является ли целое число положительным, отрицат или нулем
        sumTractor(0);
    }

    static void sumTractor(int number) {
        if (number > 0) {
            System.out.println("This number is pozitiv");
        } else if (number < 0) {
            System.out.println("The number is Negativ");
        } else
            System.out.println("The number is Zero");
    }
}
