package de.telran;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Map<Auto, Integer> priceByAuto = fillPrice();
        Auto opelInsigna = new Auto("Opel", "Insigna");

        System.out.println(priceByAuto.get(opelInsigna));//null
    }


    static Map<Auto, Integer> fillPrice() {
        Auto opelInsigna = new Auto("Opel", "Insigna");
        Auto vwGolf = new Auto("VW", "Golf");

        Map<Auto, Integer> priceByAuto = new HashMap<>();

        priceByAuto.put(opelInsigna, 10000);
        priceByAuto.put(vwGolf, 15000);

        return priceByAuto;
    }
}

class Auto {
    String make;
    String model;

    public Auto(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Objects.equals(make, auto.make) && Objects.equals(model, auto.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model);
    }
}
