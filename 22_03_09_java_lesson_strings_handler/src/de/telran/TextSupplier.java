package de.telran;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.BlockingDeque;

public class TextSupplier implements Runnable {


    private final String filname;
    private final BlockingDeque<String> queue;

    public TextSupplier(String filname, BlockingDeque<String> queue) {
        this.filname = filname;
        this.queue = queue;
    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(filname))) {
        //TODO read lines from the file one by one and place then into the queue
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
