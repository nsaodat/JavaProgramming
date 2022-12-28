package day42_Exceptions_Continued;

import java.util.NoSuchElementException;

public class Throw_Keyword2 {
    public static void main(String[] args) {

        // we can not create a throw exception for checked exceptions.  compile will show an error --> throw new InterruptedException();

       throw new NoSuchElementException("No Such Element");// <-- unchecked exception is compatible with throw keyword for creating a manual exception.

        // compiler will not print the code after the manual exception. Message wont print --> System.out.println("Hello World!");
    }
}
