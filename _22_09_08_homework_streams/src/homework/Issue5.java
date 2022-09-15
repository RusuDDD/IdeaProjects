package homework;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Issue5 {
    //  5. Используя стримы, сформировать список из первых N чисел Fibonacci

    public static void main(String[] args) {
        System.out.println(fibanaci(13));
    }

    public static List<Integer> fibanaci(int n) {
        List<Integer> resList = Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                .limit(n)
                .map(f -> f[0])
                .collect(Collectors.toList());
        return resList;
    }

}