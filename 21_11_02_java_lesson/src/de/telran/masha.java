package de.telran;

public class masha {
    public static void main(String[] args) {





    }

    static void issueLoans(int lastCreditNumber) {
        if (lastCreditNumber % 13 == 0) {

            System.out.println("The loan with such number , as it is divided by 13");
    return;
    }
        for (int i = 0; i < lastCreditNumber; i++) {
            if (i % 13 == 0) {
                System.out.println("The loan with number " + i + "was not issued");
                continue;

            }
            int remainderBy3 = i % 3;
            if (remainderBy3 == 0) {
                System.out.println("The loan number " + i + "was issued by masha");
            } else if (remainderBy3 == 1) {
                System.out.println("The loan with number"+i+"was issued by ");
            }
            }
        }

}
