import java.security.PKCS12Attribute;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Person p1 = new Person("Vasya0", 25);
        Person p2 = new Person("Vasya1", 27);
        Person p3 = new Person("Vasya2", 35);
        Person p4 = new Person("Vasya3", 50);

        Set<Person> people = new HashSet<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        System.out.println(people);
        System.out.println("Vasya2 in set: " + people.contains(p2));
        System.out.println("hashcode Vasya2: " + p2.hashCode());
        p2.age = 28;
        System.out.println(people);
        System.out.println("Vasya2 in set: " + people.contains(p2));
        System.out.println("hashcode Vasya2: " + p2.hashCode());
    }
}

