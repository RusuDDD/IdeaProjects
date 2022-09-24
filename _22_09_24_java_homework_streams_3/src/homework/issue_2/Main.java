package homework.issue_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//"Linux", "Windows", "Mac" - даны такие слова
//Объединение нескольких строк в одну
        String s1 = "Linux";
        String s2 = "Windows";
        String s3 = "Mac";

        List<String> strings = new ArrayList<>();
        strings.add(s1);
        strings.add(s2);
        strings.add(s3);

        System.out.println(strings.stream().reduce(String::concat));

    }
}
