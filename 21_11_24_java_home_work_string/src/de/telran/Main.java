package de.telran;

public class Main {

    public static void main(String[] args) {

        /*
        1. Написать метод, который принимает строку,
        а возвразает boolean - является ли строка
        палиндромом (игнорируя регистр).
        Пример: Алла. "А роза упала на лапу Азора" - не
        палиндром в рамках указанной задачи. Пробелы
        не игнорируются.
        (Использовать метод с урока по развороту строки)

        2.   Дана строка, состоящая только из слов и пробелов, и число N.
        Вернуть новую строку максимальной длины, состоящую
        из начала исходной строки, содержащую ТОЛЬКО слова
        целиком, при этом длины не
        больше чем N. Пример: (Hello world guys, 8 ) -> Hello.
        (Hello world guys, 12 ) -> Hello world.
        (Hello world guys, 16+ ) -> Hello world guys.

        3.  Написать метод, который принимает строку и паттерн,
        и возвращает количество вхождений паттерна в строку.
        Пример: ("Hello world", "l") -> 3
         */
        String string1 = new String("А роза упала на лапу Азора");
        String string2 = new String(new char[]{'M', 'y', ' ', 'f', 'a', 'v', 'o', 'r', 'i', 't', 'e', ' ', 'c', 'a', 'r'});
        String string3 = new String(new char[]{'A', ' ', 'р', 'o', 'з', 'a', ' ', 'y', 'п', 'a', 'л', 'a', ' ', 'н', 'a', ' ', 'л', 'a', 'п', 'y', ' ', 'A', 'з', 'o', 'p', 'a'});
    }

    static String isPolindrom(String str) {
        boolean n = true;
        char[] chars = new char[str.length()];
        for (int i = 0; i < chars.length; i++) {
            boolean n = chars[i] != str.charAt(chars.length - 1 - i);
           

        }

    }
}
