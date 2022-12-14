package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        while(true) {
            System.out.println("Enter your age:");
            int age = sc.nextInt();

            while (!(age >= 1 && age <= 120)) { // while the age is invalid
                System.err.println("Invalid Entry, please re-enter ");
                age = sc.nextInt();
            }

            System.out.println("Would you like to continue?");
            String answer = sc.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid Entry, please re-enter ");
                answer = sc.next().toLowerCase();
            }
            if (answer.equals("no")){
                break;
            }
        }

    }
}
