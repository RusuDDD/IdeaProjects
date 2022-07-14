package exercises.hash_map_task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//1)    A Map<String, String> is given, if it has key 'a' and 'b' you need to create a new key 'ab' with the sum of
// of the values from keys 'a' and 'b'.
//Examples:
//mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
//mapAB({"a": "Hi"}) → {"a": "Hi"}
//mapAB({"b": "There"}) → {"b": "There"}

        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");

        mapAB(map);
        System.out.println(map);
    }
    public static void  mapAB(Map<String, String> map) {
        if (map != null && !map.isEmpty() && map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
    }
}

