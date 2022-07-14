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
        stringsInt.add("555sdg");
        stringsInt.add("561asdg");
        stringsInt.add("545");
        stringsInt.add("456");
        stringsInt.add("555");


        ConverterInteger name = new ConverterInteger(stringsInt);
        name.convertTheStringToTheInteger(stringsInt);


    }
}

