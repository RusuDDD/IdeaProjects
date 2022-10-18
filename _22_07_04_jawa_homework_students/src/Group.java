import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;
import java.util.List;

public class Group implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {

         return Integer.compare(s1.getTasksDone() - s2.getTasksDone(), 0);
    }

    String title;
    List<Student> studentList;

    public Group(String title, List<Student> studentList) {
        this.title = title;
        this.studentList = studentList;
    }

    public String getTitle() {
        return title;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "Group{" +
                "title='" + title + '\'' +
                ", studentList=" + studentList +
                '}' + System.lineSeparator();
    }
}
