package de.telran;

public class deadeavasya {
    public static void main(String[] args) {
printvasyaAction(6,25);
    }

    static void printvasyaAction(int dayOfWeek, int temperatur) {
        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Uncle Vasya goes to Work");
                break;
            case 6:
                if (temperatur <= 23 || temperatur >= 29) {
                    System.out.println("Uncle VAsya goes to Fisching");
                } else {
                    System.out.println("Uncle Vasya does go to Fischingen");
                }
            case 7:
                if (temperatur <= -5) {
                    System.out.println("Uncle Vasya goes to the neighbours Sunday");
                } else {
                    System.out.println("Uncle Vasya does not go to Neighbouron Sunday");
                }
                break;
            default:
                System.out.println("Now such a day of week");

        }
    }
}
