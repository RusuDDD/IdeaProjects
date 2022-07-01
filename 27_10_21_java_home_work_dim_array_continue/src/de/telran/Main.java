package de.telran;

public class Main {

    public static void main(String[] args) {
        int[][] array = new int[][]
                {
                        {5, -5, 6, 9, 7},
                        {8, -6, 3, 7, 5},
                        {9, -6, 2, 7, 5},
                        {5, 8, 6, 2, 7}
                };
        System.out.println(numberSubarraysNotNegativeElements(array));
        //printarray2(array);

	/*

    3.написать ф-ю, которая ищет (возвращает) n-ое число Фибоначчи.

    4.Если номер кредита делится на 13, то его никто не выдает.
    Если он делится на 3, то его выдает Маша. Если номер кредита
     имеет остаток 1 от деления на 3, то Петя, если 2 - то Вася.
     Написать функцию, которая принимает номер последнего выданного кредита и
     распечатывает в консоль информацию о том, кто выдал какой кредит и еще
     количество выданных кредитов после этого. static void function(int creditId)

    5.(*) Написать сортировку выбором (Selection Sort)

	 */
    }
    /*1.Функция принимает двумерный массив и возвращает количество
     подмассивов (строк),
    в которых нет отрицательных элементов (continue с меткой).
    static int function (int [][] arr)*/

   /* static void printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    static void printarray2(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "\t");
        }
        System.out.println();
    }*/

    static boolean numberSubarraysNotNegativeElements(int[][] array) {
        //int res = 1;
        /*
                        {5, -5, 6, 9, 7},[0]
                        {8, -6, 3, 7, 5},[1]
                        {9, -6, 2, 7, 5},[2]
                        {5, 8, 6, 2, 7}  [3]
         */
        // outerFor:
        for (int i = 0; 1 < 4; i++) {
            for (int j = 0; 5 < 5; j++) {
                if (array[i][j] < 0) {
                    //continue outerFor;
                }
            }

        }
        return true;
    }
}
