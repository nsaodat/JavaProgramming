package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {

    int []array = {1,2,3,4,5};

   array =  replaceElement(array,2,30);
        System.out.println(Arrays.toString(array)); // [1, 2, 30, 4, 5]
        System.out.println("_______________________________________");

        String [] array2 = {"Java","Python", "C++", "Ruby"};

      array2 = replaceElement(array2,2,"C#");

        System.out.println(Arrays.toString(array2)); // [Java, Python, C#, Ruby]


}

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
}

/*
	1. Replace Task:
		1.1 Create a method named replace that passes three parameters: integer array, integer index,
		integer newElement. The method replaces the element of the array at given index with the new element,
		 and returns the new array.
				Ex:
					arr = {1,2,3,4,5};

					replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


		1.2 Create the same functions for double arrays, char arrays, and String arrays
 */