package day29_ArrayListContinued;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));

/* Solution1 -it is not dynamic
// get rid of first max number in order to get the second max number

        list.removeIf(p-> Collections.max(list) == p);
        list.removeIf(p-> Collections.max(list) == p);

        int thirdMaxN = Collections.max(list);
        System.out.println(max); // 6

 */
      int  n = 3;

        for (int i = 1; i < n; i++) { // if n value is 3, then loop will be executed 2 times
            list.removeIf(p-> Collections.max(list) == p);
        }
        int thirdMaxN = Collections.max(list);
        System.out.println(thirdMaxN); // 6


    }

}
/*
1. write a program that can return the nth largest number from an arraylist
			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
			n = 5
			output:
				4
 */