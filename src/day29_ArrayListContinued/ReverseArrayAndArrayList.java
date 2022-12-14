package day29_ArrayListContinued;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {

        System.out.println("______________________ reverse Array ___________________________________");

    int []array = {1,2,3,4,5,6};

    int [] reversed = new int[array.length]; // {1,2,3,4,5,6};

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--, j++) { // each time i value decreases, j value must increase
            reversed [j] = array[i];

        }
        System.out.println(Arrays.toString(reversed)); // [6, 5, 4, 3, 2, 1]

        System.out.println("_________________________ reverse ArrayList ________________________________");

        ArrayList<Integer> list = new ArrayList<>();

     list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

     ArrayList<Integer> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            int each = list.get(i);
            reversedList.add(each);
            }
        System.out.println(reversedList); // [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]


}

}
