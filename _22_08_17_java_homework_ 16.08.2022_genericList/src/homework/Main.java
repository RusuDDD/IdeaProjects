package homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//         Реализовать метод который из листа любого
//         типа удаляет дубликаты, при этом сохраняя порядок элементов.

        List<String> strings = new LinkedList<>();
        strings.add("hello");
        strings.add("hello");
        strings.add("generics");
        strings.add("list");
        strings.add("list");

        List<Integer> integers = new LinkedList<>();
        integers.add(765);
        integers.add(-8754);
        integers.add(-8754);
        integers.add(88);
        integers.add(88);

        List<Double> doubles = new LinkedList<>();
        doubles.add(7.76);
        doubles.add(-5.87);
        doubles.add(-5.87);
        doubles.add(6.88);
        doubles.add(6.88);

        List<Character> characters = new LinkedList<>();
        characters.add('a');
        characters.add('b');
        characters.add('b');
        characters.add('c');

        System.out.println(deleteRepeat(strings));
        System.out.println(deleteRepeat(integers));
        System.out.println(deleteRepeat(doubles));
        System.out.println(deleteRepeat(characters));
    }

    public static <T> List<T> deleteRepeat(List<T> list) {
        if (list.isEmpty() && list == null) {
            return list;
        }
        Set<T> lsd = new LinkedHashSet<>(list);
        return new ArrayList<>(lsd);
    }
}

