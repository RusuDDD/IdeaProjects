package homework.task_8;

public class Person implements Comparable<Person> {
    private String name;
    private MyDate birthday;

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(getBirthday().getDay(),o.birthday.getYear());
    }
}
