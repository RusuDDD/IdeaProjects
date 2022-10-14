package homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
         /*    По ссылке https://drive.google.com/file/d/1XZrLLuJlHK3n35NwQAnY9t1nSwZ3-piq/view?usp=sharing
         находится файл file.dat. Ваша задача скачать этот файл (кстати, вы можете сделать это из
         Java программы, но если сложно можно просто скачать). Ваша программа  должна записать в
         отдельный файл первые 601 байт, затем в отдельный файл записать следующие 57053 байта и
         оставшиеся 22494 байта записать в следующий файл. Если все сделано правильно, у вас должно получиться 3 файла.*/

            String file = "file.dat";
            byte[] bytes;
            try {
                bytes = Files.readAllBytes(Paths.get(file));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Path path = Paths.get("first.dat");
            Path path1 = Paths.get("second.dat");
            Path path2 = Paths.get("third.dat");
            System.out.println(bytes.length);

            byte[] bytes_1 = new byte[601];
            System.arraycopy(bytes, 0, bytes, 0, 601);
            try {
                Files.write(path, bytes_1);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("The first one is written");

            byte[] bytes_2 = new byte[57053];
            System.arraycopy(bytes, 601, bytes_2, 0, 57053);
            try {
                Files.write(path1, bytes_2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("The second one is written");

            byte[] bytes_3 = new byte[22494];
            System.arraycopy(bytes, 57653, bytes_3, 0, 22494);
            try {
                Files.write(path2, bytes_3);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("The third one is written");
    }
}
