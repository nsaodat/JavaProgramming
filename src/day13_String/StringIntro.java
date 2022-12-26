package day13_String;

public class StringIntro {
// import java.lang.String <--- String is imported from lang.package. It is imported implicitly by the compiler, therefore no need in importing manually like we do for the Scanner!
// String Class is designed for char sequences (combination of multiple characters) in Java
// Java can read around 65000 characters. If we combine these chars, then they will turn into String.
// Class --> a template, that specifies what object needs. Classes are meant to be for Objects. eg. "Java" <--> object
// Every single character in the String has a number.The numbers are called an index number. They follow the index numbers, hence are printed in order.
// index number starts from 0. Index numbers depend on how many characters we have in the String.
// EG.
//index number        01234
//Characters         "Cydeo"
    //
    //String is immutable --> once the object is created, it can not be modified

    // There are 2 ways of creating String Object:

    // - By String LITERAL
    // Eg. String str = "Wooden Spoon"; //<-- Java Heap memory allocated for this String object and sends the object into String Pool (VIP), making it special. Object consumes memory!
    //Local variables (variables that are referencing the Object) created within the block are saved in Stack



    public static void main(String[] args) {
        System.out.println("________________ String LITERAL ____________");
        // One way of creating a String object!

        // If String Literal object have the same sequence of char in the same order, then only
        //                   one of the objects goes into String Pool. String Pool does not take duplicates.
        String name = "Wooden Spoon";
        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";
        String name4 = "Wooden Spoon";

        System.out.println(name == name2); // true
        System.out.println(name2 == name3); // true
        System.out.println(name3 == name4); // true

        // name, name1, name2, name3, name4 ---> all pointing at 1 Object in the String Pool.
        //                                    This is an Advantage of the String Literal



        System.out.println("________________ New String Object ____________");
        // Second way of creating a String Object!

        // new --> means brand new Object
        // Objects starting with new are stored outside the String Pool in the heap.
        // Everytime new is used, it creates a new different object in the heap.
        //EG. 3 new Objects below, and they are not the same!

        String str1 = new String("Wooden Spoon");
        String str2 = new String("Wooden Spoon");
        String str3 = new String ("Wooden Spoon");

        System.out.println(str1 == str2); // false
        System.out.println(str2 == str3); // false
        System.out.println(str1 == str3);// false






        System.out.println("_______________ Comparison of Visible texts of 2 String variables with_equals() ___________");


        // equals method checks the value, not the memory allocation of the Objects

        String s1 = "Java";
        String s2 = new String ("Java");
        System.out.println(s1.equals(s2)); // true

        System.out.println("__________________________________________________________________________");

        String s3 = "Java";
        String s4 = new String ("java");
        System.out.println(s1.equals(s2)); // false

}
}