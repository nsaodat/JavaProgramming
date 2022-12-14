package day21_ForEachLoop;

import java.security.spec.RSAOtherPrimeInfo;

public class MaximumNumber {
    public static void main(String[] args) {


        int[] numbers = {10, 5, 4, 20, 89, 489};
        int max = numbers[0]; // we are assuming that first element of the Array is the max number. This will enable us to compare it with the rest of the elements of the Array.
/*
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);


 */



        for (int each : numbers){ // for each loop grasps each element in the data Structure(Array in this case)
            if(each>max){ // then we compare each element with max number. We already have a variable named max and assigned element1
                max = each; // if the element is greater than the element assigned to max variable then assign the greater element to the max variable
            }
        }
        System.out.println(max);

    }

}
