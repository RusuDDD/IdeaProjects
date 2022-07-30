package homework.task_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        1.  	Дан отсортированный лист Integer. Необходимо удалить из него все дубликаты.
//{6,6,8,9,14,15,15,15,20} -> {6,8,9,14,15,20}
        List<Integer> dublicateNumber = new ArrayList<>();
        dublicateNumber.add(6);
        dublicateNumber.add(6);
        dublicateNumber.add(8);
        dublicateNumber.add(9);
        dublicateNumber.add(14);
        dublicateNumber.add(15);
        dublicateNumber.add(15);
        dublicateNumber.add(15);
        dublicateNumber.add(20);
        System.out.println(deleteDublicate(dublicateNumber));
    }
    public static Set<Integer> deleteDublicate(List<Integer> list) {
        Set<Integer> integers = new TreeSet<>();
        if (list.isEmpty() && list == null) {
            return integers;
        } else {
            integers = new TreeSet<>(list);
        }
        return integers;
    }
}
