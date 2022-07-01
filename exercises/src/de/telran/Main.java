package de.telran;

public class Main {

    public static void main(String[] args) {
        tast12("papamamadociotezsin", 4, 8);

    }
    //14. Реализовать метод, который возвращает часть заданной строки,
    // начиная с позиции start,
    //заканчивая позицией finish. (разбирали в классе,
    // но можно реализовать самостоятельно).
    //Например: substring(“let’s talk about java”, 7,20) -> “talk about ja”
    public static void tast12(String str, int start, int finish) {
        String res = "";

        for (int i = start; i < finish; i++) {
            res += str.charAt(i);
        }
        System.out.println(res);

    }

}
