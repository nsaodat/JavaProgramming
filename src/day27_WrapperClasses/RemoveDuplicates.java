package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int [] arr = {1,1,1,2,3,3,3,4,5,5,6,5,6,4,5,6};

      arr = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6]

        System.out.println("_________________________");

        String [] arr2 = {"Java","Java","Python", "Java"};

      arr2 =  removeDuplicates(arr2);
        System.out.println(Arrays.toString(arr2)); // [Java, Python]
    }



    // the method removes the duplicates from the given array, returns the new array
    public static int[]removeDuplicates(int [] array){

int []result = {};
        for (int each : array) {
           if (!ArraysUtility.contains(result,each)){
            result = ArraysUtility.addElements(result,each);
           }
        }
        return result;
    }

    // the method removes the duplicates from the given array, returns the new array
    public static double[]removeDuplicates(double[] array){

        double []result = {};
        for (double each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElements(result,each);
            }
        }
        return result;
    }

    // the method removes the duplicates from the given array, returns the new array
    public static char[]removeDuplicates(char [] array){

        char []result = {};
        for (char each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElements(result,each);
            }
        }
        return result;
    }

    // the method removes the duplicates from the given array, returns the new array
    public static String[]removeDuplicates(String [] array){

        String []result = {};
        for (String each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElements(result,each);
            }
        }
        return result;
    }
    
}
