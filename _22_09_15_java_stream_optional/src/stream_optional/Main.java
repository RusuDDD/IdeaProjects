package stream_optional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {

//   1. //Дан List<Integer>. Необходимо найти значение элемента максимально близкого к некоторому заданному значению N.
    public static void main(String[] args) {
        List<Integer> integerList = List.of(5, 15, -9, 8, 10);
        System.out.println(maxElement(integerList, -6));
    }
    public static Integer maxElement(List<Integer> list, int date) {
        return list.stream()
                .min(Comparator.comparingInt(Integer -> Math.abs(Integer - date)))
                .orElse(null);
    }
}
class Main2 {
    public static void main(String[] args) {

////  2. Дана строка вида ключ1:значение1;ключ2:значение2;ключ1:значение2;ключ3:значение1 .....
//// Написать метод, который возвращает последнее значение заданного ключа.
////Например: "Jack:room 10;Nick:room 20;Jack:room 1;Mike:room3", "Jack" -> "room 1"
////Если в строке нет заданного ключа возвращается пустая строка.

        String stringValue = "Jack:room 10;Nick:room 20;Jack:room 1;Mike:room3";
        keyValue(stringValue, "Jack");
        keyValue(stringValue, "Jac");
        keyValue(stringValue, "Jacky");
        keyValue(stringValue, "Jack");
    }
    public static Optional<String> keyValue(String str, String key) {
        String[] strings= str.split(";");
        System.out.println(Arrays.stream(strings)
                .filter(s -> s.substring(0, s.indexOf(":")).equalsIgnoreCase(key))
                .reduce((el1, el2) -> el2));

        return Optional.empty();
    }
}
