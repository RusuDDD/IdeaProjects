import java.io.LineNumberReader;
import java.util.Objects;

public class Person {
    String name;
    int age;
    private final int hashCode;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        hashCode = calcHashCode();
    }

    private int calcHashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return name + " ( " + age + " ) ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return hashCode;
    }
}
