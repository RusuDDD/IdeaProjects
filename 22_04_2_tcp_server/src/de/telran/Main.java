package de.telran;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    private final static int SERVER_PORT = 3000;

    public static void main(String... args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(SERVER_PORT);
        while (true) {

            Socket socket = serverSocket.accept();
            Runnable serverTask = new serverSocket(socket);
            new Thread(serverTask).start();

            System.out.println("After connection ");
        }
    }
}
