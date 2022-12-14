package day17_WhileAndDoWhileLoops;

public class DoWhileLoopIntro {
    public static void main(String[] args) {

        System.out.println("_________________________ While Loop ______________________________");
       // while loop -  repeated if statement.
        // while the condition is valid, execute the statement
        // if condition is false, then statement will never be executed.

        /*
        //Syntax:
        //        while(condition){
        //            statement;
        //        }

         */
        boolean a = false;
        while(a){
            System.out.println("Wooden Spoon"); // printed 0 times due to a condition being false. If true condition, then it will be infinite Loop

        }

        System.out.println("_________________________ Do While Loop ______________________________");
        // do while loop - just do it, then check the while condition. If the condition is true, then execute the statement again.

       /*

       Syntax:

                                 do {
                             statement }
                     }while(condition);

        */
        do {// do block gets executed first, then moves on to while condition. Also do can not be independent block, it always needs to come with while condition
            System.out.println("Wooden Spoon");// Wooden Spoon
        } while(a); // false, hence this block won't be executed
                  // if true, statement will be printing infinite



        System.out.println("_________________________ For Loop ______________________________");
        for (int i = 0; a;) {
            System.out.println("Wooden Spoon");
        }






    }
}
