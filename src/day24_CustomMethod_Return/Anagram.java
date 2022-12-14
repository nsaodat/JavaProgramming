package day24_CustomMethod_Return;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";


anagram(str1, str2);


    }
    public static void anagram(String str1, String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1, ch2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not anagram");
        }

    }


}

/*

    Create a method that can check if two strings are anagrams
E.g.
        anagram("silent", "listen")


    output:
    silent and listen are anagram
 */