import com.sun.source.doctree.SeeTree;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<String> stringSet = new TreeSet<>();


        stringSet.add("qwe5");
        stringSet.add("qwe1");
        stringSet.add("qwe7");
        stringSet.add("qwe7");
        stringSet.add("qwe3");
        stringSet.add("qwe4");
        stringSet.add("qwe2");
        System.out.println(stringSet);

        Person p1 = new Person("Jack");
        Person p2 = new Person("Allen");
        Person p3 = new Person("Masha");
        TreeSet<Person> setPerson = new TreeSet<>(new C);
        setPerson.add(p1);
        setPerson.add(p2);
        setPerson.add(p3);
        setPerson.add(new Person("Kristina"));
        setPerson.add(new Person("Jack"));
        setPerson.add(new Person("Masha"));
        System.out.println(setPerson);

    }

}
