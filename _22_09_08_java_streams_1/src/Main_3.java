import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main_3 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        Optional<Integer> res1 = list.stream()
                .filter(i -> i < 0)
                .reduce((acc, i) -> acc + i);
        System.out.println(res1.map(i -> i * 2));

        System.out.println("-------------------------");
        Integer res2 = list.stream()
                .filter(i -> i < 0)
                .reduce(0, (acc, i) -> acc + i);
        System.out.println(res2);

    }
}
