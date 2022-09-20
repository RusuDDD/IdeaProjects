package homework.issue_3;

import java.util.Arrays;

public class Group {
    private String tittle;
    Students[] students;

    public Group(String tittle, Students[] students) {
        this.tittle = tittle;
        this.students = students;
    }

    public String getTittle() {
        return tittle;
    }

    public Students[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "tittle='" + tittle + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
