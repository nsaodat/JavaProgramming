package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {
        int []array = {1,2,2,3,6,55,5,5};
       int [] unique =  uniqueElements(array);
        System.out.println(Arrays.toString(unique));

        double [] arr1 = {1.1,1.1,1.1,2.2,2.2,5.6,3.3,0.3};
       double [] uniqueDouble = uniqueElements(arr1);
        System.out.println(Arrays.toString(uniqueDouble));


    }
// the method returns the unique elements of the Array as a new Array
public static int [] uniqueElements (int []array){

    int []result = {};
    for (int each : array) {
        if (ArraysUtility.frequencyOfElement(array,each) == 1){// if element count in the Array equals to 1
        result = ArraysUtility.addElements(result, each); // add each unique elements to result array
        }
    }

    return result;
}
// the method returns the unique elements of the Array as a new Array
    public static double [] uniqueElements (double []array){

        double []result = {};
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) == 1){// if element count in the Array equals to 1
                result = ArraysUtility.addElements(result, each); // add each unique elements to result array
            }
        }

        return result;
    }
    
// the method returns the unique elements of the Array as a new Array
    public static char [] uniqueElements (char []array){

        char []result = {};
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) == 1){// if element count in the Array equals to 1
                result = ArraysUtility.addElements(result, each); // add each unique elements to result array
            }
        }

        return result;
    }

// the method returns the unique elements of the Array as a new Array
    public static String [] uniqueElements (String []array){

        String []result = {};
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) == 1){// if element count in the Array equals to 1
                result = ArraysUtility.addElements(result, each); // add each unique elements to result array
            }
        }

        return result;
    }
}
