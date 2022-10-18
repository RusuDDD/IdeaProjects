package exercises;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        List<String> res = new ArrayList<>();

        try (java.io.BufferedReader reader = new java.io.BufferedReader(
                new FileReader("1.txt"))) {
            String words;
            while ((words = reader.readLine()) != null) {
                res.add(words);
            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(res);
        System.out.println(keys(res));
    }

    public static Map<String, Integer> keys(List<String> stringList) {
        int start = 0;
        return stringList.stream().collect(Collectors.
                groupingBy((String str) -> str.split(":")[0],
                        Collectors.mapping((String str) ->
                                        parseInt(str.split(":")[1]),
                                Collectors.reducing(start, Integer::sum))));
    }
}
