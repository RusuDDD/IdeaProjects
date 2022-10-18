package klassroom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> map = Stream.of("qwe", "qwer", "segaeh", ",", "y").collect(Collectors.toMap(
                s -> s.length(), s -> s,
                (s1,s2) ->s2
        ));
        System.out.println(map);

        // getFibanacciList(5) = {0,1,1,2,3}
        // getFibanacciList(10) = {0,1,1,2,3,5,8,13,21,344}
        // getFibanacciList(1) = {0}
        // getFibanacciList(0) = {}
        // getFibanacciList(-10) = {}

        System.out.println("Hello world !");
    }

    public static List<Integer> getFibanacciList(int n) {
        if (n <= 0) return List.of();
        Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[1] + arr[0]})
                .limit(n)
                .map(arr -> arr[0])
                .collect(Collectors.toList());
        return null;
    }

    @Test
    public void getFibanacciListTest(int n) {
        List<Integer> list5 = List.of(0, 1, 1, 2, 3);
        List<Integer> list10 = List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34);
        List<Integer> list1 = List.of(0);
        List<Integer> list0 = List.of();
        List<Integer> list_10 = List.of();

        Assertions.assertAll(
                () -> {
                    Assertions.assertIterableEquals(list5, getFibanacciList(5));
                },
                () -> {
                    Assertions.assertIterableEquals(list10, getFibanacciList(10));
                },
                () -> {
                    Assertions.assertIterableEquals(list1, getFibanacciList(1));
                },
                () -> {
                    Assertions.assertIterableEquals(list0, getFibanacciList(0));
                },
                () -> {
                    Assertions.assertIterableEquals(list_10, getFibanacciList(-10));
                },
                () -> {
                    int k = 12;
                    List<Integer> fibanacciList = getFibanacciList(k);
                    boolean flag = true;
                    for (int i = 2; i < fibanacciList.size() && flag; i++) {
                        flag = fibanacciList.get(i) == fibanacciList.get(i - 1) + fibanacciList.get(i - 2);
                    }
                    Assertions.assertTrue(flag);
                });
    }

//    public static List<Integer> getFibanacciList1(int n) {
//        if (n <= 0) return List.of();
//        Stream.generate(
//                        new Supplier<Integer>() {
//                            int n1 = 0;
//                            int n2 = 1;
//
//                            @Override
//                            public Integer get() {
//                                int fib = n1;
//                                n1 = n2;
//                                n2 += fib;
//                                return fib;
//                            }
//                        }
//                )
//                .limit(n).collect(Collectors.toList());
//        return null;
//    }
}
