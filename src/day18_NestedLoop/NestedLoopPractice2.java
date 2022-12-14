package day18_NestedLoop;

public class NestedLoopPractice2 {

    public static void main(String[] args) {


        for (int j = 0; j < 10; j++) {

            for (int i = 0; i < 10; i++) {
                System.out.print("* ");
            }
            System.out.println(); // this should append a new line in readiness for the Outer loop's execution
        }


    }
}

/*

Print the following shape by using a nested Loop:
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
 */