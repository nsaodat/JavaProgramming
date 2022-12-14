package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

// Relational Operators, related to boolean and returns true or false:
System.out.println("___________ > (greater), < (less), >= (greater or equal), <= (less or equal) ______________________");

//     Only can be applied for Numeric operators, CAN NOT BE applied to Strings



        boolean result = 20 > 40;

        System.out.println("result = " + result); // result = false

        boolean result1 =  300 >= 150; // there are 2 conditions (expressions) here, as long as one of the conditions are met,
                                      // then the boolean output will be true

        System.out.println("result1 = " + result1); // result1 = true

        boolean result2 = 100 >= 100;

        System.out.println("result2 = " + result2); // result2 = true

        boolean result3 = 300 >= 500;

        System.out.println("result3 = " + result3); // none of the conditions are true --> result3 = false

        // E.g. I want to apply for the loan
        // credit score of 720

        int creditScore = 720;
        boolean isEligibleForTheLoan = creditScore >= 720; // if the credit score is greater or equal to 720, then there is eligibility for the Loan

        System.out.println("isEligibleForTheLoan = " + isEligibleForTheLoan); // isEligibleForTheLoan = true
        boolean result5 = 100 < 120; // true
        System.out.println("result5 = " + result5); // result5 = true

        boolean result6 = 200 < 180; // false
        System.out.println("result6 = " + result6); // result6 = false

        int score = 75;
        boolean hasFailed =  score <= 59; // false
        //                      75 <= 59

        System.out.println("hasFailed = " + hasFailed); // hasFailed = false


        boolean result7 =  45 <= 60;

        System.out.println("result7 = " + result7); // result7 = true



        System.out.println("-----------------Equal Operator == -------------------------");

        int x = 100;
        int y = 200;

        boolean equal =   x == y;
        //               100 == 200

        System.out.println("equal = " + equal); // false

        boolean result8 =   "Muhtar" == "Good Guy" ;

        System.out.println("result8 = " + result8); // false

        boolean result9 = 'A' == 'a';

        System.out.println("result9 = " + result9);// false

        boolean result10 =  "Java" == "Java";
        System.out.println("result10 = " + result10); // true

        //"Hello World" ==  "hello world" ==> false

        System.out.println("--------------------- Not Equal Operator != ----------------------------");

        boolean result11 =  100 != 200.5;
        System.out.println("result11 = " + result11); //true

        boolean result12 =  "Java" != "Break";
        System.out.println("result12 = " + result12); // true

        boolean result13 = 13 != 13;
        System.out.println("result13 = " + result13); // result13 = false






    }
}
