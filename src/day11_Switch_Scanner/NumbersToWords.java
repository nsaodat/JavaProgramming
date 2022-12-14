package day11_Switch_Scanner;

public class NumbersToWords {

    /*
    Write a program that can convert numbers 0~9 to words.

		NOTE: MUST use ternary
     */
    public static void main(String[] args) {

        int n = -1; // 0~9
        String result = (n >= 0 && n <= 9)? // Nested if
                (n == 0) ? "Zero" : (n == 1) ? "One" : (n == 2) ? "Two" : (n == 3) ? "Three" : (n == 4) ? "Four"
                        : (n == 5) ? "Five" : (n == 6) ? "Six" : (n == 7) ? "Seven" : (n == 8) ? "Eight" : "Nine"

                : "Invalid number"; // <-- this else belongs to pre-condition

        System.out.println(result);


    }
}
