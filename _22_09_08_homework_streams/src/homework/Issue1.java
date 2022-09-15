package homework;

import java.util.List;
import java.util.stream.Collectors;

public class Issue1 {
    /*  1. Дан список Programmer(String name, String city, List<Task>  tasks). Каждый программист  имеет список задач Task
          (int Number, String description, String status, int daysInProcessing) . Сформировать лист из всех задач,
        которые относятся к программистам из Берлина, не завершены (т.е. имеют статус, отличный от «done») и висят в обработке более 5 дней.*/
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
        List<Task> taskList2 = List.of(task2, task4, task6);
        List<Task> taskList3 = List.of(task7, task8, task9);

        Programmer programmer = new Programmer("Blin", "Koln", taskList1);
        Programmer programmer1 = new Programmer("Mun", "Munchen", taskList2);
        Programmer programmer2 = new Programmer("Aliona", "Berlin", taskList3);

        List<Programmer> programmerList = List.of(programmer, programmer1, programmer2);

        System.out.println(issue1(programmerList));
    }

    public static List<Task> issue1(List<Programmer> plist) {
        List<Task> resList = plist.stream()
                .filter(s -> s != null
                        && s.getCity().equalsIgnoreCase("Berlin"))
                .flatMap(p -> p.getTasks().stream())
                .filter(s -> !s.getStatus().equalsIgnoreCase("done")
                        && s.getDaysInProcessing() > 5)
                .collect(Collectors.toList());
        return resList;
    }

}
