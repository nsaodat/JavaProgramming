package day20_Array;

public class FindingTheMaxNumberOfArray {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 89, 489};
        int max = numbers[0]; // we are assuming that first element of the Array is the max number. This will enable us to compare it with the rest of the elements of the Array.

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);

    }
}
