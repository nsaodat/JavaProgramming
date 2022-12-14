package day09_IfStatements;

public class If_ElseStatementLeapYear {

    public static void main(String[] args) {

        // if & else: used when there are only 2 options/possibilities (not more, not less than  2 conditions)

      /*  if(Condition){
            StatementA
        }else{ // otherwise
            StatementB
        }

        StatementA: if condition MUST be true
        StatementB: if condition MUST be false


        Yes or No
        Leap year
        Female or Male
        Pass or Fail
        Married or not Married
        employed or not employed
        Odd or Even
        Eligible or not eligible

       */

        int year = 2008;
        boolean leapYear = year % 4 == 0; // year divided by 4 and the remainder must equal to number 0, if it is a Leap Year

        if (leapYear){
            System.out.println("Leap Year");
        } else{
            System.out.println("Not Leap Year");
        }


    }
}
