package homework.issue_1_Exception;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Есть List<String>. Все элементы в нем должны быть строки-целые числа вида “231”,
//        но некоторые данные повреждены (например, содержат символы). Необходимо преобразовать
//        данный список в List<Integer>. При этом вывести на экран детализированный
//        список «ошибок» т.е. в каких ячейках и какие значения не были преобразованы.
//Подсказка: необходимо использовать метод Integer.parseInt и обрабатывать его эксэпшены.

        List<String> stringsInt = new ArrayList<>();
        stringsInt.add("23113555sdg");
        stringsInt.add("45554561asdg");
        stringsInt.add("8945545");
        stringsInt.add("7822456");
        stringsInt.add("2557555");
        //System.out.println(stringsInt);

        ConverterInteger name = new ConverterInteger(stringsInt);
        name.convertTheStringToTheInteger(stringsInt);
        System.out.println(name);

    }
}

