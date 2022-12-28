package day42_Exceptions_Continued;

import day39_Encapsulation_Inheritance_RECAP.ShapeTask.Square;

import java.util.NoSuchElementException;

public class Throw_Keyword2 {
    public static void main(String[] args) {

         // throw new InterruptedException(); // --> we can not create a throw exception for checked exceptions.  compile will show an error


       throw new NoSuchElementException("No Such Element");// <-- unchecked exception is compatible with throw keyword for creating a manual exception.

        // a class can have multiple constructors by method overloading:
        // - default constructor --> throw new NoSuchElementException ();
        // - constructor with a String message --> Parent class constructor takes the String argument as a message
        // exceptions should have is a relationship with Throwable, otherwise we CAN NOT USE THROW keyword!

        // compiler will not print the code after the manual exception. Message won`t print --> System.out.println("Hello World!");

       // throw new Square()  -->  Square class is not throwable as it is not a child or grandchild of Throwable exception
    }
}
