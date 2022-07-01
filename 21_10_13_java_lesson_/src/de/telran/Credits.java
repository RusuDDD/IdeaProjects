package de.telran;

public class Credits {
    public static void main(String[] args) {

    }

    static boolean isPlanPerformed(int creditsPlan, int mashaMade) {
        double mashaVelocity =1;
        double peteaVelocity = 0.8 * mashaVelocity;
        double inmotivatedVaseaVelocity = mashaVelocity / 2;
        double motivatedVaseaVelocity = mashaVelocity;

        double totalVelocityFirstCreditPack = mashaVelocity + peteaVelocity + inmotivatedVaseaVelocity;
        double totalVelocitySecondCreditPack = mashaVelocity + peteaVelocity + motivatedVaseaVelocity;
        int firstCreditsPack = creditsPlan * 0.8 / 10;
        int secondCreditPack = creditsPlan - firstCreditsPack;

        int firfstPackSpentTime = (int) (firstCreditsPack / totalVelocityFirstCreditPack;
        int secondPackSpendTime = (int) (firfstPackSpentTime)/ (totalVelocitySecondCreditPack)

    }
}
