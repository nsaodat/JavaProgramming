package day07_Operators;

public class LogicalOperators {


        public static void main(String[] args) {

            System.out.println("______________USE of LOGICAL OPERATOR: && (both) __________________");

            // &&: both
            //	in logical and operator, both expressions need to be true in order to return true

            int age = 19;
            String citizen = "USA";
            String name = "Jason";

            boolean eligibilityToVote = age >= 18 && citizen == "USA"; // && logical operator means both conditions MUST be met, otherwise it will return false
            //                            19  >= 18 && citizen == USA
            //                              true    && true ===> true

            System.out.println(name + " is eligible to vote: " + eligibilityToVote);


            System.out.println("_____________________________________________________________");

            // Application for the Loan

            String name1 = "Josh";
            int creditScore = 800;
            int age2 = 18;
            double income = 65000;

            boolean eligibilityForLoan = creditScore >= 700 && age2 >= 21&& income >= 60000;

            System.out.println(name1 + " is eligible for Loan: " + eligibilityForLoan); // Josh is eligible for Loan: false --> due to age being 18


            System.out.println("______________USE of LOGICAL OPERATOR: || (either) __________________");

            // ||: either ( || --> called pipeline key on the keyboard)
            // in logical or operator only one expression needs to be true in order to return true
            // write a code to check eligibility4USCitizenship

            String name5 = "Kerry";
            String countryOfBirth = "Uk";
            boolean marriedToUSCitizen = false;

            boolean eligibility4USCitizenship = countryOfBirth == "USA" || marriedToUSCitizen == true;

            System.out.println(name5 + " is eligible for US citizenship: " + eligibility4USCitizenship); // Kerry is eligible for US citizenship: false



            System.out.println("_____________________________________________________________");

            // Application for Scholarship
            String student = "Ali";
            double gpa = 2.5;
            double familyIncome = 52_000;
            boolean isEligible4Scholarship = gpa >= 3.5 || familyIncome <=60000; // in either logical operator,
            // only one expression needs to be true in order to return true

            //                                   false  || true
            //                                         true ===> eligible for Scholarship

            System.out.println(student + " is eligible for Scholarship: " + isEligible4Scholarship); // Ali is eligible for Scholarship: true





            System.out.println("______________USE of LOGICAL OPERATORS: && (both) and || (either) together__________________");

            // Write a code to find out the eligibility for conscription --> compulsory enlistment for state service, typically into the armed forces

            String name3 = "Jay";
            int age3 = 38;
            char gender =  'F';

            //                                       one expression    &&     another expression
            boolean eligibilityToRegisterForAccount =  age3 >= 18       &&  (gender == 'M' || gender == 'F'); // parenthesis is used for grouping, used to calculate separately
            //                                          38 >= 18        &&     ('F' == 'M' || 'F' == 'F')
            //                                            true          &&        false    ||    true
            //                                             true         &&         true
            //                                                     true

            System.out.println(name3 +" is eligible to register: " +eligibilityToRegisterForAccount); // Jay is eligible to register: true


            System.out.println("______________USE of LOGICAL OPERATOR: ! (Not) __________________");

            boolean awesomeTunaSandwich = true;
            boolean awesomeSalmonSandwich = !awesomeTunaSandwich;

            System.out.println("awesomeSalmonSandwich = " + awesomeSalmonSandwich); // awesomeSalmonSandwich = false
            System.out.println("awesomeTunaSandwich = " + awesomeTunaSandwich);  // awesomeTunaSandwich = true

            System.out.println("_____________________________________________________________");

            int score = 80;

            boolean passed = score >= 60;

            boolean failed = !passed;

            System.out.println("passed = " + passed); // passed = true
            System.out.println("failed = " + failed); // failed = false


        }
}
