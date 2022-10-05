package homework_file_read_write;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("Test_1.txt");

             FileWriter fileWriter = new FileWriter("test_2.txt")) {

            int a;
            while ((a = fileReader.read()) != -1) {
                fileWriter.write(a);
            }
            System.out.println("Done");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

