package day29_ArrayListContinued;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters_String {
    public static void main(String[] args) {


        String str = "aaabcccdffff";
        // We can not create ArrayList directly from a String data!
        // 1. convert non-primitive Array to the ArrayList

        String[] str2 = str.split(""); // turning the String to Array by splitting with a space
        System.out.println(Arrays.toString(str2));// [a, a, a, b, c, c, c, d, f, f, f, f]

        ArrayList<String> str3 = new ArrayList<>(Arrays.asList(str2));// turning the String Array to ArrayList. ArrayList contains each character of the String
        // Benefit of converting String into ArrayList: we can use extra methods of the Collections utility class

        System.out.println(str3); // [a, a, a, b, c, c, c, d, f, f, f, f]

        String unique = "";
        for (String each : str3) {
          int frequency =  Collections.frequency(str3,each);
          if (frequency == 1){
              unique+=each; // String does not have method --> add() , hence we are using concatenation
          }

        }
        System.out.println("unique = " + unique); // unique = bd
    }
}