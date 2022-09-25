package homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        //"src/main/java/WarAndPeace.txt это ссылка на какой либо текст.
        //      Необходимо пройти стримом по тексту написать метод который считает количество уникальных слов.
        //      long count = words.stream().distinct().count();
        //      И количество повторений long countWithRepeat =тут тоже будет стрим   *//*   тут обработать String contents  *//*
        //        System.out.println("Слов всего " + countWithRepeat);
        //        System.out.println("Уникальных слов  " + count);
        //        P.S. Используйте так же регулярные выражения.
        //  ********Нужно вывести каждое слово и количество его повторений одним стримом********
        //        */
        String contents = new String(Files.readAllBytes(Paths.get("src/homework/file.txt")));
        System.out.println(allrepeatWithKey(contents));
    }
    public static Map<String, Integer> allrepeatWithKey(String str) {
        return Arrays.stream(str.split("[\\s,]+"))
                .collect(Collectors.toMap(s -> s, i -> 1, Integer::sum));
    }
}
