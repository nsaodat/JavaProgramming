package day17_WhileAndDoWhileLoops;
import java.util.Scanner;
public class BranchingStatements {

    public static void main(String[] args) {

        System.out.println("__________________ break; _______________________");

        // break; statement  --> used to exit the Loop and Switch


        for (char i = 'A'; i <= 'Z' ; i++) {

            //System.out.print(i+" "); // A B C D E F

            if(i == 'F'){
                break; // Exits the loop
            }System.out.print(i + " ");

        }
        System.out.println();

        System.out.println("---------------------------------");

        Scanner scan = new Scanner(System.in);

        while(true){

            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if(num < 0){ // until user enters a negative number carry on asking

                break; // exits the loop when the condition is met --> user enters a number smaller than 0
            }

        }

        System.out.println("---------------------------------");


/*
            if(true){
                break;
            }
*/

    }
}
