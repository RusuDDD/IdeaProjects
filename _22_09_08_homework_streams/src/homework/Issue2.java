package homework;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Issue2 {
    /*  2. Дан список Programmer(String name, String city, List<Task>  tasks). Каждый программист
    имеет список задач Task (int Number, String description, String status, int daysInProcessing).
              Сформировать лист из десяти задач которые дольше всего находятся в работе.*/
    public static void main(String[] args) {
        Task task1 = new Task(1001, "erfyjer'''dsfbwdefbkwebf", "done", 9);
        Task task2 = new Task(1002, "y6t7u", "undone", 4);
        Task task3 = new Task(1003, "rty", "done", 8);
        Task task4 = new Task(1004, "rty", "undone", 3);
        Task task5 = new Task(1005, "tyk", "done", 7);
        Task task6 = new Task(1006, "gjk,", "undone", 4);
        Task task7 = new Task(1007, "yui", "done", 8);
        Task task8 = new Task(1008, "tuil", "undone", 10);
        Task task9 = new Task(10209, "rtyuk", "undone", 6);


        List<Task> taskList1 = List.of(task1, task3, task5);
        List<Task> taskList2 = List.of(task2, task4, task6, task7);
        List<Task> taskList3 = List.of(task7, task8, task9, task2);

        Programmer programmer = new Programmer("Blin", "Koln", taskList1);
        Programmer programmer1 = new Programmer("Mun", "Munchen", taskList2);
        Programmer programmer2 = new Programmer("Aliona", "Berlin", taskList3);

        List<Programmer> programmerList = List.of(programmer, programmer1, programmer2);

        System.out.println(issue2(programmerList, 10));

    }

    public static List<Task> issue2(List<Programmer> plist, int limitNum) {
        List<Task> resList = plist.stream()
                .filter(s -> s != null)
                .flatMap(p -> p.getTasks().stream())
                .sorted(Comparator.comparingInt(Task::getDaysInProcessing).reversed())
                .limit(limitNum)
                .collect(Collectors.toList());
        return resList;
    }

}