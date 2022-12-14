package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoop_OddOrEvenNumber {

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

            System.out.println("Would you like to enter another number?");
            String answer = sc.next().toLowerCase();

            while(!(answer.equals("yes")|| answer.equals("no"))){// if the answer is invalid. Neither "yes" nor "no"
                System.err.println("Please re enter, would you like to enter another number?");
             answer = sc.next().toLowerCase();
            }

            if(answer.equals("no")){
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