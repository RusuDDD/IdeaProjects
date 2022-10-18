import java.util.*;

public class Main {
    public static void main(String[] args) {




//У вас есть два класса Student{String name, int tasksDone}
// (поле tasksDone – количество решенных задач) и класс Group{String title, List<Student>}.

// Дан список Group. Необходимо получить список из 3 студентов, решивших наибольшее количество задач.
// Обратите внимание, один студент может посещать занятие в нескольких группах.
// Подсказка: необходимо использовать Set студентов.
        Student st1 = new Student("Ivan", 4);
        Student st2 = new Student("Nikita", 7);
        Student st3 = new Student("Alex", 6);
        Student st4 = new Student("Marina", 7);
        Student st5 = new Student("Anna", 5);
        Student st6 = new Student("Xenia", 8);
        Student st7 = new Student("Stepan", 3);
        Student st8 = new Student("Andrey", 8);
        Student st9 = new Student("Irina", 9);

        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(st1);
        studentList1.add(st3);
        studentList1.add(st2);
        studentList1.add(st5);
        studentList1.add(st4);
        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(st9);
        studentList2.add(st7);
        studentList2.add(st6);
        studentList2.add(st8);
        studentList2.add(st3);
        List<Student> studentList3 = new ArrayList<>();
        studentList3.add(st4);
        studentList3.add(st8);
        studentList3.add(st9);
        studentList3.add(st7);
        studentList3.add(st3);

        List<Student>allList = new ArrayList<Student>();
        allList.addAll(studentList1);
        allList.addAll(studentList2);
        allList.addAll(studentList3);

        Group group1 = new Group("Informatics", studentList1);
        Group group2 = new Group("Mathematics", studentList2);
        Group group3 = new Group("Programming", studentList3);

        List<Group> group = new ArrayList<>();
        group.add(group1);
        group.add(group2);
        group.add(group3);

    }
    public static Set<Group> bestStudents(List<Group> groupList) {

        List<Student> restStudent = new ArrayList<>();
        if (groupList.isEmpty()) return restStudent;
        TreeSet<Student> studentTreeSet = new TreeSet<>();

        for (Group gr : groupList) {
            groupTreeSet.addAll(gr.getStudentList())
        }
        return newset;
    }
}
