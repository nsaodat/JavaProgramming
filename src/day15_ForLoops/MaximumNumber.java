package day15_ForLoops;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {
        
        int maxNum = -2147483648;// this condition defines any number entered by the User will be greater than the temporary value we have given. It is the most minimum number integer dataType can have. Soon the user enters the numbers our code will allow to store the maximum number and return. Remember: Any number that User enters will be greater than the value given in temporary variable

        Scanner scan = new Scanner (System.in);

        for (int i = 0; i < 5 ; i++) { // indicates how many times the Loop should be executed
            System.out.println("Enter a number");
            int number = scan.nextInt();

            if (number > maxNum){
                maxNum = number;
                System.out.println("maxNum = " + maxNum);
            }

        }

scan.close();
        
        
    }
}
// write a program that asks the user to enter a number for 5 times. The program should return the max number at the end.