package day10_NestedIf_Ternaries;

public class NestedIf_Intro {

    public static void main(String[] args) {

        // Nested if == precondition

        int score = 95;


        if(score>= 0 && score <= 100){ // if score is valid

            if (score >= 60) { // if the score is equal or greater than 60
                System.out.println("Passed");
            }else { // if the score is less than 60
                System.out.println("Failed");
            }


        }else{ //if the score is not valid

            System.out.println("Invalid score");

        }

        System.out.println("-----------------------------------");

        int age = 21;
        boolean hasId = true;

        if(hasId){ // if the person has an ID
            // if this pre-condition is met, then there are 2 possible outputs
            // if not met, then there is only 1 possible output

            if(age>= 21){ // if the person is 21 years old or older
                System.out.println("Eligible to buy alcohol");
            }else{ // if the person is less than 21 years old
                System.out.println("Not eligible to buy alcohol");
            }

        }else{ // if the person does not have an ID
               // only 1 possible output, as above precondition has not been met
            System.out.println("You must have an ID to buy alcohol");
        }


        System.out.println("-------------------------------------------");

        int number = 10;

        // 1 <= number <= 7 <--- this is Ok in maths. But Java will only accept these expressions with Logical && / || Operators

        if(number >= 1 && number<= 7){ // if the number is a valid number (1~7) then there are 7 possible outputs
              // Nested if is used, when one if condition can be evaluated for several options/alternatives

            if(number == 1){
                System.out.println("Monday");
            }else if(number == 2){
                System.out.println("Tuesday");
            }else if(number == 3){
                System.out.println("Wednesday");
            }else if(number == 4){
                System.out.println("Thursday");
            }else if(number == 5){
                System.out.println("Friday");
            }else if(number == 6){
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");
            }

        }else{ // if the number is not valid
            System.out.println("Invalid Number");
        }







    }

    }

