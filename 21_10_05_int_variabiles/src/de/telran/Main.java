package de.telran;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a;//declaration
        a = 5;//initialisation
        int b = 10;
        System.out.println(a);
        a = 18;
        System.out.println(a);
        
        byte someByte;
        someByte = 17;

        int sum = someByte + someByte;//upcasting
        short someShort = 15;
        int nul = someShort*someByte ;//upcasting

        long someLong = 56;
        long anotherLong = someLong + someShort;//upcasting
        //+-*   every think clear

        //division
        long divided = someLong / someShort;//3
        System.out.println(divided );
         // % se da  restul de la impartire
        long reminder = someLong % someShort;
        System.out.println(reminder);
        System.out.println(-10 % 3);

        //paranezele sund down-casting
        int intFromSomeLong = (int) someLong;

        //up-casting (se intimpla automat)
        someLong = someByte;

        

    }
}
