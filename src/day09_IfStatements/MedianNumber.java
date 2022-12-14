package day09_IfStatements;

public class MedianNumber {

    /*
write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Possibility #1: a could be median number
			Possibility #2: b could be median number
			Possibility #3: c could be median number
     */

    public static void main(String[] args) {

        int a = 100, b= -28, c = -20;

        // if we have three different numbers, one MUST maximum, one MUST be minimum and one MUST be Median


        boolean aIsMedianNumber = (a < b && a > c) || (a > b && a < c);
        boolean bIsMedianNumber = (b < a && b > c) || (b > a && b < c);
       // boolean cMedianNumber = (c < a && c > b) || (c > a && c < b); <-- one way of writing the code

        boolean cIsMedianNumber = !aIsMedianNumber && !bIsMedianNumber;


        if (aIsMedianNumber) {
            System.out.println(a + " is a median number");
        }

        if (bIsMedianNumber){
            System.out.println(b + " is a median number");
        }
        if (cIsMedianNumber) {

            System.out.println(c + " is a median number");
        }

    }
}
