package de.telran;

import java.io.PrintStream;
public class Flush {

    public static void main(String[] args) {
        String data = "This is a text inside the file";

        try {

            PrintStream output = new PrintStream("outputTEL.txt");
            output.print(data);
            output.close();

        } catch (exeption e) {

        }

    }
}
