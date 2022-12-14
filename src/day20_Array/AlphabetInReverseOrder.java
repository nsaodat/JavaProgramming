package day20_Array;

import java.util.Arrays;

public class AlphabetInReverseOrder {
    public static void main(String[] args) {

        System.out.println("====================== Option1: Use of loops ===========================");

        // create an Array for 26 elements.

        char[] letters = new char[26];// set the size for 26
// how can we store elements Z~A into the index number of the Array? by using Loop!

/*        index <--  char <-- variables
        letters[0] = 'Z'; // 90
        letters[1] = 'Y';//89
        letters[2] = 'X'; //88

         System.out.println(letters[0]);// print the element of Array
 */

        char ch = 'Z';
        for (int i = 0; i < letters.length; i++, ch--) {
            //   index    char
            letters[i] = ch;
        }
        System.out.println(Arrays.toString(letters));// print the whole Array


        System.out.println("====================== Option2: Use of loops ===========================");
        // the loop will have 2 variables here. One variable will be representing the index number of Array elements. Second variable will be representing the char variables.

        for (int i = 0, j = 'Z'; i < letters.length; i++) { // j: 'Z' - cr number, hence compatible with int data type
            letters[i] = (char)j --;
        }
        System.out.println(Arrays.toString(letters));

        System.out.println("====================== Option3: Use of loops ===========================");
        // the loop will have 2 variables here. One variable will be representing the index number of Array elements. Second variable will be representing the char variables.

        //    index     char n in Ascii table
        for (char i = 0, j = 'Z'; i < letters.length && j >'A'; i++) {
            letters[i] = j--;
        }

        System.out.println(Arrays.toString(letters));
    }
}
