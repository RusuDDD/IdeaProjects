package de.telran;

public class Main {

    public static void main(String[] args) {
        System.out.println(isSliping(false, true));
        System.out.println(isSliping(false, false));
        System.out.println(isSliping(true, true));

        System.out.println(kidsTrouble(false, false));
        System.out.println(kidsTrouble(true, false));
        System.out.println(kidsTrouble(true, true));
    }

    static boolean isSliping(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    static boolean kidsTrouble(boolean vaseaSmile, boolean peteaSmile) {
        //  return !(peteaSmile ^ vaseaSmile);
        return peteaSmile == vaseaSmile;
    }
}