package day30_CustomClass;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {
    public static void main(String[] args) {

        //Task1:
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 8, 2, 0, 3, 0, 4, 7));

        Collections.swap(list, 1, list.size() - 1);

        System.out.println(list); // [1, 7, 2, 0, 3, 0, 4, 8]

        System.out.println("____________________________________");

        //Task2 - solution1:

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        int size = list2.size();
        System.out.println(size); // 8

        list2.removeAll(Arrays.asList(0));
        System.out.println(list2); // [1, 2, 3, 4]

        int newSize = list2.size();

        int totalNumberOfZeros = size - newSize;

        System.out.println(totalNumberOfZeros); // 4

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list2.add(0);
        }
        System.out.println(list2); // [1, 2, 3, 4, 0, 0, 0, 0]

        System.out.println("_____________________________________________");

        //Task2 - solution2:

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list3) {
            if (each != 0) {
                result.add(each);
            }
        }

        for (Integer each : list3) {
            if (each == 0) {
                result.add(each);
            }
        }
        System.out.println(result); // [1, 2, 3, 4, 0, 0, 0, 0]

        System.out.println("_____________________________________________");

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        System.out.println(chars); // [A, B, C, D, 1, 2, 3, $, %, #, @, &, 4, 5, 6, E, F, G, !]

        ArrayList <Character> letters = new ArrayList<>(chars); //  add all the characters
        letters.removeIf(p -> !Character.isLetter(p)); //remove the characters that are not letters
        System.out.println("letters = " + letters); // letters = [A, B, C, D, E, F, G]

        ArrayList <Character> digits = new ArrayList<>(chars);
        digits.removeIf(p-> !Character.isDigit(p));
        System.out.println("digits = " + digits); // digits = [1, 2, 3, 4, 5, 6]
        
        ArrayList <Character> specialChar = new ArrayList <> (chars);
       // specialChar.removeAll(letters); // we already know what we want to remove, hence using removeAll method
        // specialChar.removeAll(digits);
        
        specialChar.removeIf(p -> Character.isLetterOrDigit(p));

        System.out.println("specialChar = " + specialChar); // specialChar = [$, %, #, @, &, !]


    }
}

/*
1. write a program that can swap the first and last elements of an ArrayList
2. Write a program that can move all the zeros to the last indexes of ArrayList

					Ex:
						list: {1,0,2,0,3,0,4,0}

					output:
						[1, 2, 3, 4, 0, 0, 0, 0]


3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
				Ex:
					str = "ABCD123$%#@&456EFG!"
				output:
					list1: {1, 2, 3, 4, 5, 6}
					list2: {A, B, C, D, E, F, G}
					list3: {$, %, #, @, &, !}

 */