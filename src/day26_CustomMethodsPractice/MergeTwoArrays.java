package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int []arr1 = { 1 ,2,3,4,5,6};
        int [] arr2 = { 5,8,9,6,4,5,55,6};

      int []arr3 =  merge(arr1,arr2);
        System.out.println(Arrays.toString(arr3));

    }


    // merge the given two arrays and return a new array
    public static int[] merge(int[] array1, int[] array2) {
   int [] result = new int[array1.length + array2.length];
 int i = 0; // i: represents an index numbers of elements in array variable named result

        for (int each : array1) {
            result[i++] = each;
        }

        for (int each : array2) {
          result[i++] =  each;
        }
        return result;
    }
    }




