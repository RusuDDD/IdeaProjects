package de.telran;

import java.util.Scanner;

public class MainTwo {

    Scanner stdIn = new Scanner(System.in);
    long x = stdIn.nextLong();
    int sum = 0;
    while (x>0)
        sum += x % 10;
        x /= 10;
        System.out.println(sum);
        stdIn.close();

    }

            }

