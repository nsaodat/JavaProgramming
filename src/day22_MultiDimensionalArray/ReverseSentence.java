package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        String str = "Today is a good day to learn Java";
        String [] word = str.split(" "); // split method grasps each of the word in str variable turning into Array
        System.out.println(Arrays.toString(word)); // [Today, is, a, good, day, to, learn, Java]
        String reversedSentence = "";

        for (int i = word.length - 1; i >= 0; i--) {
            reversedSentence += word[i] +" ";
        }
        System.out.println(reversedSentence); // Java learn to day good a is Today
    }
}

/*

 Write a program that can reverse a sentence
			Ex:
				sentence = "Today is a good day to learn Java";

			output:
				Java learn to day good a is Today

 */