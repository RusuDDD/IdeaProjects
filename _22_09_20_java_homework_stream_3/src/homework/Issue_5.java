package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Issue_5 {

    public static void main(String[] args) {
//   //Вывести имена всех студентов на всех факультетах.

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

        Faculty f1 = new Faculty("C++");
        Faculty f2 = new Faculty("Java");

        f1.addStOnF(student1);
        f1.addStOnF(student2);
        f1.addStOnF(student3);
        f2.addStOnF(student4);
        f2.addStOnF(student5);
        f2.addStOnF(student6);
        f2.addStOnF(student7);
        f1.addStOnF(student8);
        f1.addStOnF(student9);
        f1.addStOnF(student10);
        f1.addStOnF(student11);
        f1.addStOnF(student12);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);
        System.out.println(allStudentsOnFaculty(facultyList));



    }

    public static Map<String, List<Student>> allStudentsOnFaculty(List<Faculty> facultyList) {
        return facultyList.stream()
                .collect(Collectors.toMap(Faculty::getName, Faculty::getStudents));

    }
}