package day42_Exceptions_Continued;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {

        System.out.println("Enter your age: "); // -20

       Scanner scan  = new Scanner(System.in);
        int age = scan.nextInt();

        if (age < 0){

            throw new InputMismatchException("Age can not be negative " + age); // in order to create the Object from the class we use new keyword and call the constructor of InputMismatchException. Since RuntimeException is a parent of all the unchecked exceptions, it has a constructor that allows to print the message in the console
        }
        if (age > 21){
            System.out.println("You are eligible");

    }else{
            throw new RuntimeException("You must  be at least 21 years old");
        }

    }
}