package de.telran;

public class Main {

    public static void main(String[] args) {
        boolean boal1 = false;
        boolean boal2 = true;
        // boolean operation & -and(si) | -or(daca) , !- negation , ^- xor

        //& -and(si)
        boal1 = true;
        boal2 = true;
        System.out.println(boal1 & boal2);//true

        boal1 = false;
        boal2 = true;
        System.out.println(boal1 & boal2);//false

        boal1 = true;
        boal2 = false;
        System.out.println(boal1 & boal2);//false

        boal1 = false;
        boal2 = false;
        System.out.println(boal1 & boal2);//false

        // |-or (sau)
        boal1 = true;
        boal2 = true;
        System.out.println(boal1 | boal2);//true

        boal1 = false;
        boal2 = true;
        System.out.println(boal1 | boal2);//true

        boal1 = true;
        boal2 = false;
        System.out.println(boal1 | boal2);//true

        boal1 = false;
        boal2 = false;
        System.out.println(boal1 | boal2);//fales

        // ^ -xor
        boal1 = true;
        boal2 = true;
        System.out.println(boal1 ^ boal2);//false

        boal1 = false;
        boal2 = true;
        System.out.println(boal1 ^ boal2);//truee

        boal1 = true;
        boal2 = false;
        System.out.println(boal1 ^ boal2);//true

        boal1 = false;
        boal2 = false;
        System.out.println(boal1 ^ boal2);//false

        // ! - negation
        boal1 = false;
        System.out.println(!boal1);//true

        boal1 = true;
        System.out.println(!boal1);//false

        //comparison operators(operatari sravnenie) <,<= ,>, >=, !=  operators transforming two numbers into boolean
        int a = 1;
        boolean isAPositiv = a > 0;
    }
}
