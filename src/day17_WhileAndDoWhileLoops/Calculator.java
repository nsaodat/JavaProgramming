package day17_WhileAndDoWhileLoops;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your first number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter your second number: ");
        int num2 = scan.nextInt();

        System.out.println("Enter a math operator:");
        char ch = scan.next().charAt(0);
        scan.close();

        while (!(ch == '+' || ch == '-')){ // if the operator is invalid --> true
            System.err.println("Invalid Entry, please re-enter");
             ch = scan.next().charAt(0);
             }
// once the condition becomes false, in other words when the operator becomes valid then the while loop will jump to the next step
        System.out.println((ch == '+')? num1 + num2 : num1 - num2);


    }
}
