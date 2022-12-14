package day15_ForLoops;

public class ForLoopPractices {
    public static void main(String[] args) {

        // 15 16 17.... 45


        for (int i = 15; i <= 45; i++) { // i --> is a local variable within Loop block. It can not be called outside the                               block.
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Hello World");

        System.out.println("________________________________________________________");
        // 100 99 98 97 96 95 94...50

        for (int i = 100; i >= 50; i--) { // i: 100, 99, 98.... 50 --> loop is executed    49 will make the condition false making the loop stop
            // Operators

            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("________________________________________________________");
        // print all the even numbers between 1 ~ 55

        for (int i = 1; i <= 55; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");// Even numbers to be printed in the same line separated by the space. Removed ln at the end of print in the print statement.
            }
        }
                System.out.println();

                System.out.println("________________________________________________________");
         // print all the even numbers between 1 ~ 55: 2, 4, 6, 8...54

                for (int i = 2; i <= 54; i += 2 ){
                    System.out.print(i + " ");
                }




        }
    }

