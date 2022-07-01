package de.telran;

public class Main {

    public static void main(String[] args) {
	/*
	5!=1*2*3*4*5
	f(5)
	 */


    }

    static long factorialRecursive(long n) {
        if (n <= 1)
            return 1;
        else
            return n* factorialRecursive(n - 1);
        }
    }

