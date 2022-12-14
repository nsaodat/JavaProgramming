package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
/*
// we used sort method because we are working with Array data structure

        char[]ch1 = {'a','b','c'};
        char[]ch2 = {'b', 'c','a'};

        // check whether these chars are anagram "abc" , "bca" <-- are they built out of the same characters


        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println("anagram = " + anagram); // true, since we sorted both arrays individually by using sort method, then compared them by using equals method
 */

        String str1 = "acbd";
        String str2 = "dbca";
        
        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1,ch2);

        System.out.println("anagram = " + anagram);
        
    }
}
