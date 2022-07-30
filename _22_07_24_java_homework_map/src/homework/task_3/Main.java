package homework.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //3. Дан список Integer, каждое значение число от 1 до 12 (результат броска двух игральных костей).
        // В результате работы программы, необходимо сформировать отчет,
        //сколько раз выпало каждое число. Вывести результат в порядке возрастания.
        //{6,6,1,4,9,12,11,9,1,9} –{1->2, 4->1, 6->2, 9->3, 11->1, 12->1}
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(6);
        list.add(1);
        list.add(4);
        list.add(9);
        list.add(12);
        list.add(11);
        list.add(9);
        list.add(1);
        list.add(9);

        System.out.println(numberRepeat(list));
    }
    public static Map<Integer, Integer> numberRepeat(List<Integer> list) {
        Map<Integer, Integer> result = new TreeMap<>();
        for (Integer number : list) {
            if (result.get(number) != null) {
                int counter = result.get(number) + 1;
                result.put(number, counter);
            } else {
                result.put(number, 1);
            }
        }
        return result;
    }
}
