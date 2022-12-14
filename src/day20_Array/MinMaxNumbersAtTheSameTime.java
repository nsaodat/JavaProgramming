package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumbersAtTheSameTime {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt(); // calling the scanner's method within the loop. Each user input will be                 assigned to the indexes of the Array named numbers
        }
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);

scan.close();
    }
}

/*

	Write a program that asks user to enter a number 10 times:
			1. store all user entered numbers in an array
			2. find the max number
			3. find the min number

 */