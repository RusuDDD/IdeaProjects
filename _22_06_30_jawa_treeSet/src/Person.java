import java.util.Comparator;

public class Person implements Comparable<Person> {

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;

    }
}
