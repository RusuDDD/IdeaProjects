package de.telran;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("I");
        stringList.add("Do");
        stringList.add("My");
        stringList.add("Homework");


        List<String> stringList1 = new ArrayList<>();
        stringList1.add("The");
        stringList1.add("Homework");
        stringList1.add("is");
        stringList1.add("not");
        stringList1.add("done");
        stringList1.add("yet");



        System.out.println(unitList(stringList));
        System.out.println();
        System.out.println(combiningRows(stringList1));
    }

    //    Дан List<String>. Написать метод, который возвращает строку,
//        которая есть результат объединения всех строк исходного листа через пробел.
//        Например: {“I”, “do”, “my”, ”homework”} -> “I do my homework”
    public static String unitList(List<String> stringList) {

        String probel = " ";
        String res = "";
        if (stringList == null || stringList.isEmpty()) {
            return res;
        }

        for (int i = 0; i < stringList.size(); i++) {
            res += stringList.get(i);
            res += probel;
        }
        return res;
    }

    //   Дан List<String>. Написать метод, который возвращает строку,
//       которая есть результат объединения всех строк исходного листа через пробел, при этом, все слова,
//       короче 4 символов должны идти вначале строки, остальные слова должны сохранить свой порядок.
//       Например: {“The”, “homework”, “is”, ”not”, “done”, “yet”} -> “The is not yet homework done”.

    public static String combiningRows(List<String> list) {
        String res = "";
        if (list == null || list.isEmpty()) {
            return res;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < 4) {
                res += list.get(i);
            }
            res += " ";
        }
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j).length() > 4)
                res += list.get(j);
        }
        res += " ";
        return res;
    }
}

