package day15_ForLoops;

import java.util.Scanner;

public class SumOfMultipleNumbers {

    public static void main(String[] args) {
        // return sum of between 1 to 100

        int sum = 0; // if I want sum of multiple numbers, then I need a temporary variable. Then use Loop to get the sums of numbers
        for (int i = 1; i < 101; i++) { // or i <= 100

            sum += i;

        }
        System.out.println(sum);

        System.out.println("____________________________________________________________________________");

        int total = 0; // ask a user to enter a number for 5 times.

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            total += scan.nextInt();// user input is assigned to total every single time the Loop is run
        }

        System.out.println("total = " + total);
scan.close();
    }

}
