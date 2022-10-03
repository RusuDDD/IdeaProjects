package homework;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _File {
    public static void main(String[] args) {
//1. Реализовать каждый класс File, InputStream, Data, Object итд.
        try (FileReader fileReader = new FileReader("homework.txt");
             FileWriter fileWriter = new FileWriter("homework_1.txt")) {
            int i;
            while ((i = fileReader.read()) != -1) {
                fileWriter.write(i);
            }
            System.out.println("Done");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
