import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        List<Integer> qwe2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        qwe2.stream()
                //qwe2.parallelStream()

                .filter(i -> {
                    System.out.println("Point 1 " + i);
                    return i < 3;
                })
                .map(i -> {
                    System.out.println("Point 2 " + i);
                    return i * 10;
                })
                .forEach(s -> System.out.println("Point 3 " + s));

        List<Person> people = List.of(
                new Person("Jack", 10),
        new Person("Jack", 35),
        new Person("Marya", 23),
        new Person("Lisa", 15),
        new Person("Katya", 45));

        List<String> result = people.stream()
                .filter(person -> person.getAge() > 16)
                .map(person -> person.getName())
                .map(s -> s.length())
                .map(integer -> String.valueOf(integer))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
