package day22_MultiDimensionalArray;

public class IterationOfMultiDimensionalArrays2 {
    public static void main(String[] args) {


   // index of elements:  0  1  2  3  4    0  1  2    0  1   2   3
        int[][] arr2D = {{1, 2, 3, 4, 5}, {6, 7, 8}, {9, 10, 11, 12}};
        // index of Arrays:     0           1                2

                /*
task1:

9 10 11 12
6 7 8
1 2 3 4 5

 */
        for (int i = arr2D.length - 1; i >= 0; i--) {// outer loop --> i: index number of 1D arrays starting from last index to 0


            for (int j = 0; j < arr2D[i].length; j++) {// inner loop --> j: index number of elements starting from 0 to last index

                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("_____________________________________________");
 /*
 task2:

5 4 3 2 1
8 7 6
12 11 10 9

         */
        for (int i = 0; i < arr2D.length; i++) {// outer loop --> i: indexes of each 1D Array starting from 0

            for (int j = arr2D[i].length - 1; j >= 0; j--) {// inner loop --> j: indexes of each element starting from last index and going backwards
                System.out.print(arr2D[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("_____________________________________________");
/*
task3:

12 11 10 9
 8 7 6
 5 4 3 2 1
 */
        for (int i = arr2D.length - 1; i >= 0; i--) { //outer loop --> i: indexes of each 1D Array starting from last index going backwards
            for (int j = arr2D[i].length - 1; j >= 0; j--) { // inner loop --> j: indexes of each element starting from last index and going backwards
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

    }
}

