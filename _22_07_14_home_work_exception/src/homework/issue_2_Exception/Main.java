package homework.issue_2_Exception;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
//         Допустим, Ваш метод должен получить массив int размером 10x10 элементов.
//         Необходимо, что бы ваш метод бросал IllegalArgumentException если размер
//         переданного массива некорректен или вместо массива пришел null.
        int[][] arrayElement = new int[10][10];
        int[][] arrayElement1 = null;
        int[][] arrayElement2 = new int[10][20];
        checkForException(arrayElement);
        checkForException(arrayElement1);
        checkForException(arrayElement2);
    }
    public static void checkForException(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    if (array == null)
                        throw new IllegalArgumentException();
                    if ((array[i].length >= 10) && (array[j].length >= 10))
                        throw new IllegalArgumentException();
                } catch (NullPointerException e) {
                    System.out.println("Array is null");
                } catch (Exception e) {
                    System.out.println("Array lenght isn't right");
                }
            }
        }
    }
}
