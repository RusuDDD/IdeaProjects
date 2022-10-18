package lesson_2;

public class Student {
    private String name;
    private String sex;
    private int age;
    private int course;
    private double v;

    public Student(String name, String sex, int age, int course, double v) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.v = v;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getV() {
        return v;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setV(double v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", v=" + v +
                '}';
    }
}
