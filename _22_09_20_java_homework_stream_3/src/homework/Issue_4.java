package homework;

import java.util.stream.Stream;

public class Issue_4 {
    ////4. Почему код не отработает?
    public static void main(String[] args) {

        Stream str1 = Stream.of(1, 23, 24, 45, 2, 4, 4, 6, 77);
        System.out.println(str1.count());
        System.out.println(str1.distinct().count());

        // count is a terminal operation for streams, cannot be executed twice
    }
}


