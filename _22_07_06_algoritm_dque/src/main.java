import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class main {
    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>(new StringComparator());
        queue.add("we");
        queue.add("are");
        queue.add("studying");
        queue.add("the");
        queue.add("current");
        queue.add("interface");

        System.out.println(queue);

        Queue<Student> studentQueue = new PriorityQueue<>(new StudentComparator());

        Student student1 = new Student("Alex", 1.4);
        Student student2 = new Student("Masha", 3.6);
        Student student3 = new Student("Ivan", 0.9);

        studentQueue.add(student1);
        studentQueue.add(student2);
        studentQueue.add(student3);

        System.out.println(studentQueue);
    }
}
