package homework.issue_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        : 1. "apple", "banana", "lemon", "orange" - даны такие слова
//преобразовать стрим из строк в мапу, причём ключом сделать первую букву соответствующего слова
//{a=apple, b=banana, l=lemon, o=orange}
        String s1 = "apple";
        String s2 = "bannana";
        String s3 = "lemon";
        String s4 = "orange";
        List<String> stringList = new ArrayList<>();
        stringList.add(s1);
        stringList.add(s2);
        stringList.add(s3);
        stringList.add(s4);

        System.out.println(stringList.stream().collect(Collectors.toMap(s -> s.charAt(0), s -> s)));

    }
}
