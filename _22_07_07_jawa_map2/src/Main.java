import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 1);

        System.out.println(map);
        Set<String> keySetMap = map.keySet();
        System.out.println(keySetMap);

        Collection<Integer> values = map.values();
        System.out.println(values);

        System.out.println();
        for (String s : map.keySet()) {
            System.out.println(s + map.get(s));
            System.out.println();
        }
// Map.Entry <String, Integer>
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
            System.out.println();
            System.out.println(entry.getKey()+entry.getValue());
        }
    }

}
