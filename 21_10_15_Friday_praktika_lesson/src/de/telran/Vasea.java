package de.telran;

public class Vasea {
    public static void main(String[] args) {
        /* 1.   Воспитательница в детском саду знала, что если Петя и Вася
    оба смеются или оба выглядят очень серьезно, то они что-то
     затевают и надо быть очень внимательной. Помогите воспитательнице
      и напишите метод, возвращающий true  когда оба мальчика
       смеются или ходят мрачные.
        Параметры PetyaSmile and VasyaSmile показывают
         смеются ли они.*/
        System.out.println(kindTrouble(true,true));
        System.out.println(kindTrouble(false,false));
        System.out.println(kindTrouble(true,false));
    }
    static boolean kindTrouble(boolean petea, boolean vasea) {
        return petea == vasea;
    }
}
