import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Given a List . Implement a method that will remove all adjacent identical characters, leaving only one.
        //Дан список. Реализуйте метод, который удалит все
        // соседние одинаковые символы, оставив только один.
        //For example: {a,b,c,c,b,a,a,a,f} -> {a,,b,c,a,f}

        LinkedList<String> array = new LinkedList<>();
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("c");
        array.add("b");
        array.add("a");
        array.add("a");
        array.add("a");
        array.add("f");
        System.out.println(array);
        System.out.println(removeIdenticalChars(array));
        //  -> [null,null, a, b, c, c, b, a, a, a, f, null]
    }

    public static LinkedList removeIdenticalChars(LinkedList<String> array) { //длина входящего Листа = 9;

        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i).equals(array.get(i + 1))) {
                array.remove(i);
                i--;
            }
        }
        LinkedList<String> temp = new LinkedList<>();
        for (int i = 2; i < array.size()-2; i++) {
            temp.add(array.get(i));
        }
        return temp;
    }
//    List<Character> temp = Arrays.asList(new Character[array.size() + 4]); // длина нового пустого списка = 11;
//        for (int i = 0; i < array.size(); i++) {
//            temp.set(i + 2, array.get(i)); }         //  -> [null, a, b, c, c, b, a, a, a, f, null]
}



