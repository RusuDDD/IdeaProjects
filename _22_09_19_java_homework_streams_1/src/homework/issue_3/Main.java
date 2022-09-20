package homework.issue_3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        /*    Дан список Group(String title,  Students[] students),
         Student(String firstName, String lastName, Double rate).
    Используя Stream получить map<String, Double>,
     где ключ ФИО студента в формате Иванов.И, значение – рейтинг.
    В map должны попасть первые 3 самых успевающих студента из каждой группы.
    В данной задаче, предполагается,
    что студентов-однофамильцев нет.*/
        List<Group> groups = List.of(
                new Group("Girls Math", new Students[]
                        {new Students("Masha", "Misioner", 8.8),
                                new Students("Tanea", "Monin", 9.9),
                                new Students("Aleona", "Trilin", 8.0),
                                new Students("Kristina", "Gonin", 9.0)}),
                new Group("Boys Math", new Students[]
                        {new Students("Grisha", "Lolic", 7.0),
                                new Students("Oleg", "Murca", 7.1),
                                new Students("Ivan", "Trindez", 7.9),
                                new Students("Stepan", "Trapkin", 7.8)}),
                new Group("Adults Math", new Students[]
                        {new Students("Irina", "Trotskii", 7.6),
                                new Students("Elena", "Dolbii", 8.0),
                                new Students("Andrei", "San", 9.7),
                                new Students("Evgenii", "Mofbeach", 9.8)}));
        System.out.println(theBestreeStudents(groups));
    }

    public static Map<String, Double> theBestreeStudents(List<Group> groupList) {
        return groupList.stream()
                .flatMap((s->Arrays.stream(s.getStudents())
                .sorted(Comparator.comparing(Students::getRate,Comparator.reverseOrder())).limit(3)))
                .collect(Collectors.toMap(s -> s.getLastName() + " " + s.shortName(), Students::getRate));
    }

}
