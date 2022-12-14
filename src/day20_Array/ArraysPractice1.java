package day20_Array;

import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {
        // store elements: 10,20,50,70

        int[] numbers = {10, 20, 50, 70}; // Array size is set to 4

        System.out.println(Arrays.toString(numbers)); // [10, 20, 50, 70]

        int n = 1; // 1 represents index number
        System.out.println(numbers[n - 1]); // 10

        System.out.println("=================================================");
        // create a variable that can store 5 scores
        int[] scores = new int[5]; // <-- Since no knowledge what elements go inside the Array, we are only setting the size of the Array in this example

        scores[1] = 85;
        scores[scores.length-1] = 95;// last index
        scores[3] = 75;
        scores[0]= 65;
        scores[2]= 55;

        System.out.println(Arrays.toString(scores));// [0, 0, 0, 0, 0] <-- default value is given by default


        System.out.println("=================================================");


        // index number:            0         1        2          3       4       5       6        7

        String [] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August",

          //        8          9           10          11
                "September","October", "November", "December"}; //  0 ~ 12 (length-1) <-- index number is always less than a length

        for (int i = 0; i < monthNames.length; i++) {// i: represents index number of Arrays, starting from 0
            System.out.println(monthNames[i]);

        }

        System.out.println("=================================================");
        // How to access to the Array's last element to the first element

        for (int i = monthNames.length-1; i >= 0 ; i--) { // i: represents the index numbers of Array starting from last index and going backwards
            System.out.println(monthNames[i]);
        }


    }


    }

