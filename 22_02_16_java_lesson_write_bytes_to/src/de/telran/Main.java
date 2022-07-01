package de.telran;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String helloo = "Hello World";
        byte[] bytes = helloo.getBytes();
        FileOutputStream fos = new FileOutputStream("output.txt");

        fos.write(bytes);
        fos.close();
    }

    public void writeButes(byte[] bytes,String filename) throws  IOException {
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            fos.write(bytes);
            
        }
    }
}
