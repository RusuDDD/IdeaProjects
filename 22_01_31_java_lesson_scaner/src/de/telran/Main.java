package de.telran;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Moscow", "Russia");
        hashMap.put("Petersburg", "Russia");
        hashMap.put("Novgorod", "Russia");
        hashMap.put("Kaluga", "Russia");
        hashMap.put("Kiev", "Ukraina");
        hashMap.put("Odesa", "Ukraina");

        if (hashMap.containsKey("Moscow")) {
            System.out.println(hashMap.get("Moscow"));
        } else {
            System.out.println("No");
        }
        System.out.println("Exists Ukraina");
        if (hashMap.containsKey("Ukraina")) {
            System.out.println(hashMap.get("Ukraina"));
        } else {
            System.out.println("No");
        }
    }
}
