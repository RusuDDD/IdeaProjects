package de.telran;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("sdadfba");
        stringList.add("asddhsfgn");
        stringList.add("sgdfa");

        System.out.println(stringList);

        transformLong(stringList);
        System.out.println(stringList);

        }

    public static void transformLong(List<String> stringList) {
        for (int i = 0; i < stringList.size(); i++) {
            String s = stringList.get(i);
            if (s.length() > 4) {
                stringList.set(i, s.substring(0, 4));

            }
        }
    }
}
