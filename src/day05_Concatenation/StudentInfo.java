package day05_Concatenation;

public class StudentInfo {

    /*
 Create a class called StudentInfo, and declare variables for the followings:
    			1. student name (String)
    			2. age (int)
    			3. gender (char)
    			4. school name (String)
    			5. phone number (String) (###)-###-####
    			6. full time (boolean)


     */

    public static void main(String[] args) {


        String student_name = "Muhtar";
        int age = 45;
        char gender = 'M';
        String school_name = "Cydeo";
        String phoneNumber = "(000)-895-7859";
        boolean full_time = false;
        double GPA = 2.5;

        System.out.println("student_name = " + student_name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("school_name = " + school_name);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("full_time = " + full_time);
        System.out.println("GPA = " + GPA);

    }


}
