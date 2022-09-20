package homework.issue_2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        Дан список Person (String firstName, String lastName, int age)
//        используя Stream получить map<String, Integer>,
////  где ключ ФИО в формате Иванов.И, значение возраст.
        List<Person> personList = List.of(
                new Person("Grisha", "Grigorievici", 56),
                new Person("Tasha", "Tashinovici", 58),
                new Person("Sulea", "Saluleavici", 52),
                new Person("Linda", "Lindovivi", 48));

        System.out.println(stringIntegerMap(personList));
    }
    public static Map<String, Integer> stringIntegerMap(List<Person> people) {
        return people.stream().collect(Collectors.toMap(s -> s.getLasttName() + " " + s.nameWithpoint(), Person::getAge));
    }
}
