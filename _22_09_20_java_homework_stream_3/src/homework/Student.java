package homework;

public class Student {
    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private int course;
    private Double rate;

    public Student(String firstName, String lastName, String sex, int age, int course, Double rate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.rate = rate;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public int getCourse() {
        return course;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", rate=" + rate +
                '}';
    }
}
