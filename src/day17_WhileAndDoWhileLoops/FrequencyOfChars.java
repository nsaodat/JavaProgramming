package day17_WhileAndDoWhileLoops;

public class FrequencyOfChars {

    public static void main(String[] args) {

        String str = "AAABBBCA";
        char ch =  'A'; //
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachCh = str.charAt(i);// step1: eachCh variable returns --> each one of the characters in the String named str.  step2: We want to find out how many times 'A' has occurred in the String. EachCh of the String we will compare with variable named ch. Whenever it is equal, then increase the frequency of the count by 1.
            if (ch == eachCh) // if given ch is matching with eachCh, then ch has appeared in the String
            count++;
        }

        System.out.println(count);

    }
}
/*

 Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */