package homework.task_6;

import java.util.*;

public class Main {
    //6. Дана  map <Character, Set<String>> где значение – список строк начинающихся на букву, которая является ключом.
    // Увы, исходный map содержи ошибки.
    //Несколько строк записаны в неправильные ключи. Написать метод, который скорректирует map.
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("anaconda");
        set1.add("ananas");
        Set<String> set2 = new HashSet<>();
        set2.add("buratina");
        set2.add("bbiblioteka");
        Set<String> set3 = new HashSet<>();
        set3.add("gagarin");
        set3.add("dodgers");
        set3.add("citroen");
        set3.add("celica");
        Map<Character, Set<String>> setMap = new HashMap<>();
        setMap.put('a', set1);
        setMap.put('b', set2);
        setMap.put('c', set3);

        System.out.println(setMap);
        correction(setMap);
        System.out.println(setMap);
    }
    public static void correction(Map<Character, Set<String>> wrongMap) {

        for (Map.Entry<Character, Set<String>> entry : wrongMap.entrySet()) {
            setCheck(entry.getKey(), entry.getValue());
        }
    }
    public static void setCheck(Character ch, Set<String> set) {
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().charAt(0) != ch) {
                iterator.remove();
            }
        }
    }
}
