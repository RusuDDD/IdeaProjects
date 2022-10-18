import java.io.*;
import java.net.URL;

public class Homework_1 {
//    находится файл file.dat .
//    Ваша задача скачать этот файл (кстати,
//    вы можете сделать это из Java программы,
//    но если сложно можно просто скачать).
//    Ваша программа  должна записать в
//    отдельный файл первые 601 байт,
//    затем в отдельный файл записать
//    следующие 57053 байта и оставшиеся
//    22494 байта записать в следующий файл.
//    Если все сделано правильно, у вас должно
//    получиться 3 файла.


    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new URL
                ("https://drive.google.com/file/d/1XZrLLuJlHK3n35NwQAnY9t1nSwZ3-piq/view?usp=sharing").openStream());
             FileOutputStream fos = new FileOutputStream("exampleFile.dat")) {
            byte[] dataBuffer = new byte[1024];
            int i;
            while ((i = bis.read(dataBuffer, 0, 1024)) != -1) {
                fos.write(dataBuffer, 0, i);
            }
            System.out.println("Done with example file download");
            fos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (java.io.FileInputStream file = new FileInputStream("exampleFile.dat");
             FileOutputStream fileOutputStream = new FileOutputStream("File_1.dat")) {

               byte[] dataBuffer = new byte[601];
            int a;
            while ((a = file.read(dataBuffer, 0, 601)) != -1) {
                fileOutputStream.write(dataBuffer, 0, a);
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
//        try(FileInputStream file = new FileInputStream("exampleFile.dat");
//            FileOutputStream fileOutPutStream = new FileOutputStream("File_1.dat")) {
//            for (int i = 0; i < 601; i++) {
//                fileOutPutStream.write(i);
//            }
//            System.out.println("Done with part1 creation");
//            filrOutPutStream.flush();

//        byte[] dataBuffer = new byte[1024];
//            int a;
//            while ((a=file.read(dataBuffer,0,601))!=-1) {
//                fileOutputStream.write(dataBuffer, 0, a);
//}
//            } catch (IOException ex) {
//            throw new RuntimeException(ex);
//        }

    }
}
