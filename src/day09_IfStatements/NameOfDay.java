package day09_IfStatements;

public class NameOfDay {

    public static void main(String[] args) {

        int n = 7; //1 ~ 7 <--- no pre-condition is given in this Task


        if (n == 1) {
            System.out.println("Monday");
        } else if (n == 2) {
            System.out.println("Tuesday");
        } else if (n == 3) {
            System.out.println("Wednesday");
        } else if (n == 4) {
            System.out.println("Thursday");
        } else if (n == 5) {
            System.out.println("Friday");
        } else if (n == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }

        System.out.println("--------------- More efficient way of the solution ---------------------");
// Since each of the print statement is printing the same data type (String) in the above example.
// Then, we can have a String variable called day and initialize it by using an assignment operator to each statement.
// Once the correct if block gets executed, one print statement can be activated

        String day; // this variable will contain the data, which we will assign in each if block.
                       // And this data will get executed whenever the specific block becomes true.

        if (n == 1) {
            //System.out.println("Monday");
            day = "Monday";
        } else if (n == 2) {
            // System.out.println("Tuesday");
            day = "Tuesday";
        } else if (n == 3) {
            // System.out.println("Wednesday");
            day = "Wednesday";
        } else if (n == 4) {
            //System.out.println("Thursday");
            day = "Thursday";
        } else if (n == 5) {
            // System.out.println("Friday");
            day = "Friday";
        } else if (n == 6) {
            //  System.out.println("Saturday");
            day = "Saturday";
        } else {
            //  System.out.println("Sunday");
            day = "Sunday";
        }

        System.out.println("day = " + day); // one print statement is applicable to 7 if blocks


    }
}
