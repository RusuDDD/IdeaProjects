package de.telran;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[][] array = new int[][]
                {
                        {2, 8, 6, 56, -8, 5},
                        {8, 6, 3, 4, 5}
                };

        int[] arrai1 = {5, 8, 9, 6, 8, 7};

        System.out.println(findIndexElements(arrai1, 1));

        //System.out.println(findTheSameElementsArray(arrai1, 2));
        System.out.println(findNrowsSubarrays(array, 1));

        findBumerang(array);
        findSumSubArray(array);

    }

    //  1. найти индекс элемента массива
    static int findIndexElements(int[] array, int n) {
        if (array.length == 0) return -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) return i;
        }
        return -1;

    }

    //2. написать метод ищущий повторяющиеся значения массива целых чисел
    static void findTheSameElementsArray(int[] array, int n) {
        int sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j + 1 < array.length; j++) {
                if ((array[i] == array[j]))
                    System.out.println("the samne " + array[j]);
            }
        }
    }

    // 3. Пусть в маасиве целых чисел есть некое число n . написать метод, проверяющий
    // равна ли сумма повторений этого числа числу m. Пример равна ли сумма повторений
    // 10 числу 30.  т.е. встречается ли 10 3 раза.
    static boolean ifSuOfNEqualsM(int[] array, int n, int m) {
        int tempsum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                tempsum += n;
            }
        }
        return tempsum == m;
    }

    // 4.Найти сумму всех значкеий n строки/подмассива двумерного массива.
    // (например 2 подмассива)
    static int findNrowsSubarrays(int[][] array, int n) {
        int sumarray = 0;
        for (int i = 0; i < array[n].length; i++) {
            sumarray += array[n][i];
        }
        return sumarray;
    }

    // 5.вывести на экран все значения двумерного массива
    static void findBumerang(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // 6.вывести на экран номер строки(подмассива) сумма всех элементов которого равна нулю
    static void findSumSubArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum == 0)
                System.out.print(i + "\t");
        }
    }
}
