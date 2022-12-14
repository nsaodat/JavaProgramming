package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {


// index of elements:  0  1  2  3  4    0  1  2    0  1   2   3
     int[][] arr2D = {{1, 2, 3, 4, 5}, {6, 7, 8}, {9, 10, 11, 12}};
        // index of Arrays:     0           1              2

        for (int[] each1D : arr2D) {
            // System.out.println(Arrays.toString(each1D)); --> prints 1D Arrays
            for (int eachElement : each1D) {
                System.out.print(eachElement + " ");// --> prints the elements from 1D Arrays
            }
            System.out.println();
        }


}
}
