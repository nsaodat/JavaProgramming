package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements2 {
    public static void main(String[] args) {
        int[] numbers = {100, 200, 300, 400, 500, 600};
        int [] numbers2 = removeElement(numbers,4);

        System.out.println(Arrays.toString(numbers2));

    }

    //removes the index from the array, returns new array
    public static int [] removeElement ( int [] array, int index){
        if (index <0 || index > array.length - 1){ // if index number is less than 0 and greater than the array length
            System.err.println("Invalid Index number: " + index);
            System.exit(0); // exit the whole programme after printing the error message above
        }
        int []result = {};// temp array variable


        for (int i = 0; i < array.length; i++) {
            if (i != index){ // i: represents index numbers for array named array . All indexes do not match with given index
                result = ArraysUtility.addElements(result, array[i]);

            }

        }
return result;
    }
}
