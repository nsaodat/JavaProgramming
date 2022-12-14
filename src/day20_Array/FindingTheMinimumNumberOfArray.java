package day20_Array;

public class FindingTheMinimumNumberOfArray {
    public static void main(String[] args) {

int [] numbers = {203, 89,67,45,23};

int min = numbers[0];// we are assuming that first element of the Array is the minimum number. This will enable us to compare it with the rest of the elements of the Array.

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min){ // if element of the array is smaller than minimum number
                min = numbers[i]; // then assign it to the variable named minimum
            }
        }
        System.out.println(min);
    }
}
