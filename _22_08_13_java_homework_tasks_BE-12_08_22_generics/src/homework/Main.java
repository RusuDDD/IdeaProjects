package homework;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList<Object> list = new CustomLinkedList<>();
        list.addToHead(7.7);
        list.addToHead(11.23);
        list.addToHead("yuyuy");
        list.printAll();

        System.out.println("---------");
        System.out.println(list.get(2));
        System.out.println("---------");
        list.removeByIndex(2);
        list.printAll();
        System.out.println("---------");
        System.out.println(list.size());
        System.out.println("---------");

        CustomLinkedList<String> strList = new CustomLinkedList<>();
        strList.addToHead("hello");
        strList.addToHead("generics");
        strList.addToHead("list");
        strList.printAll();
        System.out.println("---------");
        System.out.println(strList.get(2));
        System.out.println("---------");
        strList.removeByIndex(2);
        strList.printAll();
        System.out.println("---------");

        CustomLinkedList<Integer> strList2 = new CustomLinkedList<>();
        strList2.addToHead(765);
        strList2.addToHead(-8754);
        strList2.addToHead(88);
        strList2.printAll();
        System.out.println("---------");
        System.out.println(strList2.get(2));
        System.out.println("---------");
        strList2.removeByIndex(2);
        strList2.printAll();
    }

}
