import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//        Given two lists of String. Implement the method that
//        returns a set of strings that are present in both lists.

        String a1 = new String("70123");
        String a2 = new String("70145623");
        String a3 = new String("50123");
        String a4 = new String("90123");

        String a5 = new String("01823");
        String a6 = new String("06123");
        String a7 = new String("70123");
        String a8 = new String("70145623");

        List<String> stringList1 = new ArrayList<>();
        stringList1.add(a1);
        stringList1.add(a2);
        stringList1.add(a3);
        stringList1.add(a4);

        List<String> stringList2 = new ArrayList<>();
        stringList2.add(a5);
        stringList2.add(a6);
        stringList2.add(a7);
        stringList2.add(a8);

        System.out.println(task(stringList1, stringList2));
        }
    public static Set<String> task(List<String> list1, List<String> list2) {
        Set<String> theSameElements = new HashSet<>();
        for (String s:list1) {
            for (String v : list2) {
                if (v.contains(s)) {
                    theSameElements.add(s);
                    theSameElements.add(v);
                }
            }
        }
        return  theSameElements;
    }
}
