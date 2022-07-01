package de.telran;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOddsToN(15));
    }

    //slojiti vse neciotnie cislo ot 1 do N
    static int sumOddsToN(int number) {
        int res = 0;
        for (int i = 0; i < number; i++) {
            if (i % 2 != 0)
                continue; //go to the next iteration

            res += i;
            }
            return res;
        }
}
