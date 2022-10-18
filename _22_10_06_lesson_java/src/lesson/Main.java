package lesson;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        try {
            read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void read() throws IOException {
        InputStream fs = new FileInputStream("file.txt");

        int data;
        while ((data = fs.read()) != -1) {
            System.out.println((char) data);
        }
        fs.close();

    }
}
