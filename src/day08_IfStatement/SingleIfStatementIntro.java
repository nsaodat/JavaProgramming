package day08_IfStatement;

public class SingleIfStatementIntro {

    public static void main(String[] args) {
        /*
        if statements:
        Single if -  can be used creating condition for 1 possible output. Used to create conditional statements.

        In Java, if code fragments/any actions need to be executed under a condition, then we use if statements.
        If statements are for creating conditional statements. When giving if statements, boolean conditions need specifying
        Providing boolean condition is true, then if block will get executed. If boolean condition is false, then if block does not get executed.

Single condition - single if
Multiple condition - multiple if
         */

// syntax:

//if (Condition) {
// statements
// }


        int number = 300;

        boolean evenNumber = number % 2 == 0;

        if (evenNumber) { // {} <== body of the if statement goes inside the curly braces

            System.out.println(number + " is even number");
        }
        if (!evenNumber) {
            System.out.println(number + " is odd number"); // 301 is odd number
        }

        System.out.println("__________________________________________");

        int n = 0;

        // positive
        if (n > 0){
            System.out.println(n + " is positive");
        }

        // negative
        if (n < 0){
            System.out.println(n + " is negative");
        }
        // zero

        if (n == 0) {

            System.out.println(n + " is zero");

                    }




    }


    }

