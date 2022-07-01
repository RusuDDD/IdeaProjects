package de.telran;

public class mashacredits {
    public static void main(String[] args) {

        final int mashaVelosity = 50;
        final int peteaVelosity = 50 * 8 / 10;
        final int lazyVasyaVelocity = mashaVelosity / 2;
        final int motivationVasya = mashaVelosity;
        int sumCredits = 0;
        int monathNumber =0;

        while (sumCredits < 2100) {
            if (sumCredits < 1370) {
                sumCredits = mashaVelosity + peteaVelosity + lazyVasyaVelocity;
            }else {
                sumCredits += mashaVelosity + peteaVelosity + motivationVasya;
            }
            monathNumber++;
        }
        System.out.println(monathNumber);
        System.out.println(sumCredits);
    }

}
