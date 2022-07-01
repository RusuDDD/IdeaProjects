package HomeWork;

import java.util.Locale;

public class HomeWorkTwo {
    public static void main(String[] args) {
        String sentence = "Entry permitted not allowed";
        String part1 = sentence.substring(0, 5);
        String part2 = sentence.substring(16, 27);
        String tittle1 = part1.toUpperCase();
        String tittle2 = part2.toUpperCase();
        char space = ' ';
        System.out.println(tittle1 + space + tittle2);
    }
}