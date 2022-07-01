package de.telran;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int temperatur = 20;
        int dayOfWeek = 5;
        if (temperatur >= 23 & temperatur<=29);
        {
            System.out.println("vasea se duce la baie cu curv");
        }
        switch (dayOfWeek) {
                case 1:
                    System.out.println("Monday");
                    // break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wensday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Atunci vasea face laba");
            }
        }
    }
}
