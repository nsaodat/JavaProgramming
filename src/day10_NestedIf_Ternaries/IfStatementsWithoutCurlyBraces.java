package day10_NestedIf_Ternaries;

public class IfStatementsWithoutCurlyBraces {
    public static void main(String[] args) {

        // if there is one statement in the block, then we don`t need a curly brace.

        int number = 11;
        String monthName = "";

        if (number >= 1 && number <= 12) // precondition --> if the number is valid

            if (number == 1)  // Nested if is used for assigning the right data to the String variable monthName.
                monthName = "January";
             else if (number == 2)
                monthName = "Feb";
            else if (number == 3)
                monthName = "Mar";
            else if (number == 4)
                monthName = "Apr";
            else if (number == 5)
                monthName = "May";
            else if (number == 6)
                monthName = "Jun";
            else if (number == 7)
                monthName = "Jul";
            else if (number == 8)
                monthName = "Aug";
            else if (number == 9)
                monthName = "Sep";
            else if (number == 10)
                monthName = "Oct";
            else if (number == 11)
                monthName = "Nov";
            else
                monthName = "Dec";
            else  // if the number is not valid
            monthName = "Invalid number";

        System.out.println(monthName);

        // REMEMBER: Curly braces make our codes readable. If only 1 statement in the block then curly brace is not necessary.
        // However, having the curly brace is a good  practice
    }
}



