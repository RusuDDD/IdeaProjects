public class Student {
    String name;
    int tasksDone;

    public Student(String name, int tasksDone) {
        this.name = name;
        this.tasksDone = tasksDone;
    }

    public String getName() {
        return name;
    }

    public int getTasksDone() {
        return tasksDone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", tasksDone=" + tasksDone +
                '}';
    }
}
