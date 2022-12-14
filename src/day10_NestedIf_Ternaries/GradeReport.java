package day10_NestedIf_Ternaries;

public class GradeReport {

     /*
        90 ~ 100: Excellent
        80 ~ 89: Great
        70 ~ 79: Good
        60 ~ 69: Passed
        0 ~ 59: failed
         */


    public static void main(String[] args) {


    int score = 135;

        if(score >= 0 && score <= 100){ // if the score is valid (0 ~ 100 )
        // 5 possibilities: A, B, C, D, F
        if(score>= 90 ){ //false:  score < 90
            System.out.println("Excellent");
        }else if(score >= 80 ){ // false: score < 80
            System.out.println("Great");
        }else if(score >= 70){ // false: score < 70
            System.out.println("Good");
        }else if(score >= 60){// false: score < 60
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

    }else{ // if the score is NOT valid
        System.out.println("Invalid Score");
    }

        System.out.println("------------------------------------------");

    String result = ""; //  temporary value is assigned to a String in this example.The reason for using String is,
        //                          because every single if block will be printing a String message.
        //                                 it will contain the data we can use for single print statement.


        if(score >= 0 && score <= 100){ // if the score is valid (0 ~ 100 )

        if(score>= 90 ){ //false:  score < 90
            result = "Excellent"; // assigning the data to String variable result if the condition is true
        }else if(score >= 80 ){ // false: score < 80
            result = "Great"; // assigning the data to String variable result if the condition is true
        }else if(score >= 70){ // false: score < 70
            result = "Good"; // assigning the data to String variable result if the condition is true
        }else if(score >= 60){// false: score < 60
            result = "Passed"; // assigning the data to String variable result if the condition is true
        }else{
            result = "Failed";// assigning the data to String variable result if the condition is true
        }

    }else{ // if the score is NOT valid
        result = "Invalid Score";
    }


        System.out.println( result);

}
}
