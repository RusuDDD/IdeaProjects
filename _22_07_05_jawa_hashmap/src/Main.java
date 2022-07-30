import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("One", Integer.valueOf(1));
        map.put("Tree", Integer.valueOf(3));

        Person p1 = new Person("Jack", "jack@gmail.com");
        Person p2 = new Person("John", "john@gmail.com");
        Person p3 = new Person("Nick", "nick@gmail.com");
        Person p4 = new Person("Jason", "jason@gmail.com");
        Person p5 = new Person("Marvin", "jason@gmail.com");

        Map<String, Person> map1= new HashMap<>();
        map1.put(p1.getEmail(), p1);
        map1.put(p2.getEmail(), p2);
        map1.put(p3.getEmail(), p3);
        map1.put(p4.getEmail(), p4);
        map1.put("jack2@gmail.com", p1);

        System.out.println(map1);
        System.out.println(map1.get("john@gmail.com"));
        System.out.println(map1.keySet());
        Set<String> keys = map1.keySet();
        Map<Integer, Person> map2 = new HashMap<>();
        map2.put(1, p1);
        map2.put(2, p2);
        map2.put(3, p3);
        map2.put(4, p4);
        System.out.println(map2);

        Map<Integer, List<Person>>

    }
}
