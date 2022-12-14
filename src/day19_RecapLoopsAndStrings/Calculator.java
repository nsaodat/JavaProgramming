package day19_RecapLoopsAndStrings;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter a number:");
        int n1 = scan.nextInt();

        System.out.println("Enter a math operator:");
        char operator = scan.next().charAt(0);

        if (!(operator == '+' || operator == '-')){ // if the operator is not valid, then
            System.err.println("Invalid math operator: " + operator); // warn the User with message
            System.exit(0); // then exit the program
        }

        System.out.println("Enter a number:");
        int n2 = scan.nextInt();

        if(operator == '-'){
            System.out.println(n1 - n2);

        }else{
            System.out.println(n1 + n2);
        }

        scan.close();
    }


}
