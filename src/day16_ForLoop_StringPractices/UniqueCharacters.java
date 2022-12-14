package day16_ForLoop_StringPractices;

public class UniqueCharacters {
    public static void main(String[] args) {
        //            0123456789
        String str = "ABBBCCCAFL";
        String result = "";
        //char ch = 'b';

        for (int i = 0; i <= str.length()-1; i++) { // i: index numbers of the String starting from 0
            char ch = str.charAt(i); // this line will get each of the character    ch: represents each char of the String named str.
            // System.out.println(ch);
             if (str.indexOf(ch) == str.lastIndexOf(ch)) // if the first and the last index numbers of the character are    the same, then the char is Unique! Whichever character is going to make this condition true will be added to the String named result
            result+=ch; // Unique char will be added here.
        }
        System.out.println(result);

    }
}

/*
Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique



				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1


				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2

 */