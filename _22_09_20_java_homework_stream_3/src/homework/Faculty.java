package homework;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<Student> students = new ArrayList<>();

    public Faculty(String name) {
        this.name = name;
    }

    public void addStOnF(Student s1) {
        students.add(s1);

    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
