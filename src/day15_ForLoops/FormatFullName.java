package day15_ForLoops;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {

        Scanner word = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = word.next();

        System.out.println("Enter your last name");
        String lastName = word.next();

       firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
       // with substring method take 1st index and the end of the 1st index and convert to Upper case--> "C"
        // then concatenate --> +
        //use substring to take the remaining part of the indexes of the String and convert to Lower case --> "ydeo"

       lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        // with substring method take 1st index  and convert to Upper case--> "S"
        // then concatenate --> +
        //use substring to take the remaining part of the indexes of the String and convert to Lower case --> "chool"

        /*
        In this example the preferred method is substring to convert the string to Upper or Lower case.
        Since calling String methods back to back only works when the return type matches the data type
        we are manipulating with.
         */

        System.out.println(firstName);
        System.out.println(lastName);


        System.out.println("______________ How to use charAt() with String methods and return a String ________________");

         /*
        Since calling String methods back to back only works when the return type matches the data type
        we are manipulating with.

        In below example we are concatenating char method with double quote to turn it into a String.
        Also placing "" + charAt() inside the parenthesis gives it a priority to turn into a String --> "c"
        Then a String is converted into UpperCase --> "C"

        Then concatenate the substring method that takes the remaining part of the indexes of the String
        and convert to Lower case --> "ydeo"
        Eg.
        String firstNameAlternativeSolution = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();

        Then assign it to a new String variable since it is a new String object.


         */
       String firstNameAlternativeSolution = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();
       String lastNameAlternativeSolution =  ("" + lastName.charAt(0)).toUpperCase() + lastName.substring(1).toLowerCase();


        System.out.println(firstNameAlternativeSolution);
        System.out.println(lastNameAlternativeSolution);

    }
}
/*
 Write a program that asks user to enter first and last names, and then prints the full name in
  regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */