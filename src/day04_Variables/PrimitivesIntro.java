package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        /*
        ________________________________________

        Numerical primitives:

        double > float > long > int > short > byte
        __________________________________________
         */

        // age: 38 years old

        byte age = 38; // variable name must be meaningful, thus readable

        // weight: 160 pounds
        //  byte weight = 160;  // 160 is out of byte' range
        //  byte num = -129; // -129 is out of byte' range
        short weight = 160; // 160 is within the range of short

        // salary

        int salary = 200_000;// int is the preferred data type for integer numbers


        long asset = 3_333_333_333L;


        //tax: 0.26
        float tax = 0.26F;

        double PI = 3.14;


        System.out.println("_______________char_________________");


        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);

        char ch4 = 15000;
        System.out.println("ch4 = " + ch4);

        char gender = 'F';

        char grade = 'F';

        char yesNo = 'Y';

        System.out.println(yesNo);

        //  char ch5 = 'AB';


        System.out.println("________boolean__________");


        boolean isEmployed =  true;
        boolean isMarried = false;

        boolean result =  100 > 300 ; // output --> false | expression evaluated to true or false!

        System.out.println("isEmployed = " + isEmployed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        System.out.println("_____________String_____________");
        // We use String when we need to give a string of text, and it needs to be inside the ""

        String name =  "Wooden Spoon";
        String city = "McLean";
        String state = "Virginia";
        String country = "USA";

        // String name = "John";

        System.out.println("name = " + name);
        System.out.println("city = " + city);

        String first_name$ = "Muhtar";
        int num1 =100;
        int num2 = 200;

        //int private = 300;

        double salaryAfterTax = 2.5;
        //int salaryAfterTax = 3.5;









    }

}
