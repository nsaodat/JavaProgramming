package day20_Array;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        // Print 26 letters in the english alphabet

        char[] letters = new char[26];

        // option1: letters[0] = 'A'; ..... ; letters[26] = 'Z';
        // instead of repeating the assignment 26 times, we create a loop.

        System.out.println("====================== Option1: Use of loops ===========================");
        // the loop will have 2 variables here. One variable will be representing the index number of Array elements. Second variable will be representing the char variables.

        for (char i = 'A', j = 0; i <= 'Z' && j < letters.length; i++, j++) { // i: represents the characters
            //i++, j++: each time i is increased, then j also needs to be increased
            letters[j] = i; // call letters Array and pass j for index number. Also, assign ch representing the characters to the indexes of Array
        }
        System.out.println(Arrays.toString(letters)); // expected --> [A~Z]

        System.out.println("====================== Option2: Use of loops ===========================");

        // the loop will have 2 variables here. One variable will be representing the index number of Array elements. Second variable will be representing the char variables.

        for (int i = 0, j = 'A'; i < letters.length; i++) { //i: index numbers 0 ~ last index
            // j: is taken as a number of char, because data type is int in the initiation part
            letters[i] = (char) j++; // data type of the Array is char, hence we can not assign the int directly, because 'A' is taken as a number at initiation part. Therefore, we cast it to the char --> (char)j
        }

        System.out.println(Arrays.toString(letters)); // expected --> [A~Z]

        System.out.println("====================== Option3: Use of loops ===========================");
        // the loop will have 1 variables here. Another variable will be placed outside the loop.

        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch++;
        }
        System.out.println(Arrays.toString(letters));// expected --> [A~Z]


    }

}
