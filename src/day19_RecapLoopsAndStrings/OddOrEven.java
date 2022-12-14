package day19_RecapLoopsAndStrings;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number");
            int a = sc.nextInt();

            if (a % 2 == 0) {
                System.out.println(a + " is Even number");
            } else {
                System.out.println(a + " is Odd number");
            }

            System.out.println("Would you like to enter another number? (yes/no)");
            String answer = sc.next().toLowerCase();


            while(!(answer.equalsIgnoreCase("yes")|| answer.equalsIgnoreCase("no"))){// if the answer is invalid. Neither "yes" nor "no"
                System.err.println("Invalid response");
                System.exit(0); // exit method terminates the rest of the coding
            }

            if(answer.equalsIgnoreCase("no")){
                System.out.println("Good bye");
                break;
            }

        }
    }
}

/*
Write a program that asks user to enter a number , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enters invalid answer, repeat the previous steps
 */


