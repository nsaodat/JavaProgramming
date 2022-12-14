package utilities;

import java.util.Arrays;

public class StringUtility {

// I have called the methods in other packages through importing package and class name
// E.g. day01 -> Test1
//      day25 -> Test
//________________________________________________________________________________________

    // the method prints each character of the given String
    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }


    }

    // the method reverses a given String and returns the reversed String
    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }
        return result;
    }

    // the method checks whether the given String is palindrome

    public static boolean isPalindrome(String str) {
        return reverseString(str).equalsIgnoreCase(str);
    }

    // the method checks if the given String is anagram

    public static boolean isAnagram(String str1, String str2) {
        char[] ch1 = str1.toCharArray(); // turned into char in order to sort
        char[] ch2 = str2.toCharArray();// turned into char in order to sort
        Arrays.sort(ch1);// used sort method
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2); // used Arrays.equals method


    }

    // the method removes the duplicates from given String, returns String "aaabbbcc" ---> "abc"

    public static String removeDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)){
                result += each;
            }
        }
        return result;

    }


}
