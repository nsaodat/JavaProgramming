package day01_JavaIntro;

import day24_CustomMethod_Return.ReturnMethodIntro_Reverse;
import day24_CustomMethod_Return.ReturnMethodPractice4;

public class Test {
    public static void main(String[] args) {


    String str = "aaaaaabbbbbccccccccddddeeeee";

    str = ReturnMethodPractice4.removeDuplicates(str);
        System.out.println(str);// abcde

        System.out.println("___________________");

        String str1 = "Java Programming";
        str1 = ReturnMethodIntro_Reverse.reverse(str1);
        System.out.println(str1);


}
  }