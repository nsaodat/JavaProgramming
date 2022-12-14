package day15_ForLoops;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        int minNum = 2147483647; // this condition defines any number entered by the User will be smaller than the temporary value we have given. It is the most maximum number integer dataType can have. Soon the user enters the numbers our code will allow to store the minimum number and return. Remember: Any number that User enters will be less than the value given in temporary variable

        Scanner scan = new Scanner(System.in); // creating the Scanner object will enable us to get the input from the User


        for (int i = 0; i < 5 ; i++) {// for loop will execute the repeated statement. In this case it is 5 times
            System.out.println("Enter a number for 5 times");
           int userNum = scan.nextInt(); // by using the scanner's method we return the user's entered number

            // in order to find the minimum number we need to create a condition. Any number the User enters we need to compare with current assumed minimum number we have assigned to the temporary variable.

            if (userNum < minNum){
                minNum = userNum; // if User entered number is smaller than temporary variable value, then assign the new number to minNum and this is done continuously until the Loop becomes false.
            }

        }
        System.out.println("Minimum number:" + minNum);

    }
}

// write a program that asks the user to enter a number for 5 times. The program should return the minimum number at the end.