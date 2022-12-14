package day20_Array;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

      /*
        int[] numbers = {12, 60, 50, 3, 00, 45, 78, 98};

        System.out.println(numbers); // passing Array variable direcly will give a hashcode --> [I@2f7c7260

        System.out.println(Arrays.toString(numbers));//every time I print Array variable, not the specific element of the Array, if it is a single dimensional Array we must use toString method from Arrays utility class ---> [12, 60, 50, 3, 0, 45, 78, 98]

        System.out.println("===========================================================");

        Arrays.sort(numbers); // this method sorts the Array in ascending order

        System.out.println(Arrays.toString(numbers)); // hence, the next time after applying the method the elements of the Array are printed in ascending order---> [0, 3, 12, 45, 50, 60, 78, 98]
 */

        int [] nums = {1,2,3,4,5};


        System.out.println(Arrays.toString(nums));

        System.out.println("===============Arrays.sort(data structure name) ====================");

        int[] scores = {95,55,23,3,0,1,2};

        Arrays.sort(scores);// this method is only for sorting, not for printing

        System.out.println(Arrays.toString(scores));
        System.out.println("Min score: " + scores[0]); // 0
        System.out.println("Max score: " + scores[scores.length-1]);// 95

        System.out.println("===================================");

        String [] names = {"Gunay","Anna","Nafisa","Behrouz","Farooq"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names)); //--> [Anna, Behrouz, Farooq, Gunay, Nafisa]

        System.out.println("================ equals(array1, array2) ===================");
        //  equals(array1, array2): checks if two arrays are equal, returns boolean
        int[] arr1 = {1,2,3};
        int []arr2 = {1,3,2};

        boolean result1 = Arrays.equals(arr1, arr2);// comparing with equals(element1, element2) method

        System.out.println(result1); // false

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean result2 = Arrays.equals(arr1,arr2);

        System.out.println(result2);// true

        System.out.println("===================================");
        char[]ch1 = {'a','b','c'};
        char[]ch2 = {'b', 'c','a'};

        // check whether these chars are anagram "abc" , "bca" <-- are they built out of the same characters


        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println("anagram = " + anagram); // true, since we sorted both arrays individually by using sort method, then compared them by using equals method


    }

}

