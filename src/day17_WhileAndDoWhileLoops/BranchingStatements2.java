package day17_WhileAndDoWhileLoops;

public class BranchingStatements2 {
    public static void main(String[] args) {

        System.out.println("__________________ continue; _______________________");

        // continue; statement -  skips the iteration of the Loop and jumps to the next iteration

        for (char i = 'A'; i <= 'E'; i++) {
         //   System.out.println(i);
            if (i == 'C') {
            //    break; // this statement exits the Loop when iteration reaches 'C'

                continue; // this statement skips the iteration of 'C' and jumps to teh next iteration
            }
            System.out.print(i + " "); // A B D E
        }

        System.out.println();
        System.out.println("________________________________________________");

        // print even numbers 1 ~ 10
        //  print odd numbers 1 ~ 10

        for (int i = 1; i <= 10; i++) {

            if (i % 2 != 0){
               continue; // skip odd numbers
            }
            System.out.print(i + " "); // 2 4 6 8 10 (skip the current iteration)
        }

        System.out.println();
        System.out.println("________________________________________________");

        for (int i = 1; i <= 10 ; i++) {
            if (i%2 == 0){
                continue; // skip even numbers (skip the current iteration)
            }
            System.out.print(i + " "); // 1 3 5 7 9
        }


    }


}