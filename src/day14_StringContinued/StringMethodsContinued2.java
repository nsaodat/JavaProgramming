package day14_StringContinued;

public class StringMethodsContinued2 {

    public static void main(String[] args) {


        System.out.println("_____________________ replace(oldValue, newValue) _______________________");

        // replace() method - we pass 2 arguments when we call this method
        //                      1. old value, 2. new value
        // NOTE: this method replaces all the matching value passed in the argument.
        // returns --> new String

        String str = "Java is fun, I love learning Java";
        str = str.replace("Java", "C#"); // the method can not modify the object, it can only crete a new String object.
        // therefore we need to assign it back to the variable

        System.out.println(str);// C# is fun, I love learning C#

        String email = "JohnSmith@yahoo.com"; // change the domain of the email to gmail

        email = email.replace("yahoo", "gmail");

        System.out.println(email); // JohnSmith@gmail.com

        System.out.println("__________________________________________________________________");

        String sentence = "Java Java Python Python C# C# C++ C++ Python  Python    Python Python";
        String sentence2 = sentence.replace("Python", ""); // Java Java   C# C# C++ C++
        sentence2 = sentence2.replace("   ", " "); // Java Java C# C# C++ C++


        System.out.println(sentence);
        System.out.println(sentence2);

        String s = "Dog Dog Dog Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog", "Cat");
        System.out.println("s = " + s); // s = Cat Cat Cat Cat Cat Cat Cat Cat Cat

        System.out.println("_____________________ replaceFirst(oldValue, newValue) _______________________");

        // replaceFirst() method - returns a new String by replacing the FIRST matching old values with the given new value.
        // returns --> new String

        String s1 = "Dog Dog Dog Dog Dog Dog Dog Dog Dog";
        s1 = s1.replaceFirst("Dog", "Cat");
        System.out.println(s1);//Cat Dog Dog Dog Dog Dog Dog Dog Dog

        String result = "Java Java Java";

        //result = result.replace("Java", "Python");
        result = result.replaceFirst("Java", "Python");
        System.out.println(result); //Python Java Java

        String result2 = "C# is fun, C# is cool";

        result2 =  result2.replaceFirst("C#", "Java");

        System.out.println(result2);//Java is fun, C# is cool

        String result3 = "Java";
        result3 = result3.replaceFirst("va", "vo"); //"Jova"

        System.out.println(result3);//Javo

    }
}
