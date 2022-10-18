import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main_2 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);

        System.out.println(map);
        System.out.println(map.keySet());
        Set<String> keySet = map.keySet();
        System.out.println(keySet);

        Collection<Integer> values = map.values();
        System.out.println(values);

        for (String s : map.keySet()) {
            System.out.println(map.get(s));
            System.out.println("key : " + s + "value: " + map.get(s));
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("Map.Entry : " + entry + " : ");
            System.out.println("key : " + entry.getKey() + " value" + entry.getValue());
            entry.setValue(entry.getValue() + 10);

        }
        System.out.println(map);
    }
}
