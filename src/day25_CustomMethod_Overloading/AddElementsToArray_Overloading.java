package day25_CustomMethod_Overloading;
import java.util.Arrays;
public class AddElementsToArray_Overloading {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6};  //7
numbers = addElements(numbers, 7);

        char[] chars = {'A', 'B', 'C', 'D'}; //'E'
chars = addElements(chars, 'E');


        String[] names = {"Ahmet", "Oleksandr", "Sinem", "Cihad"}; // "Layan"
names = addElements(names, "Layan");


        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(names));

    }

    /*1. create a return method called addInteger that can add an Integer after the  last index of an integer array

                     {1,2,3,4}, 5
                     new array ==> {1,2,3,4,5}


  */
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

    // 2. create a return method called addDouble that can add a double after the last index of a double array
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


// 3. create a return method called addString that can add a String after the last index of a String array

    public static String[] addElements (String[] array, String element) {

        String[] result = new String[array.length + 1];
        int i = 0;

        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;

    }

    // 4. create a return method called addChar that can add a char after last index of a char array
    public static char[] addElements (char[] array, char element) {

        char[] result = new char[array.length + 1];
        int i = 0;

        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;


    }

}



