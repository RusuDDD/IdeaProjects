package de.telran;

public class Main {
    // Multithreading - ato vojmojnasti sostaviti programu
// takim obrazom cito operatii v nei obrabativaetsea paralelina
    // vjava mojna naceati 2mea sposabami
    //1 . ispolzoea claa thread (otveceeaet za patok)
    // 2. ispolizuea class runable(spomagatelinii class)
    public static void main(String[] args) throws InterruptedException {
        Thread hashThread = new ChrarThread('#');
        Thread startThread = new ChrarThread('*');

        hashThread.start();// her we open a new thread(patok)
        startThread.start();// her we open a new thread(patok)

        hashThread.join();// yastovleaet patok is katorova viyvan join (main thread),
        // jdati na atom meste , poka ne yakoncetsea patoc at katorova viyvan join (hashthread)
        startThread.join();
        System.out.println("end of main");

    }
}
