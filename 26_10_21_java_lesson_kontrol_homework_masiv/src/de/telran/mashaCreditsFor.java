package de.telran;

public class mashaCreditsFor {
    public static void main(String[] args) {
        System.out.println(countProvidedCredits(18));
    }

    static int countProvidedCredits(int monthNumbers) {
        int mashaPerformers = 50;
        int petyaPerformers = 40;
        int vasyaPerformers = 50;

        int result = 0;
        for (int i = 0; i <monthNumbers ; i++) {
            result += mashaPerformers + petyaPerformers + vasyaPerformers;

            mashaPerformers++;
            if (i%2==0)
                petyaPerformers++;

            if (i < 10) {
                vasyaPerformers--;
            } else {
                vasyaPerformers = 50;
            }
        }
        return result;
    }
}
