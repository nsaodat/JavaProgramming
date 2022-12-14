package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerIntro {
//Scanner class is presented under the package called util, and util package is under java package.
// Java package contains  system library and classes. Under java there are utility classes that are presented in util package.
// Every time we want to use the Scanner we need to import it by using the import statement.

// Scanner class allows us to get the User input. Also, connects Java programme with our keyboard.
// Scanner class has methods, whenever they are called, they allow us to read whatever is typed on the keyboard.

    // step1: import the Scanner from outside my package into my class.
    // place my cursor  between package and class, then type --> import java.util.Scanner;
    // Every single constructor has the same name as Class names, therefore it is named Scanner in Scanner classes


    public static void main(String[] args) {


    // Scanner   object     =    new   constructor    pass the argument with the parenthesis
      Scanner    input      =    new     Scanner           (System.in);    // System.in --> used to read the User input, not the files
                                                        // System is a class.

        System.out.println("Enter Integer number:");
    int n1 = input.nextInt();

        System.out.println("Enter decimal number:");
        double n2 = input.nextDouble();

        System.out.println(n1);
        System.out.println(n2);
        System.out.println("Multiplication of " + n1 + " & " + n2 + " = " + (n1*n2));



input.close(); // terminates the Scanner

}
}