package lesson_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Sergey", "m", 22, 3, 8.3);
        Student s2 = new Student("Nik", "m", 28, 2, 7.4);
        Student s3 = new Student("Elena", "w", 32, 1, 9.0);
        Student s4 = new Student("Petr", "m", 30, 4, 6.0);
        Student s5 = new Student("Marya", "w", 22, 5, 7.7);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);


        Map<Integer, List<Student>> mapGroupBy =
                studentList.stream().peek(el -> el.setName(el.getName().toUpperCase()))
                        .collect(Collectors.groupingBy(Student::getAge));
        for (Map.Entry<Integer, List<Student>> entry : mapGroupBy.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().toString());
        }
        Student s = studentList.stream()
                .map(el -> {
                    el.setName(el.getName().toUpperCase());
                    return el;
                }).filter(el -> el.getSex() == "m")
                .sorted(Comparator.comparingInt(Student::getAge))
                .findFirst().get();
        System.out.println(s);

        System.out.println("***************************");

        Student min = studentList.stream().min(Comparator.comparingInt(Student::getAge)).get();
        System.out.println(min);

        System.out.println("***************************");

        Student max = studentList.stream().max(Comparator.comparingInt(Student::getAge)).get();
        System.out.println(max);

        System.out.println("*********************************");

        studentList.stream()
                .filter(el->el.getAge()>20)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("**********************************");

       studentList.stream()
                .filter(el->el.getAge()>20)
                .skip(1)
                .limit(2)
                .forEach(System.out::println);

       System.out.println("**************************");

        int sum = studentList.stream().mapToInt(el -> el.getCourse()).sum();

        System.out.println("**************************");

        double avg = studentList.stream()
                .mapToInt(el -> el.getCourse())
                .average().getAsDouble();
        System.out.println(avg);

    }
}
