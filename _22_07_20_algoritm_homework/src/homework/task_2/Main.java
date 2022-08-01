package homework.task_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*  2. Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент, который будет
    находиться на k-й позиции в конечном отсортированном массиве.
    Массив 1 - 100 112 256 349 770
    Массив 2 - 72 86 113 119 265 445 892
    к = 7
    Вывод : 256
    Окончательный отсортированный массив -
    72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
    7-й элемент этого массива равен 256.  */
        int[] arr1 = new int[]{100, 112, 256, 349, 770};
        int[] arr2 = new int[]{72, 86, 113, 119, 265, 445, 892};
        task2(arr1, arr2, 7);
    }
    public static void task2(int[] leftArray, int[] rightArray, int k) {
        int leftlength = leftArray.length;
        int rightLenth = rightArray.length;

        int[] newArray = new int[leftArray.length + rightArray.length];

        int leftIndex = 0;
        int rightIndex = 0;
        int newArrIndex = 0;

        while (leftIndex < leftlength && rightIndex < rightLenth) {
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                newArray[newArrIndex] = leftArray[leftIndex];
                leftlength++;
                newArrIndex++;
            } else {
                newArray[newArrIndex] = rightArray[rightIndex];
                rightIndex++;
                newArrIndex++;
            }
            while (leftIndex < leftlength) {
                newArray[newArrIndex++] = leftArray[leftIndex++];
            }
            while (rightIndex < rightLenth) {
                newArray[newArrIndex++] = rightArray[rightIndex++];
            }
        }
        System.out.println(Arrays.toString(newArray));
        System.out.println(newArray[k]);
    }
}

