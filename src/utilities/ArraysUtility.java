package utilities;

import java.util.Arrays;

public class ArraysUtility {


    // the method that prints each integer of integer Array in separate lines
    public static void printEachElement(int[] array) {

        for (int each : array) {
            System.out.println(each);
        }

    }

    // the method that prints each double of double  Array in separate lines
    public static void printEachElement(double[] array) {

        for (double each : array) {
            System.out.println(each);

        }
    }

    // the method that prints each char of char Array in separate lines
    public static void printEachElement(char[] array) {

        for (char each : array) {
            System.out.println(each);

        }
    }

    // the method that prints each String of String Array in separate lines
    public static void printEachElement(String[] array) {

        for (String each : array) {
            System.out.println(each);
        }
    }
//__________________________________________________________________________

    // a method that returns the maximum number for integer Array
    public static int maxNumber(int[] numbers) {

        Arrays.sort(numbers);

        return numbers[numbers.length - 1];

    }

    // a method that returns the maximum number for double Array
    public static double maxNumber(double[] numbers) {

        Arrays.sort(numbers);

        return numbers[numbers.length - 1];
    }

    // a method that returns the minimum number from integer Array
    public static int minNumber(int[] numbers) {

        Arrays.sort(numbers);

        return numbers[0];

    }

    // a method that returns the minimum number from double Array
    public static double minNumber(double[] numbers) {

        Arrays.sort(numbers);

        return numbers[0];
    }
//__________________________________________________________________________

    // the method checks if the given integer is contained in the given Array. Returns boolean.   contains(int[], int element)
    public static boolean contains(int[] array, int element) {

        boolean result = false;

        for (int each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;

    }

    // the method checks if the given double is contained in the given Array. Returns boolean.   contains(double[], double element)
    public static boolean contains(double[] array, double element) {

        boolean result = false;

        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    // the method checks if the given char is contained in the given Array. Returns boolean.   contains(char[], char element)
    public static boolean contains(char[] array, char element) {

        boolean result = false;

        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    // the method checks if the given String is contained in the given Array. Returns boolean.   contains(String[], String element)

    public static boolean contains(String[] array, String element) {

        boolean result = false;

        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }
        }
        return result;
    }
//__________________________________________________________________________

    // the method adds the given element to Array,returns a new Array
    public static int[] addElements (int[] array, int element) {

        int[] newArray = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            newArray[i] = each;
            i++;
        }
        newArray[i] = element;
        return newArray;
    }

    // the method adds the given element to Array,returns a new Array
    public static double[] addElements (double[] array, double element) {
        double[] newArray = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            newArray[i] = each;
            i++;
        }
        newArray[i] = element;
        return newArray;
    }


    // the method adds the given element to Array,returns a new Array
    public static String[] addElements (String[] array, String element) {

        String[] result = new String[array.length + 1];
        int i = 0;

        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;

    }

    // the method adds the given element to Array,returns a new Array
    public static char[] addElements (char[] array, char element) {

        char[] result = new char[array.length + 1];
        int i = 0;

        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;


    }
