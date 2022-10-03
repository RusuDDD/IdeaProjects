package homework;

import java.io.*;

public class _Input_Stream {
    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream("Test.jpg");
             FileOutputStream fileOutputStream = new FileOutputStream("Test_1.jpg")) {

            int i;
            while ((i = fileInputStream.read()) != -1) {
                fileOutputStream.write(i);
            }
            System.out.println("Done");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}


