package day29_ArrayListContinued;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements_Integer {

    public static void main(String[] args) {

        // find the frequency of each element
        // solution1

        ArrayList <Integer> list =  new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,8,9,1,2,4,6,7));

        ArrayList <Integer> uniqueList = new ArrayList<>();

        for (Integer each : list) {
            int frequency = Collections.frequency(list, each); // finds the frequency of each element
            if (frequency == 1){
                uniqueList.add(each);

            }
        }
        System.out.println(uniqueList); //  [3, 5, 9]

        System.out.println("_______________________________________________");
//solution2 - without using any loops

        ArrayList <Integer> list2 =  new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,8,9,1,2,4,6,7));

        ArrayList <Integer> uniqueList2 = new ArrayList<>(list2); // add all the elements of list2

        uniqueList2.removeIf(p -> Collections.frequency(list2,p) > 1); // find the frequency of each element from list2 by removing if the frequency is greater than 1

        System.out.println("uniqueList2 = " + uniqueList2); // uniqueList2 = [3, 5, 9]




    }




}
