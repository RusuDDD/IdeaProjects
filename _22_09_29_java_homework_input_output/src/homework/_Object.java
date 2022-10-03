package homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class _Object {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Misha");
        stringList.add("Kolea");
        stringList.add("Andrey");
        stringList.add("Grisha");
        stringList.add("Aleona");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("stringsList_1.bin"));
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("stringsList_1.bin"))) {

            objectOutputStream.writeObject(stringList);
            System.out.println(inputStream.readObject());
            System.out.println("Done");

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}



