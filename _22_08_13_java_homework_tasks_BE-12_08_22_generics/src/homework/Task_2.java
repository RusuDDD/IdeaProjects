package homework;

import java.util.ArrayList;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {


        List<Double> doubles = new ArrayList<>();
        doubles.add(6584.6548);
        doubles.add(-651.56);
        doubles.add(-84.65);
        System.out.println(maxElement(doubles));

        List<Integer> integers = new ArrayList<>();
        integers.add(15);
        integers.add(-9855);
        integers.add(654);
        System.out.println(maxElement(integers));

        List<Character> chars = new ArrayList<>();
        chars.add('D');
        chars.add('i');
        chars.add('m');
        System.out.println(maxElement(chars));

        List<Byte> bytes = new ArrayList<>();
        bytes.add((byte) -12);
        bytes.add((byte) 69);
        bytes.add((byte) -65);
        System.out.println(maxElement(bytes));

        List<Long> longs = new ArrayList<>();
        longs.add(-64531166413L);
        longs.add(8743213546846L);
        longs.add(6546513168486L);
        System.out.println(maxElement(longs));

        List<Float> floats = new ArrayList<>();
        floats.add(6541.654654561f);
        floats.add(-64.3521685f);
        floats.add(9.654684f);
        System.out.println(maxElement(floats));
    }

    public static <T extends Comparable<T>> T maxElement(List<T> list) {
        T max = list.get(0);
        for (T val : list) {
            if (val.compareTo(max) > 0)
                max = val;
        }
        return max;
    }

}
