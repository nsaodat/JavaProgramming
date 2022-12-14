package day13_String;

public class StringMethods {

    public static void main(String[] args) {

        System.out.println("______________________ charAt() __________________");

        // charAt(int index): Returns the char at given index
        // Return type ---> char

        String word = "Cydeo";
        // index:      01234


        char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar); // d

        System.out.println("______________________ length() __________________");

      // Every single String has a length. When I call the method from the String, I do not need to pass any arguments within the parenthesis, keep it empty.
        // Returns the total number of characters
      //  Return type --> integer , returns the total number of characters


        String s1 = "Batch EU10 is the best batch"; // every character included within the double quote is counted as String character.
        int totalChar = s1.length();
        System.out.println("totalChar = " + totalChar); // 28

        char option1 = s1.charAt(totalChar-1); // <-- 1st solution
        char option2 = s1.charAt(s1.length() - 1);// <-- 2nd solution --> memorize this!!! Finding the LAST index number

        System.out.println("option1 = " + option1); // h
        System.out.println("option2 = " + option2); // h


        System.out.println("______________________ toUpperCase() __________________");
        // Returns --> upper case version of the String

      // call to UpperCase() method. this creates a new Object, then I need to assign it back to the original variable
        String sentence = "Great day! Positive people around me";
        sentence = sentence.toUpperCase(); // assign it back to the original variable
        System.out.println(sentence); // GREAT DAY! POSITIVE PEOPLE AROUND ME
    }
}
