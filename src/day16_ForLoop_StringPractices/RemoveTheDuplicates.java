package day16_ForLoop_StringPractices;

public class RemoveTheDuplicates {

    public static void main(String[] args) {
//                      01234567
        String input = "AABBCCBC";
        String result = "";// ABC

        // step1: Collate every index of the characters starting from index 0 till the last index
        // step2: By using charAt() method obtain every character
        // step3: Add the character into a temp variable named result, under the condition of the uniqueness of the characters inside the String result

        //            i <=7 -->  i <= input.length()-1    or  i < 8 --> i < input.length()
        for (int i = 0; i <= input.length() - 1; i++) { //i: represents index numbers starting from 0 until the end of the given String
            String ch = "" + input.charAt(i); // represents each Character of the String

          /*  System.out.println(ch);


                                      A
                                      B
                                      B
                                      C
                                      C
                                      B
                                      C
                                           */

         /*    result += ch; // chars are added into the String named result --> AABBCCBC
                          // we will need to execute the String named result under the condition of the char Uniqueness. Therefore, we use if condition.

        }
        System.out.println(result);  --> AABBCCBC        */

if (!result.contains(ch)){ // contains() method:  Looks for parts of the String, hence empty String is concatenated in                               Line 16 in order to turn the char into the String.     Return type --> boolean
        result += ch;

}
   }

        System.out.println(result); // ABC

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