//__________________________________________________________________________

    // the method returns the frequency of the given element from the given Array
    public static int frequencyOfElement(int[] array, int element) {

        int count = 0; // we need to count each time the given number is matching with the elements in the Array

        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    // the method returns the frequency of the given element from the given Array
    public static int frequencyOfElement(double[] array, double element) {

        int count = 0; // we need to count each time the given number is matching with the elements in the Array

        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    // the method returns the frequency of the given element from the given Array
    public static int frequencyOfElement(char[] array, char element) {

        int count = 0; // we need to count each time the given number is matching with the elements in the Array

        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    // the method returns the frequency of the given element from the given Array
    public static int frequencyOfElement(String[] array, String element) {

        int count = 0; // we need to count each time the given number is matching with the elements in the Array

        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
    }

    //__________________________________________________________________________

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

//__________________________________________________________________________

    //removes the index from the array, returns new array
    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int[] result = new int[array.length -1];

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static double[] removeElement(double[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        double[] result = new double[array.length -1];

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static char[] removeElement(char[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        char[] result = new char[array.length -1];

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static String[] removeElement(String[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        String[] result = new String[array.length -1];

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    //__________________________________________________________________________

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

    //__________________________________________________________________________

    //reverses the given array, returns a new array
    public static int[] reverse(int[] array){

        int[] result = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }


    //reverses the given array, returns a new array
    public static double[] reverse(double[] array){

        double[] result = new double[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }


    //reverses the given array, returns a new array
    public static char[] reverse(char[] array){

        char[] result = new char[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }


    //reverses the given array, returns a new array
    public static String[] reverse(String[] array){

        String[] result = new String[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }

   //__________________________________________________________________________

    // the method replaces the element of the array at given index number with the new element
//                                      {1,2,3,4,5},    200          30
    public static int [] replaceElement( int [] array, int index, int newElement){// if the user enters 200 for index number, then it is a defect because the index numbers go up to 4 in the example. Hence, if condition is created before the method execution

        if (index <0 || index > array.length-1){
            System.out.println("Invalid Index:" + index);
            System.exit(0);
        }
        array[index] = newElement;// take the new element entered by a user ->30  and assign it to index number of the given array
        return array;
    }

    // the method replaces the element of the array at given index number with the new element
    public static double [] replaceElement( double [] array, int index, double newElement){

        if (index <0 || index > array.length-1){
            System.out.println("Invalid Index:" + index);
            System.exit(0);
        }
        array[index] = newElement;// take the new element entered by a user and assign it to index number of the given array
        return array;
    }

    // the method replaces the element of the array at given index number with the new element
    public static String [] replaceElement( String [] array, int index, String newElement){

        if (index <0 || index > array.length-1){
            System.out.println("Invalid Index:" + index);
            System.exit(0);
        }
        array[index] = newElement;// take the new element entered by a user and assign it to index number of the given array
        return array;
    }

    // the method replaces the element of the array at given index number with the new element
    public static char [] replaceElement( char [] array, int index, char newElement){

        if (index <0 || index > array.length-1){
            System.out.println("Invalid Index:" + index);
            System.exit(0);
        }
        array[index] = newElement;// take the new element entered by a user and assign it to index number of the given array
        return array;
    }

    //__________________________________________________________________________

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

    //__________________________________________________________________________

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

//__________________________________________________________________________


    // the method passes three parameters. E.g. integer array, integer index, integer element.
// the method inserts the given element to the given index of the array and returns the new array
    public static int[] insert(int[] arr, int index, int element) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid inex: " + index);
            System.exit(0);
        }


        int[] result = new int[arr.length + 1];// new Array variable named result which had the length of the original array

        result[index] = element; // the new given element is being assigned to the given index of the new array
        int j = 0;

        for (int i = 0; i < arr.length; i++, j++) {
            if (i == index) { // if index number of the arr is equal to index number of the new element
                j++; // iterate j
            }
            result[j] = arr[i];
        }
        return result;
    }


    // the method passes three parameters and inserts the given element to the given index of the array and returns the new array
    public static double[] insert(double[] arr, int index, double element) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index: " + index);
        }


        double[] result = new double[arr.length + 1];// new Array variable named result which had the length of the original array

        result[index] = element; // the new given element is being assigned to the given index of the new array
        int j = 0;

        for (int i = 0; i < arr.length; i++, j++) {
            if (i == index) { // if index number of the arr is equal to index number of the new element
                j++; // iterate j
            }
            result[j] = arr[i];
        }
        return result;
    }


    // the method passes three parameters and inserts the given element to the given index of the array and returns the new array
    public static String[] insert(String[] arr, int index, String element) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index: " + index);
        }


        String[] result = new String[arr.length + 1];// new Array variable named result which had the length of the original array

        result[index] = element; // the new given element is being assigned to the given index of the new array
        int j = 0;

        for (int i = 0; i < arr.length; i++, j++) {
            if (i == index) { // if index number of the arr is equal to index number of the new element
                j++; // iterate j
            }
            result[j] = arr[i];
        }
        return result;
    }


    // the method passes three parameters and inserts the given element to the given index of the array and returns the new array
    public static char[] insert(char[] arr, int index, char element) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index: " + index);
        }

        char[] result = new char[arr.length + 1];// new Array variable named result which had the length of the original array

        result[index] = element; // the new given element is being assigned to the given index of the new array
        int j = 0;

        for (int i = 0; i < arr.length; i++, j++) {
            if (i == index) { // if index number of the arr is equal to index number of the new element
                j++; // iterate j
            }
            result[j] = arr[i];
        }
        return result;
    }

//__________________________________________________________________________

    // the method passes three parameters. E.g. integer array, integer i, integer j. the method SWAPS the element at index i with the element at index j, and returns the new array
    public static int[] swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;

    }

    // the method passes three parameters. the method SWAPS the element at index i with the element at index j, and returns the new array
    public static double[] swap(double[] array, int i, int j) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    // the method passes three parameters. the method SWAPS the element at index i with the element at index j, and returns the new array
    public static char[] swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
    // the method passes three parameters. the method SWAPS the element at index i with the element at index j, and returns the new array
    public static String[] swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }


//__________________________________________________________________________


}





