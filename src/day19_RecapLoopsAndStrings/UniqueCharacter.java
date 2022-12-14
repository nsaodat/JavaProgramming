package day19_RecapLoopsAndStrings;

public class UniqueCharacter {

    public static void main(String[] args) {
        String str = "aabccdeef";

        String result = "";


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0; // represents the frequency of the ch


            for (int i = 0; i < str.length(); i++) { // / compares the character picked by outer loop, with each characters' of the String
                char eachCh = str.charAt(i);

                if (ch == eachCh){
                    count ++;
                }

            }

            //create if block to find the uniqueness of the character inside the OUTER LOOP

            /* solution1:
             if (count == 1){ // if the frequency of the character is 1, then the character is unique
                 result +=ch; // hence assign the character to the result
       */

            //solution2
           if (count!=1){ // if frequency of the character is not equal to 1, then
                continue; // skip the character
             }
            result +=ch; // any character that is equal to 1, assign to the variable named result

/*
//solution3 --> here we are finding the characters repeated more than once
            if (count != 1){
                result+=ch;

 */
            }    System.out.println(result); // bdf
        }

        }



/*
Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf


 */