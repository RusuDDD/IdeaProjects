package hash_practice;

import java.util.Objects;

public class Student {
    private String name;
    private String school;

    public Student(String name, String school) {
        this.name = name;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(school, student.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, school);
    }
}
