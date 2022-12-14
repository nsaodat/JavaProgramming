package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAllSimilarElement {

    public static void main(String[] args) {

        int[] arr = {10, 10, 20, 20, 30, 40, 50, 30, 30, 30};

        arr = replaceAllSimilarElement(arr, 30, 300);
        System.out.println(Arrays.toString(arr));
        arr = replaceAllSimilarElement(arr, 300, 500);
        System.out.println(Arrays.toString(arr));
    }


    // the method replaces all the matching old values of the Array with the new value
    public static int[] replaceAllSimilarElement(int[] array, int oldValue, int newValue) {
// check each element in the array one by one. Once the elements are matching, assign a new element.
        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue) {
                array[i] = newValue;
            }

        }
        return array;
    }

    // the method replaces all the matching old values of the Array with the new value
    public static double[] replaceAllSimilarElement(double[] array, double oldValue, double newValue) {
// check each element in the array one by one. Once the elements are matching, assign a new element.
        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue) {
                array[i] = newValue;
            }

        }
        return array;
    }

    // the method replaces all the matching old values of the Array with the new value
    public static char[] replaceAllSimilarElement(char[] array, char oldValue, char newValue) {
// check each element in the array one by one. Once the elements are matching, assign a new element.
        for (char i = 0; i < array.length; i++) {

            if (array[i] == oldValue) {
                array[i] = newValue;
            }

        }
        return array;

    }

    // the method replaces all the matching old values of the Array with the new value
    public static String[] replaceAllSimilarElement(String[] array, String oldValue, String newValue) {
// check each element in the array one by one. Once the elements are matching, assign a new element.
        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(oldValue)) {
                array[i] = newValue;
            }

        }
        return array;
    }
}
/*

2. ReplaceAllSimilarElement Task:
		2.1 Create a method named replaceAll that passes three parameters: integer array, integer oldElement,
		 integer newElement. The method replaces all the element of the array that matching with the given old
		 element with the given new element, and returns the new array.
			Ex:
				arr = {10, 10, 20, 30, 40, 30, 30, 30};

				replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


		2.2 Create the same functions for double arrays, char arrays, and String arrays

 */