package homework.task_9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
 //  Дано целое число n (0<n<8). Требуется вывести все правильные скобочные последовательности длины 2 n.
 //  В задаче используются только круглые скобки.
 //2 –> (()) , ()()
 //3 -> ((())), (()()), (())(), ()(()), ()()()
        ArrayList<String> list = parenthesesGenerating(3);
        System.out.println(list);
        System.out.println(list.size());
    }
    public static void recursived(ArrayList<String> list, int left, int right, char[] str, int index) {
        if (left < 0 || right < left) return;

        if (left == 0 && right == 0) {
            list.add(String.copyValueOf(str));
        } else {
            str[index] = '(';
            recursived(list, left - 1, right, str, index + 1);

            str[index] = ')';
            recursived(list, left, right - 1, str, index + 1);
        }
    }
    public static ArrayList<String> parenthesesGenerating (int count){
        char[] str = new char[count * 2];
        ArrayList<String> list = new ArrayList<>();
        recursived(list, count, count, str, 0);
        return list;
    }
}
