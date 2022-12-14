package day20_Array;

import java.util.Arrays;

public class ArraysUtility_copyOf {

        public static void main(String[] args) {

            System.out.println("==============  copyOf(array, newLength) method =====================");
            // Used for copying the element from the Array, starting from first element of the Array.
            //  copyOf(array, newLength): copies the elements of the array, starting from first element to given number, returns new array

            String [] employees = {"Andy", "Elif", "Nafisa", "Maria"};
            String [] nominatedForReward = Arrays.copyOf(employees,3);

            System.out.println(Arrays.toString(nominatedForReward));// [Andy, Elif, Nafisa]

            System.out.println("========== copy and reassign back to the same Array ==========");

            int []numbers = {1,2,3,5,4,6,7,8,9,52};

            numbers = Arrays.copyOf (numbers,7);

            System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 5, 4, 6, 7]

            System.out.println("========= copyOfRange(array, beginningIndex, endingIndex) method ===========");
            // similar to substring method of String
            // copyOfRange(array, beginningIndex, endingIndex): copys the elements of the array, staring from beginning index till the ending index (ending index excluded), returns new array

            char[] ch1 = {'A', 'B', 'C', 'D', 'F', 'E', 'F', 'G','H','I'};
            char []ch2 = Arrays.copyOfRange(ch1, 2, 6+1);// index 6 will be excluded

            System.out.println(ch2); // CDFEF

            System.out.println("===================================");

            int []scores = {10,20,30,40,50,60,70,80,90,100};
            int [] result = Arrays.copyOfRange(scores,3,7+1);

            System.out.println(Arrays.toString(result)); // [40, 50, 60, 70, 80]

            int [] result1 = Arrays.copyOfRange(scores, 4, scores.length);// copying the range from element 5 to the last element of the Array named scores by using the copyOfRange method

            System.out.println(Arrays.toString(result1)); // [50, 60, 70, 80, 90, 100]


        }
}