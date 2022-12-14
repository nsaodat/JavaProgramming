package day10_NestedIf_Ternaries;

public class Ternaries_Intro {

    public static void main(String[] args) {

        /*
        Ternaries: shortcut of if statement

        if:        (Condition)?
 	else:                 :
 	else if:   :(Condition)?

         */

        // when the statement returns the same data type, then we can apply ternaries

        int n = 100;

        if (n % 2 == 0) {
            System.out.println("Even"); // data type -->String
        } else {
            System.out.println("Odd"); // data type -->String
        }
        System.out.println("____________________________________________________");

        // Ternaries are meant to return the value. Hence, we pass the value after if condition
        String result = (n % 2 == 0) ? "Even" : "Odd"; // By assigning it to a String variable we are making the code reusable

        System.out.println(result);

        System.out.println("____________________________________________________");

        int age = 10;

       /*

        if (age >=21){

            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
          */

      //   (age >=21)?"Eligible":"Not eligible"; // we can pass the entire code in print statement or assign to a new variable and make it reusable by passing the variable nly in print statement
        System.out.println((age >=21)?"Eligible":"Not eligible");


        System.out.println("____________________________________________________");

       String result2 = (age >=21)?"Eligible":"Not eligible"; // the statement returns a String variable, therefore we store it into a String variable
    // also making the code reusable is a preferred way!"
        System.out.println(result2);

        System.out.println("____________________________________________________");





    }
}