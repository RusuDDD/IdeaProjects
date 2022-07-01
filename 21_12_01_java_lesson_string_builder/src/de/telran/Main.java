package de.telran;

public class Main {

    public static void main(String[] args) {

        String helloWorld = "hello world";
        String res = "";

        long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            res += helloWorld;
            // res= res.concat(helloWorld);
        }
        System.out.println(System.currentTimeMillis() - currentTimeMillis);

        StringBuilder sb = new StringBuilder();
        currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(helloWorld);
        }
        res = sb.toString();
        System.out.println(System.currentTimeMillis() - currentTimeMillis);

        StringBuffer sbuf = new StringBuffer();
        currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(helloWorld);
        }
        res = sbuf.toString();
        System.out.println(System.currentTimeMillis() - currentTimeMillis);


    }
}
