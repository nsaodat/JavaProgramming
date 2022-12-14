package day16_ForLoop_StringPractices;

public class Palindrome {

    public static void main(String[] args) {

        // Step1: Reverse
        //

        String word = "Racecar";

        String reversed = "";

// initiation - i starts from from the last index of the String --> int i = word.length()-1. Why int? Because length() method returns integer.
// condition - the Loop should be repeated while index number is equal or greater than 0
// iteration - since I am going backwards, starting from the last index, it needs to decrement.

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i); // i is used to get the character from the String named word.                     After getting each character we add them by using += operator and store them into the temporary String variable named --> reversed
        }

       // System.out.println(reversed); // racecaR

        boolean isPalindrome = word.equalsIgnoreCase(reversed);

        System.out.println("isPalindrome = " + isPalindrome); // depending on the given string --> in this case it is                                                                                             true

    }
}

/*
Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding
 */