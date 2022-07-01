package de.telran;

import java.util.Arrays;
import java.util.List;

public class ListContainExample {
    public static void main(String[] args) {
        List<Auto> autos = composeAutos();
        Auto bentlyInMain = new Auto("Bently", 2010, "Silver");

        System.out.println(autos.contains(bentlyInMain));

    }

    static List<Auto> composeAutos() {
        Auto opel = new Auto("Opel", 2012, "grey");
        Auto mazda = new Auto("Mazda", 2015, "Red");
        Auto bently = new Auto("Bently", 2010, "Silver");

        return Arrays.asList(opel, mazda, bently);
    }
}
