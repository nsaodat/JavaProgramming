package day11_Switch_Scanner;

import com.sun.security.jgss.GSSUtil;

public class DaysInWeek {

    public static void main(String[] args) {
        int num =15;

        /*
       we can implement the usual if statement in our code, however the performance of this code is not going to be
       as fast as Switch statement.

       NOTE: If we are comparing the data with equal statements, then we can use Switch statement!

        if (n == 1){
System.out.println ("Monday");
}else if....


Switch statement`s expression must be evaluated to a single value, it can not be --> long, double, float and Boolean data types!
   // long number = 9L;
       // float number = 9F;
       // double number = 9D;
      //  boolean number = true;
         */

        switch(num){ // data type can not be long, double, float and Boolean data types!
                    // 1, 2, 3, 4, 5, 6, 7


            // we use switch-case for when equal operator is being used ( == )

            case 1: // case data type should match with the expression and must be UNIQUE all the time
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break; // exits the switch after executing the case block
            case 3:
                System.out.println("Wednesday");
                break; // exits the switch after executing the case block
            case 4:
                System.out.println("Thursday");
                break;// exits the switch after executing the case block
            case 5:
                System.out.println("Friday");
                break;// exits the switch after executing the case block
            case 6:
                System.out.println("Saturday");
                break;// exits the switch after executing the case block
            case 7:
                System.out.println("Sunday");
                break;// exits the switch after executing the case block

            default: // only gets executed if none of the blocks are matching the case data
                                                      // default block can be placed anywhere,
                                                     //  but keeping it in the end if preferable
                System.out.println("Invalid Entry");// no need for break, as default block is positioned
                                                    // in the end of this code
        }


    }


}
