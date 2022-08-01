package homework.task_1;

public class Recursia {
    public static void main(String[] args) {

        //найти факториал целого числа n через рекурсию
        //Факториал натурального числа – это число, умноженное на "себя минус один" ,
        // затем на "себя минус два" , и так далее до 1 . Факториал n обозначается как n!
        System.out.println(factorialSearch(15));  // -> 5! = 1 * 2 *  3 *  4 *  5 = 120;
    }
    public static int factorialSearch(int n) {
        int res; //сам факториал
        if (n == 1) {
            return 1;   //условие выхода из рекурсии;
        }
        res = n * factorialSearch(n - 1);
        return res;
    }

}
