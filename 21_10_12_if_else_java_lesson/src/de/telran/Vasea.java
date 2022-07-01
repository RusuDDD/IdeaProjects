package de.telran;

public class Vasea {
    public static void main(String[] args) {
        System.out.println(vaseaIdiotBaniu(-2, 7));
    }

    static void vaseaIdiotBaniu(int outsideTemperature, int zile) {
        if (outsideTemperature >= 23 & <=29 && zile == 6) {
            System.out.println("Dan he goes to fishing " + outsideTemperature + "is true");
        }else if (outsideTemperature <= -5 & zile == 7) {
            System.out.println("Dan he goes to Sauna " + outsideTemperature + "is true");
        } else {
            System.out.println("Dan he is not going");

        }
    }
}