package day09_IfStatements;

public class MinNumber {
/*
Write a program that can print the minimum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				100 is the minimum number


			n1 & n2

			possibility #1: n1 is Min
			possibility #2: n2 is Min
			possibility #3: equal

 */
    public static void main(String[] args) {

        int number1 = -10, number2 = -500;

        boolean number1IsMin = number1 < number2;

        boolean number2IsMin = number2 < number1;

        boolean equal = number1 == number2;

        if (number1IsMin){
            System.out.println(number1 + " is a minimum number");
        }

        if (number2IsMin) {

            System.out.println(number2 + " is a minimum number");
        }

        if (equal){
            System.out.println("Equal");
        }
    }
}
