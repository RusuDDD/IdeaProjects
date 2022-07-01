package de.telran;

public class Main {

    public static void main(String[] args) {

    // 5. написать метод, проверяющий образована ли строка сдвигом букв (abc->cab) cab -bca
    // 6.налисать метод, проверяющий являются ли одна строка анаграммой другой / женя ежня

        Main m =new Main();
        System.out.println(m.removeDublicateChar("aabb"));

    }

    // 1. переставить первую букву в конец строки (abcd -> bcda)
    public String firstToEnd(String str) {
        String str1 = str.substring(1);
        String str2 = str.substring(0,1);

        return  str1+str2;
    }

    // 2. переставить последнюю букву в начало строки (abcd-> dabc)
    public String lastToBegin(String str) {
        String str1 = str.substring(str.length() - 1);
        String str2 = str.substring(0, str.length() - 1);
        return str1 + str2;
    }

    // 3. написать метод, возвращающий массив сhar содержащий содержимое строки
    public char[] chars(String str) {
        return str.toCharArray();
    }
    // 4. удалить из строки повtoряющиеся буквы
    public String removeDublicateChar(String  string){
        char[] chars= string.toCharArray();
        String result="";
    for (int i = 0; i < chars.length; i++) {
        if (result.indexOf(chars[i])==-1)
            result+=chars[i];
    }
    return result;
}

}
