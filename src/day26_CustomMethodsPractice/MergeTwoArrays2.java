package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};

    int [] result = merge(arr1,arr2);
        System.out.println(Arrays.toString(result));



    }



    // merge the given two arrays and return a new array
    public static int[] merge(int[] array1, int[] array2) {


        int[] result = {};

        for (int each : array1) {
            result = ArraysUtility.addElements(result, each);
        }
        for (int each : array2) {
            result = ArraysUtility.addElements(result, each);
        }
        return result;
    }
    // merge the given two arrays and return a new array
    public static double[] merge(double[] array1, double[] array2) {


        double[] result = {};

        for (double each : array1) {
            result = ArraysUtility.addElements(result, each);
        }
        for (double each : array2) {
            result = ArraysUtility.addElements(result, each);
        }
        return result;
    }

    // merge the given two arrays and return a new array
    public static char[] merge(char[] array1, char[] array2) {


        char[] result = {};

        for (char each : array1) {
            result = ArraysUtility.addElements(result, each);
        }
        for (char each : array2) {
            result = ArraysUtility.addElements(result, each);
        }
        return result;
    }

    // merge the given two arrays and return a new array
    public static String[] merge(String[] array1, String[] array2) {


        String[] result = {};

        for (String each : array1) {
            result = ArraysUtility.addElements(result, each);
        }
        for (String each : array2) {
            result = ArraysUtility.addElements(result, each);
        }
        return result;
    }


}

