package de.telran;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        printStreamToFile();

    }
    public static void printStreamToFile()throws FileNotFoundException {
        try(FileOutputStream fos = new FileOutputStream("output.txt")PrintStream ps = new FileOutputStream("output");) {

        }

        ps.println("hello World");
        ps.println("hello World");
        ps.println("hello World");
        ps.println("hello World");
        ps.println("hello World");
        ps.close();

    }
    public static void printWriter()throws FileNotFoundException {
        try (PrintWriter pw = new PrintWriter("output.txt")){

        }
        pw.println("hello World");
        pw.println("hello World");
        pw.println("hello World");
        pw.println("hello World");
        pw.println("hello World");
        pw.close();

    }
}
