package day10_NestedIf_Ternaries;

public class TernariesWithNestedIf {
    public static void main(String[] args) {

        // it is possible to apply Ternaries with Nested if, however it could be difficult to read. Best to avoid using them
        // Can be mixed up, but again best to avoid applying Ternaries in Nested If statements.

        int s =150;

      /*  if (s >=0 && s <= 100){// <-- precondition

            if (s >=60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }else{
            System.out.println("invalid score");
        }

        */
                     //precondition if         if               else        else
       String grade =  (s >=0 && s <= 100)? (s >=60)?"Passed" :"Failed" :"invalid score";
        System.out.println(grade); // invalid score

    }
}
