package homework;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Issue4 {
    /*  4. Дан список строк «Иванов Иван Иванович: 645» Сформировать отсортированный по числовому полю список строк вида:
     «645:Иванов И.И.»,
    при этом отобрать только те строки, где числовое поле больше 500.*/
    public static void main(String[] args) {

        String string1 = "Bilan Dimilan Dimilovici: 601";
        String string2 = "Bilan Dimilan Dimilovici: 602";
        String string3 = "Bilan Dimilan Dimilovici: 525";
        String string4 = "Bilan Dimilan Dimilovici: 356";
        String string5 = "Bilan Dimilan Dimilovici: 258";

        List<String> stringList = List.of(string1, string2, string3, string4, string5);

        System.out.println(issue4(stringList));
    }

    public static List<String> issue4(List<String> namesList) {
        List<String> resList = namesList.stream()
                .map(str -> str.split(" "))
                .filter(str -> Integer.parseInt(str[str.length - 1]) > 500)
                .sorted(Comparator.comparingInt(str -> Integer.parseInt(str[str.length - 1])))
                .map(str -> str[str.length - 1] + ":" + str[0] + " "
                        + str[1].charAt(0) + "." + str[2].charAt(0) + ".")
                .collect(Collectors.toList());
        return resList;
    }
}

