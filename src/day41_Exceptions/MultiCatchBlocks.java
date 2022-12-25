package day41_Exceptions;

import day39_Encapsulation_Inheritance_RECAP.CydeoTask.Employee;
import day39_Encapsulation_Inheritance_RECAP.ShapeTask.Rectangle;

public class MultiCatchBlocks {
    public static void main(String[] args) {

        // Multiple Catch Blocks:

        // If the code in the try block will be capable of throwing more than one type of exception
        // To specify all the possible exceptions that could be thrown
        // Parent exception class can not be placed before child exception class

        Employee employee = null;

        System.out.println("test started");
        try{
                System.out.println(employee.getSalary()); // Null Pointer Exception
        }catch (IndexOutOfBoundsException e){
            System.out.println("First catch block");
            e.printStackTrace();

        }catch(ArithmeticException e){
            System.out.println("Second catch block");
            e.printStackTrace();

        }catch(ClassCastException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch(RuntimeException e){ // none of the exceptions mentioned in above blocks will be able to handle the exception since they do not have is a Relationship, except for the parent exception or the actual exception itself
            System.out.println("Forth catch block");
            e.printStackTrace();
        }

        System.out.println("Test completed");

        System.out.println("-----------------------------------------------------------");


        try{
            System.out.println("Java".charAt(-1));
        }catch (RuntimeException e){
            e.printStackTrace();
        }

    }
}
