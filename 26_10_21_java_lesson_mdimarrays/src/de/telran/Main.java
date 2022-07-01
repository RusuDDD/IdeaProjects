package de.telran;

public class Main {

    public static void main(String[] args) {
        int[][] dim2Array = new int[][]
                {
                        {1, 7, 3},
                        {-10, 18},
                        {2, 5, 18, 13}
                };
        System.out.println(dim2Array.length);// 3

        int[] secondSubarray = dim2Array[2];//{2, 5, 18 ,13}
        int secondSubArrayLenght = dim2Array[2].length;//secondSubArray.lenght
        int number = dim2Array[2][3];// 13

        int[][] dim2OtherArray = new int[10][];
        dim2OtherArray[0] = new int[]{3, 6, 1};
        dim2OtherArray[1] = secondSubarray;
        int[][] dim2YetAnotherArray = new int[10][4];//10 link and lenght4

        int[][][] dim3Array =
                {
                        {
                                {1, 7, 3},
                                {-10, 18},
                                {2, 5, 13}
                        },
                        {
                                {-11, 1},
                                {2, 5, 13}

                        }
                };
        System.out.println(dim3Array.length);//2
        System.out.println(dim3Array[0].length);//3
        System.out.println(dim3Array[0][2]);//4
        System.out.println(dim3Array[0][2][3]);//13

        int[][][] dim3OtherArray = new int[3][5][10];


        //Fill an 10x0 array with numbers from0 to99
        int[][] array10x10 = new int[10][10];
        for (int i = 0; i < array10x10.length; i++) {
            for (int j = 0; j < array10x10[i].length; j++) {
                array10x10[i][j] = i * 10 + j;
            }
        }
        System.out.println();
    }
}
