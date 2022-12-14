package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt(); //whatever number the User enters will be the size of the Array

        if (length <= 0) {
            System.out.println("Invalid Entry");
            System.exit(0); // exit the whole program if invalid entry
        }

        int[] numbers = new int[length];
        // suppose the user enters 10 for 10 times entry of numbers. How can we ask the user for 10 times and store in the Array variable

        for (int i = 0; i < length; i++) { // length: represents whatever the user enters
            System.out.println("Enter a number"); // the number of statement print will depend on what user said initially

            numbers[i] = scan.nextInt();// each input provided by the user during each execution of the loop,  will be assigned to the Array named numbers starting from index number 0

        }
        System.out.println(Arrays.toString(numbers));
scan.close();
    }

}






