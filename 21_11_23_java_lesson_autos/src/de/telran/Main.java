package de.telran;

public class Main {

    public static void main(String[] args) {

        Auto[] autos = getAutopark();

        Auto bently = new Auto("Bently", 2012, "Silver");
        System.out.println(containsAuto(autos ,bently));
        System.out.println(bently);

    }

    static boolean containsAuto(Auto[]autos, Auto auto) {
        for (int i = 0; i < autos.length; i++) {
            if (autos[i].equals(auto));
                return true;

        }
        return false;
    }

    private static Auto[] getAutopark() {
        Auto opel = new Auto("Opel", 2012, "grey");
        Auto mazda = new Auto("Mazda", 2015, "Red");
        Auto bently = new Auto("Bently", 2010, "Silver");

        return new Auto[]{opel, mazda, bently};
    }


}
