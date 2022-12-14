package day19_RecapLoopsAndStrings;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabcccd";
        String result = "a2b1c3d1";


        for (int j = 0; j < str.length(); j++) { // nested outer Loop

            char ch = str.charAt(j); // each character from the String named str
            int count = 0;

            for (int i = 0; i < str.length(); i++) { // finding the frequency of each character
                char eachCh = str.charAt(i);
                if (ch == eachCh)
                    count++;


            }
            if (result.contains("" + ch)){ // if result contains the same char we have already identified, then
                continue;// skip the duplicate char
            }

            result += ch ;
            result +=count;

        }
        System.out.println(result);


        /*

Below loop prints a char and the frequency of it, in this case index 0 == a.
We are placing this loop within another loop in order to identify the frequency of each char in the String and print the count.
        char ch = str.charAt(0); // a
        int count = 0;


      for (int i = 0; i < str.length(); i++) {
            char eachCh = str.charAt(i);
            if (ch == eachCh)
            count++;
        }
       System.out.println(ch); // a

        System.out.println(count); // 2

       */


        }

    }




/*

Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1

 */