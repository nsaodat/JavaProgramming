package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {
        int [] arr = {1,2,5,4,6};

        arr = addInteger(arr,  8);
        System.out.println(Arrays.toString(arr));

        System.out.println("__________________________");

     double[] array2 = {8.5,79.5,56,98.9};
       array2 =  addDouble(array2,8.25);
        System.out.println(Arrays.toString (array2));

        System.out.println("__________________________");
        String [] names = {"Anna", "Maria", "Bek", "Adam"};

        names = addString(names,"Swift");
        System.out.println(Arrays.toString(names));
        names = addString(names,"Cassandra");
        System.out.println(Arrays.toString(names));

        System.out.println("__________________________");

        char []chars = {'A','B', 'C', 'D'};

        chars = addChar(chars,'E');
        System.out.println(Arrays.toString(chars));

    }
/*1. create a return method called addInteger that can add an Integer after the  last index of an integer array

					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}


 */
    public static int[] addInteger(int[] array, int element) {

        int[] newArray = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            newArray[i] = each;
            i++;
        }
        newArray[i] = element;
        return newArray;
    }

    // 2. create a return method called addDouble that can add a double after the last index of a double array
public static double [] addDouble(double[] array, double element){
        double [] newArray = new double[array.length +1];

      int i = 0;
    for (double each : array) {
       newArray [i] = each;
       i++;
    }
    newArray[i] = element;
    return newArray;
}


// 3. create a return method called addString that can add a String after the last index of a String array

public static String [] addString (String [] array, String element){

        String [] result = new String [array.length +1];
       int i = 0;

    for (String each : array) {
        result [i++] = each;
    }
    result [i] = element;
    return result;

}

// 4. create a return method called addChar that can add a char after last index of a char array
public static char [] addChar (char [] array, char element) {

    char[] result = new char[array.length + 1];
    int i = 0;

    for (char each : array) {
        result[i++] = each;
    }
    result[i] = element;
    return result;

}
}




