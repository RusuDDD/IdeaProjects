package homework.issue_2;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lasttName, int age) {
        this.firstName = firstName;
        this.lastName = lasttName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLasttName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lasttName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public String nameWithpoint() {
        return getFirstName().substring(0, 1) + ".";
    }
}
