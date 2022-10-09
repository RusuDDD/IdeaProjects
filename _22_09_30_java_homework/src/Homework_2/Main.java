package Homework_2;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    /*2. Дан список выплат в виде списка строк: "Jack:1110.00", "Nick:220.50", "Jack:1300.20"....
   Необходимо получить Map<String, Double> где ключ это имя, а значение - сумма выплат.
   Пример:  ("Jack:1110.00", "Nick:220.50", "Jack:1300.20") -> {Nick=220.5, Jack=2410.2}*/
    public static void main(String[] args) {
        List<String> list = List.of("Jack:1110.00", "Nick:220.50", "Jack:1300.20");

        System.out.println(issue_2(list));
    }

    public static Map<String, Double> issue_2(List<String> list) {
        double start = 0.0;
        return list.stream().collect(Collectors.
                groupingBy((String s) -> s.split(":")[0],
                        Collectors.mapping((String str) -> Double.
                                        parseDouble(str.split(":")[1]),
                                Collectors.reducing(start, Double::sum))));
    }

}

class Issue_2Testing {
    @Test
    void keysAndValuesToList_1() {
        List<String> list = List.of("Jack:1110.00", "Nick:220.50", "Jack:1300.20");
        Map<String, Double> map = Map.of("Nick", 220.5, "Jack", 2410.2);
        assertEquals(map, Main.issue_2(list));
    }
}

