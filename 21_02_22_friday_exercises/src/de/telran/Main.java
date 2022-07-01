package de.telran;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(returnSum);

    }
    public static void findLongestLine(File filename) throws IOException {
        List<Person> person = new ArrayList<>();
        List<String> temp = new ArrayList<>();

        try (BufferedReader bufferReader = new BufferedReader(new FileReader(filename))) {
            String line = "";
            while ((line = bufferReader.readLine()) != null) {
                temp.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String s : temp) {
            String[] nameAge =s.split(",");
            int age = Integer.parseInt(nameAge[1].trim());
            if (age > 18)
                person.add(new Person(nameAge[0].trim(), age));

            }
        }
    }
}
