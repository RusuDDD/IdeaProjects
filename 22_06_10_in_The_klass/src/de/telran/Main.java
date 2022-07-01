package de.telran;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("asfsdg");
        list.add("asfsdg");
        list.add("sgdf");
        list.add("asvv");
        list.add("midfnbd");

        System.out.println(tesList(list));
    }
    public static int tesList(List<String> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.charAt(0)=='a') count++;
        }
        return count;
    }
}
