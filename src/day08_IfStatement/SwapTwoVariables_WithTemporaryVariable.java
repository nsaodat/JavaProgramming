package day08_IfStatement;

public class SwapTwoVariables_WithTemporaryVariable {

    /*
    write a program that can swap two variables' value by using a temporary variable

		    Ex:
		        if a= 10, b=15

		    output:
		        a = 15
		        b = 10

     */
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        // -----------

       /* int c = b; //c = 15; c is temporary variable

        b = a;
        a = c;
        System.out.println("a = " + a); // a = 15
        System.out.println("b = " + b); // b = 10 */

        System.out.println("_______________________________________");
// swap 2 variables without temporary variable
        ++a;
        ++a;
        ++a;
        ++a;
        ++a;

        System.out.println("a = " + a); // a = 15

        --b;
        --b;
        --b;
        --b;
        --b;
        System.out.println("b = " + b); // b = 10


    }
}
