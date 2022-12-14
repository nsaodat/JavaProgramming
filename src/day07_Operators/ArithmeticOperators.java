package day07_Operators;

public class ArithmeticOperators {

    public static void main(String[] args) {
        /*
        + addition
        - subtraction
        * multiplication
        / division
        % modulus

         */

        int num1 = 10;
        int num2 = 3;

        int division = num1/num2; // Arithmetic operators:  10/3 = 3

        System.out.println(division);
        System.out.println(num1 + " divided by " + num2 + " is equal to " + division);

        System.out.println("_______________How To Find Remainder_______________");

        int remainder = num1%num2; // 10 divided by 3 equals to 3 with a remainder of 1


         /*   Break down of --> int remainder = num1%num2
                                    remainder = numerator -(denominator * integer result)

                             10     - (3 * 3) = 1
                             3000    -(1000 * 3) = 0

       remainder --->  10 % 3 ==> 1
         */

        System.out.println(remainder);
        System.out.println(num1 + " divided by " + num2 + " is equal to " + division + " with a remainder of " + remainder);



        System.out.println(100%15); // 10 <-- 100 - (15*6)
        System.out.println(45%7); //3 <-- 45 - (7*6)
    }
}
