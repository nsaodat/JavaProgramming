package day41_Exceptions;

import day39_Encapsulation_Inheritance_RECAP.CydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {
    public static void main(String[] args) {

        // UNCHECKED EXCEPTION EXAMPLE
        int a = 10;
        int b = 0;
        //System.out.println( a / b); // a number can not be divided by a zero --> result is UNDEFINED
        // whilst compiling no exception detected. Throws exception when the codes are run, hence we call it unchecked exception. Once the compiler detects the exception, we can not run the rest of our code.

        // System.out.println("Wooden Spoon");

        System.out.println("__________________________________");

        //                     0    1    2
        char[] characters = {'A', 'B', 'C'};

        // System.out.println(characters[99]); // unchecked exception --> Index 99 out of bounds for length 3

        System.out.println("__________________________________");

        Student student = null; // there is no object, hence no attributes are set. We can not call any Student object method in our coding since no Object is created.

        // System.out.println(student.getName()); // NullPointerException
        // student.study();
        System.out.println("__________________________________");

        String str = "Wooden Spoon";
        str = null;
        System.out.println(str);// null

        String str2 = "   "; // object != null
        System.out.println(str2.isEmpty()); //false
        System.out.println(str2.isBlank()); //true due to white spaces

        System.out.println("__________________________________");
        // CHECKED EXCEPTION EXAMPLE:

        System.out.println("Hello");

          // Thread.sleep(3000); // checked --> InterruptedException

        System.out.println("Cydeo");


       // FileInputStream file = new FileInputStream("path of the file"); // checked --> unhandled FileNotFoundException

        //System.out.println("Java".charAt(1000)); // unchecked --> THROWS String index out of range: 1000 EXCEPTION

    }
}
