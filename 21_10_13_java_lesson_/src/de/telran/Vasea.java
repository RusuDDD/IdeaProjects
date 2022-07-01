package de.telran;

public class Vasea {
    public static void main(String[] args) {
        // Дядя Вася пойдет на рыбалку в субботу, если температура ваздуха
        // будет от 23 до 29 включительно. На буднях он ходит на работу.
        // А в воскресенье он пойдет к соседу в баню, если температура
        // воздуха будет не выше -5. Написать функцию, которая принимает
        // номер дня недели (1 - 7) и температуру, и распечатывает в
        // консоль поведение дяди Васи.
        System.out.println(vaseaIdiotBaniu(-2, 7));
    }

    static void vaseaIdiotBaniu(int outsideTemperature, int zile) {
        if (outsideTemperature >= 23 &<=29 & zile == 6 ){
            System.out.println("Dan he goes to fishing " + outsideTemperature + "is true");
        }else if (outsideTemperature <= -5 & zile == 7) {
            System.out.println("Dan he goes to Sauna " + outsideTemperature + "is true");
        } else {
            System.out.println("Dan he is not going");

    /* static void printVaseaAction(int dayOfWeek, int temperature) {
        if (dayOfWeek <= 5) {
            System.out.println("Uncle Vasea goes Working");
        }else if(dayOfWeek==6){
            if(temperature<=23 &&temperature<=29)
                System.out.println("Uncle Vasea goes Fishing");
        }else if(dayOfWeek==7){
            if(temperature<=-5)
                System.out.println("Uncle vasea goes to hies");
        }*/
        }
    }
