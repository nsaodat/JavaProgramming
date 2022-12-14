package day24_CustomMethod_Return;

public class ReturnStatement {
    public static void main(String[] args) {
        nameOfMonth(10);

    }


    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfMonth(int number) {

        if (number < 1 || number > 7) { // if the number is less than  1 or number is greater than 7
            System.out.println("Invalid Entry");
            return;//  exit the method if the above condition is true
        }

            if(number == 1) {
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("Friday");
            } else if (number == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }
        }
    }
