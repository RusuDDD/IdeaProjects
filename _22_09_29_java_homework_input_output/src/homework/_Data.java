package homework;

import java.io.*;

public class _Data {
    public static void main(String[] args) {
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("Test_1.bin"));
             DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("Test_1.bin"))) {

            dataOutputStream.writeBoolean(false);
            dataOutputStream.writeChar('A');
            dataOutputStream.writeInt(123);
            dataOutputStream.writeDouble(12.3);

            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readChar());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readDouble());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
