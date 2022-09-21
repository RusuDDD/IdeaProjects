package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Issue_2 {
//отфильтровать студентов age>22 вывести на экран пропустить первого [есть метод для пропуска ]
public static void main(String[] args) {
    Student student1 = new Student("Masha", "Misioner", "W", 18, 5, 8.8);
    Student student2 = new Student("Tanea", "Monin", "W", 25, 5, 9.9);
    Student student3 = new Student("Aleona", "Trilin", "W", 26, 5, 8.0);
    Student student4 = new Student("Kristina", "Gonin", "W", 19, 5, 9.0);

    Student student5 = new Student("Grisha", "Lolic", "M", 20, 4, 7.0);
    Student student6 = new Student("Oleg", "Murca", "M", 24, 4, 7.1);
    Student student7 = new Student("Ivan", "Trindez", "M", 25, 4, 7.9);
    Student student8 = new Student("Stepan", "Trapkin", "M", 28, 4, 7.8);

    Student student9 = new Student("Irina", "Trotskii", "W", 29, 3, 7.6);
    Student student10 = new Student("Elena", "Dolbii", "W", 30, 3, 8.0);
    Student student11 = new Student("Andrei", "San", "M", 30, 3, 9.7);
    Student student12 = new Student("Evgenii", "Mofbeach", "M", 31, 3, 9.8);

    List<Student> studentList = new ArrayList<>();
    studentList.add(student1);
    studentList.add(student2);
    studentList.add(student3);
    studentList.add(student4);
    studentList.add(student5);
    studentList.add(student6);
    studentList.add(student7);
    studentList.add(student8);
    studentList.add(student9);
    studentList.add(student10);
    studentList.add(student11);
    studentList.add(student12);

    System.out.println(theFirstOne(studentList));
}

    public static List<Student> theFirstOne(List<Student> list) {
        return list.stream()
                .filter(s -> s.getAge() > 22).skip(1).collect(Collectors.toList());
    }
}
