package Homework_1;


import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    /* 1. Дан список строк вида "a:11", "b:22", "a:13".... Необходимо получить Map<String, List<Integer>>
    где ключ это символ, а значение - список цифровых значений соответствующих символу.
    Пример:   ("a:11", "b:22", "a:13", "c:20", "a:10") -> {a=[11, 13, 10], b=[22], c=[20]}  */
    public static void main(String[] args) {

        List<String> list = List.of("a:11", "b:22", "a:13", "c:20", "a:10");
        System.out.println(issue_1((list)));
    }
    public static Map<String, List<Integer>> issue_1(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(s -> s.split(":")[0], Collectors.mapping(s -> Integer.parseInt(s.split(":")[1]),
                                Collectors.toList())));
    }
}
class Issue_1_Testing {
    @Test
    void keysAndValuesToList() {
        List<String> list = List.of("a:11", "b:22", "a:13", "c:20", "a:10");
        Map<String, List<Integer>> map = Map.of("a", List.of(11, 13, 10),
                "b", List.of(22), "c", List.of(20));
        assertEquals(map, Main.issue_1(list));
    }
}