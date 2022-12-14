package day15_ForLoops;

import java.util.Scanner;

public class StartsWithXCharReplace {
    public static void main(String[] args) {
// as long as the method is returning a String, I can call String's methods back to back.
// Scanner:  if I am using only once, meaning if I am asking for 1 input from the User, then I don't need a
// variable for the Scanner.I only need Scanner's object and the constructor, then call one of the methods

        //Eg.String word = new Scanner(System.in).next(); --> here I called a String method,
                                      // because User input is expected to be a String

                //If, there isn't a Scanner variable then I do not need to close the Scanner

        System.out.println("Enter a word");
        String word = new Scanner(System.in).next();

        if (word.charAt(0) == 'x'){
           word =  word.replaceFirst("x", "a");
        }

        System.out.println(word); //acodex

    }
}
/*

Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */