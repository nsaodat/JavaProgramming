package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        String[] group1 = {"Ali", "Adam", "Woldemor"};
        String[] group2 = {"Maria", "Leyla", "Anna"};
        String []students = new String[group1.length + group2.length];// making sure that 3rd Array has enough capacity to contain all the elements from the first and second Array

       int i = 0; // assigning temporary variable for index numbers outside for each loop because we don't have access to the index numbers inside the for each loop

        //we are using 2 for each loops because there are 2 arrays that needs merging. If there were 3 Arrays to merge, then we would have used 3 for each loops
        for (String each : group1) {
            students[i++] = each; // we are assigning each element to each index number during each loop execution
        }
        for (String each : group2) {
            students[i++] = each;

        }

        System.out.println(Arrays.toString(students));


        System.out.println("_________________________________________________________");

        char[]ch1 = {'A','B','C'};
        char[]ch2 = {'D','E','F','G','H'};
        char[]chars = new char [ch1.length + ch2.length];

        int j = 0;
        for (char each : ch1) {
            chars [j++] = each;
        }

        for (char each : ch2) {
            chars [j++] = each;
        }

        System.out.println(Arrays.toString(chars));


    }
}
