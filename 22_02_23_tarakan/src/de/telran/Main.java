package de.telran;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // tarakanie bega
// esti 10 tarakanov . im neabhodima probijati 10 cm , kajdii santimeter tarakana probegaet za ot 100 do 150 mils
    // tarakani begut adnovremena , neabhodima sostaviti
    // tablitsu probega v katoroi ukazana imea tarakana i ego resulitat
    public static void main(String[] args) throws InterruptedException {

        List<Score> scores = new ArrayList<>();

        List<Tarakan> tarakans = new ArrayList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            Tarakan tarakan = new Tarakan(100, 150, 10, startTime, "Tarakan" + i, scores);
            tarakans.add(tarakan);
        }
        for (Tarakan tarakan : tarakans) {
            tarakan.start();
        }
        for (Tarakan tarakan : tarakans) {
            tarakan.join();
        }
        System.out.println(scores);
    }
}
