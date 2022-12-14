package day08_IfStatement;

public class IdentifyNumber {

    /*

    Create a class called IdentifyNumber, and write a program that can identify if the given number is positive,
    or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
     */

    public static void main(String[] args) {


    int num = 200;
    boolean isPositive = num > 0;
    boolean isNegative = num < 0;
    boolean zero =  num == 0;

        System.out.println(num + " is positive number: " +isPositive); // 200 is positive number: true

        System.out.println(num + " is negative number: " + isNegative); // 200 is negative number: false

        System.out.println(num + " is zero: " + zero); // 200 is zero: false

    }
}
