package homework.issue_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
// StandardCharsets.UTF_8); - "src/main/java/WarAndPease.txt это ссылка на какой либо текст.
//Необходимо прости стримом по тексту написать метод который считает количество уникальных слов
//long count = words.stream().distinct().count();И количество повторений
//long countWithRepeat =тут тоже будет стрим
//тут обработать String contents
//System.out.println("Слов всего " + countWithRepeat);
//System.out.println("Уникальных слов  " + count);
//P|S Используйте так же регулярные выражения. Это задание было на собеседование в EPAM

        String contents = new String(Files.readAllBytes(Paths.get("src/homework/issue_3/file.txt")));

        //  System.out.println(contents.length());

        System.out.println(count(contents));
        System.out.println(countWithRepeat(contents));
    }

    public static long count(String st) {
        return Arrays.stream(st.split("[\\s,]+")).distinct().count();
    }

    public static long countWithRepeat(String st) {
        return Arrays.stream(st.split("[\\s,]+")).count();
    }
}
