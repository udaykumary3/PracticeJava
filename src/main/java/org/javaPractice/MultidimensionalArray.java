package org.javaPractice;

public class MultidimensionalArray {
    /*
    8 5 6
    4 7 2
    1 5 3
     */

    public static void main(String[] args) {
        MultidimensionalArray m = new MultidimensionalArray();
        m.smallest();
//        int match [][] = new int[3][3];
//        match [0][0] = 8;
        int mat[][] = {{8, 5, 6}, {4, 7, 2}, {1, 5, 3}};
        int min = mat[0][0];
//        System.out.println("length of multiArray is "+mat.length);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] < min) {
                    min = mat[i][j];
                }
            }
        }
//        System.out.println("Minimum value in matrix is " + min);
    }

    /*
    2 4 5
    3 0 7
    1 2 9
     */

    public void smallest() {

        int[][] mate = {{2, 4, 5}, {3, 0, 7}, {1, 2, 9}};
        int mins = mate[0][0];

        int minColumn = 0;
        for (int i = 0; i < mate.length; i++) {
            for (int j = 0; j < mate.length; j++) {
                if (mate[i][j] < mins) {
                    mins = mate[i][j];
                    minColumn = j;
                }
            }
        }
        int k = 0;
        int max = mate[0][minColumn];
        while (k < 3) {
            if (mate[k][minColumn] > max) {
                max = mate[k][minColumn];
            }
            k++;
        }
        System.out.println("max value is " + max);

    }
}