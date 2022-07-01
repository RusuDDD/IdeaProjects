package de.telran;

public class Main {

    public static void main(String[] args) {
        System.out.println(method(10));
        System.out.println(method(15));
        System.out.println(method(20));
        System.out.println(method(25));
        System.out.println(method(30));
        System.out.println(method(99));
        System.out.println(method(3010));
        System.out.println(methodNext(35));
        System.out.println(methodNext(135));
        System.out.println(methodNext(884));
        System.out.println(methodNext(537));
        System.out.println(methodNext(157));
        System.out.println(methodNext(1520));
        System.out.println(methodNext(15235));

    }


    static int method(int quadrath) {
        return quadrath * quadrath;

    }

    static int methodNext(int quadrath) {
        return quadrath * quadrath * quadrath;
    }
}
