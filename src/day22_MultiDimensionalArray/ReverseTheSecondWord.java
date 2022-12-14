package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseTheSecondWord {
    public static void main(String[] args) {

        String 	sentence = "I Love Java";

        String [] words = sentence.split(" "); //<-- create an Array to contain each of the word in a sentence variable
                                           //index:    0    1     2
        System.out.println(Arrays.toString(words)); //[I, Love, Java]

        String reverse = "";

        for (int i = words[1].length()- 1; i >= 0; i--) { // we pass index 1 in this for loop

            reverse += words[1].charAt(i); // take the word at index 1.grasp each char already in reversed position and assign to a variable named reverse
        }

        System.out.println(reverse); // evoL
        
        // solution1:
        /*
         sentence = sentence.replaceFirst(words[1],reverse); // replace first word love at index 1 with reversed version  ||    replaceFirst --> used in case there are more than one 'love' word in the String

        System.out.println(sentence); // the second word of the sentence is reversed --> I evoL Java

         */

        // solution2:
        words [1] = reverse; // assigning reversed version of element at index 1 to the Array named words
      //  System.out.println(Arrays.toString(words)); // [I, evoL, Java]

        for (String each : words) { // obtaining each of the element in the same line of the Array
            System.out.print(each + " "); // the second word of the sentence is reversed --> I evoL Java
        }

    }
}

/*
Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java
 */