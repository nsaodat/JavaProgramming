package day24_CustomMethod_Return;

public class ReturnMethodPractice2 {
    public static void main(String[] args) {
    /* check the grade
   'A' == Excellent
   'B' == Good
    */
        String result = grade(100);
        System.out.println(result);

        if (result.equals("A")){
            System.out.println("Excellent");
        }else if (result.equals("B")){
            System.out.println("Great");
        }else if (result.equals("C")){
            System.out.println("Good");
        }else if (result.equals("D")){
                System.out.println("Passed");
            }else{
                System.out.println("Try again");
            }
    }


    // create a function that can calculate the Grade

    public static String grade(int score) { // I can reuse grade method. Value that is returned can be re-assigned or re-used

        String result = "";

        if (score < 0 || score > 100) {
            result = "Invalid";

        } else {
            result = (score >= 90) ? "A" : (score >= 80)? "B" :(score >= 70) ? "C" : (score >= 60) ? "D" : "F";

        }
        return result;
    }

}