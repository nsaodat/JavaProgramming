package day17_WhileAndDoWhileLoops;

public class WhileLoopIntro {
    public static void main(String[] args) {
        // While Loop is repeated if statement. If number of repeating is unknown then while loop is best to use
/*
Syntax:
        while(condition){
            statement;
        }

 */
        if (true){
            System.out.println("Wooden Spoon"); // only executed once
        }
        System.out.println("________________________________________________________");

        while (true){ // condition is checked at the Loop start
            System.out.println("Wooden Spoon"); // Statement will be infinite as condition remains true
                                               // The loop gets terminated when condition is evaluated to false


        }
    }
}
