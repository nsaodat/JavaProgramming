package day09_IfStatements;

public class PosNegZero {

    public static void main(String[] args) {

        int n = -100;

        System.out.println("___________________ Independent Single If statements (DO NOT USE) ________________________");
        if (n > 0) {

            System.out.println("Positive");
        }
        if (n < 0) {
            System.out.println("Negative");
        }
        if (n == 0) {
            System.out.println("Zero");
        }
// like above example, creating independent if statements is not very efficient. It is wasting the resources!
// NEVER USE multiple single if statements!

        System.out.println("____________________________ Multi branch single If statement __________________________________");

        if (n > 0) {
            System.out.println("positive");
        } else if (n < 0) {
            System.out.println("negative");
        } else {
            System.out.println("Zero");
        }


    }
}
