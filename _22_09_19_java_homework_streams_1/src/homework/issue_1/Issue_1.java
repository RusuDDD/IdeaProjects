package homework.issue_1;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Issue_1 {

//     Дана строка (для простоты можно считать, слова разделены одним пробелом
//     и строка не содержит знаков препинание и т.д.).
////    Используя стрим, получить map<String, Integer> где ключ – слово,
// значение – сколько раз это слово встречается в строке.

    public static void main(String[] args) {
        String str = "Vasea Misha Nirvana Vasea Aleona Larisa Misha";
        System.out.println(nameSame(str));

    }

    public static Map<String, Integer> nameSame(String str) {
        String[] strings = str.split(" ");
      return  Stream.of(strings).collect(Collectors.toMap(s -> s, i -> 1, Integer::sum));

    }
}
