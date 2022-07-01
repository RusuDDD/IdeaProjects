package de.telran;

public class neuInt {
    public static void main(String[] args) {
        int[] inta = new int[]{-3, -239};
        int[] intb = new int[]{};

        for (int i = 0; i < 2; i++) {
           inta[i] = i;
           intb[i] = 2-i;
            System.out.println(intb[i]);
            System.out.println(inta[i]);
        }
        System.out.println();
    }
}
