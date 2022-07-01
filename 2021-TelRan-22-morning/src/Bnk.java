public class Bnk {
    public static void main(String[] args) {
        // 1000 *3.5% for 7 years
        double amount = 1000;
        int year = 7;
        System.out.println(findSumBankAmount(year, amount));
    }

    public static double findSumBankAmount(int year, double amount) {
        double bankPerProcent = 3.5;
        return amount + (bankPerProcent * amount / 100) * year;


    }



}
