package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArraysOfIntegers {
    public static void main(String[] args) {
        int[ ]arr1 = {1,2,3,4};
        int[] arr2 = {5,6};
         int [] arrays = new int [arr1.length + arr2.length];

         int i = 0;// temp variable to store index numbers

        for (int each : arr1) {
            arrays[i++] = each;
        }

        for (int each : arr2) {

            arrays[i++] =each;

        }

        System.out.println(Arrays.toString(arrays));




    }
}
/*
 1. write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}

		output
			arr3 = {1,2,3,4,5,6}

 */