package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Try_CatchBlocks {
    public static void main(String[] args) {

        // Popular methods of exception objects are:
        // - printStackTrace(): prints a stack trace (full details) of the exception
        // - getMessage(): returns only brief description of the exception


        System.out.println("Test1 started");

        try{

            System.out.println(9/0);

            System.out.println("Try Block");

        }catch (ArithmeticException e){

            System.out.println("Catch Block");

            System.out.println("Arithmetic Exception was occurred");

        }

        System.out.println("Test1 Completed");

        System.out.println("------------------ printStackTrace() ------------------");

        System.out.println("Test2 started");

        int[] numbers = {1,2,3,4,5};

        try {

            System.out.println(numbers[200]);

            System.out.println("Try Block");

        }catch (RuntimeException e){

            e.printStackTrace();// printStackTrace() method gets a full report of the exception that has occurred during the runTime. Always placed inside the catch block. We will be using this for html report when automating

            // System.out.println( e.getMessage() );

        }


        System.out.println("Test2 Completed");

        System.out.println("--------------------------------------------------");


        System.out.println("Test3 started");


        try {
            System.out.println("Cydeo".substring(2, 0)); //---> everytime when exception occurs, object of the exception is                                         created and we are catching it in the catch block

        }catch (RuntimeException e){ // since we cant memorise all the exception classes, we use parent of all the unchecked                          exceptions ---> RuntimeException
            e.printStackTrace();
        }

        System.out.println("Test3 completed");


        System.out.println("--------------------------------------------------");


        System.out.println("Hello");


        try {

            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Cydeo");


        System.out.println("------------------------------------------");


        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }






    }
}
