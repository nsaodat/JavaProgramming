package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        System.out.println("________________________   toCharArray(): _________________________");

        String word = "Java";

        char[] ch = word.toCharArray();
        System.out.println(ch);

        for (char each : ch) {
            System.out.println(each); // print each char individually
        }
        System.out.println("__________________ split()_______________________________");
// splits a string into an array of substrings. The split() method returns the new array.
        String sentence = "Wooden Spoon";

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("_________________________________________________");

        String email = "nafisasaodat@gmail.com";

        String[] email1 = email.split("@");
        System.out.println(Arrays.toString(email1)); // [nafisasaodat, gmail.com]

        System.out.println("_________________________________________________");

        String str = " Today was a peculiar day. I managed to get out of the house for a walk. However, Behrouz hurt his ankle with a pedal of his bike and struggled with cycling. Walking was also a difficult task for him due to a pain. So, we decided to come home";
        String [] str2 = str.split("\\. ");
        System.out.println(Arrays.toString(str2));

    }
}
