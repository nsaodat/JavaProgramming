package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str = "I love Cydeo bootcamp";

        StringUtility.printEachChar(str);

        System.out.println("__________________________");
String str1 = "Java";
        String reversed = StringUtility.reverseString(str1); //avaJ
       System.out.println(reversed);

        System.out.println("__________________________");

        String word = "Civic";

      boolean palindrome = StringUtility.isPalindrome(word);

        System.out.println(palindrome); // true

        System.out.println("__________________________");

        String [] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};
        int count = 0;

        for (String each : names) {
            if (StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println(count); // 3

        System.out.println("__________________________");

           boolean isAnagram = StringUtility.isAnagram("secure", "rescue");
        System.out.println(isAnagram); // true

        System.out.println("__________________________");
        String str2 = "aaabbbcc";

String result = StringUtility.removeDuplicates(str2);
        System.out.println(result);// abc

    }
}
