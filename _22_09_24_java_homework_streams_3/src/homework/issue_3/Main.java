package homework.issue_3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
//        Path path = Paths.get(путьдофайла);
//Прочитать все строки текстового файла и объединить их в одну строкуп
        System.out.println(issue_3());
    }

    public static String issue_3() throws IOException {
        Path path = Paths.get("src/homework/issue_3/file.txt");
        try (Stream<String> res = Files.lines(path)) {
            return res.collect(Collectors.joining("\n"));
        }
    }

}