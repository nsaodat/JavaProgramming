package day18_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("Enter your first number");
            int n1 = sc.nextInt();

            System.out.println("Enter your second number");
            int n2 = sc.nextInt();

            System.out.println("Addition: " + (n1 + n2));

            System.out.println("Would you like to continue? yes or no?");
            String answer = sc.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) { // if the answer is invalid
                System.out.println("Invalid Entry, please re-enter");
                answer = sc.next().toLowerCase();
            }
            if (answer.equals("no")) {
                break;// exits the outer loop


            }

        }

    }




}
