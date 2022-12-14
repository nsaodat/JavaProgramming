package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        // Multidimensional Array is all about index numbers in order to retrieve the specific element or specific Array.
        //Multidimensional Array is a storage for the Arrays, and Array is a storage for the Elements.
//The N dimensional Array is a container for (N-1) dimensional arrays --> E.g. 2 dimensional Array is a container for 1 dimensional Array

        String [] group1 = {"Gulhan", "Yalchin", "John"};
        String [] group2 = {"Chris", "Ana", "Jonathan"};
        String [] group3 = {"Gulya", "Aigul", "Andy", "Alex"};

        System.out.println("_____declaring multidimensional Array when the size of the Arrays are unknown ______");

        // declaring multidimensional Array when the size of the Arrays are unknown
        String [][] groups = new String [3][]; // two-dimensional Array --> size of dimensional arrays means number of Arrays
        groups[0]=group1;
        groups [1] =group2;
        groups[2] = group3;
        System.out.println(Arrays.deepToString(groups));// [[Gulhan, Yalchin, John], [Chris, Ana, Jonathan], [Gulya, Aigul, Andy, Alex]]

        // use deepToString method to print out multidimensional Array

        System.out.println("_____declaring multidimensional Array when the size of the Arrays are known ______");
        /*
{1,2,3,4,5}
{6,7,8}
{9,10,11,12}

         */

        // 2 dimensional Array is a container for 1 dimensional Array

     // index of elements:  0 1 2 3 4     0 1 2     0  1 2  3
        int [][] arr2D = { {1,2,3,4,5},  {6,7,8},  {9,10,11,12} };
    // index of Arrays:          0           1            2


        System.out.println(Arrays.deepToString(arr2D)); // [[1, 2, 3, 4, 5], [6, 7, 8], [9, 10, 11, 12]] --> accessing the multidimensional Array as a whole:

        System.out.println(Arrays.toString(arr2D[0])); // [1, 2, 3, 4, 5] --> accessing a single dimensional Array within the multidimensional Array


        System.out.println(arr2D[1][2]); // 8 --> accessing the element in multidimensional Array


    }
}

