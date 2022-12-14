package day24_CustomMethod_Return;

public class ReturnStatement2 {
    public static void main(String[] args) {
monthName(25);


}

// 3. Create a method that can display the name of the month based on the given number to the method
    public static void monthName(int number) {

        if (number < 1 || number > 12) { // if number is less than 1 or greater than 12 then, print
            System.out.println("Invalid Entry"); // invalid entry, then exit
            return; // exits nameOfMonth method, remaining code fragments of the method never gets executed
       }

            String name =  (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "April" : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August" : (number == 9) ? "September" : (number == 10) ? "October" : (number == 11) ? "November" : "December";

        System.out.println("month name = " + name);
    }
}