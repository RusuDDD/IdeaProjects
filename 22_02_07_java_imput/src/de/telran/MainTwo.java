package de.telran;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class MainTwo {
    final static String File_Name = "output.txt";

    public static void main(String[] args) throws IOException {
        String hello = "Hello World";

        FileOutputStream outputstream = new FileOutputStream(File_Name, true);

        outputstream.write(hello.getBytes());
        outputstream.close();

    }
}
