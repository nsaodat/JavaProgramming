package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.pi;  // imports one static member of a class
import static utilities.MathUtility.*; // imports all static members of a class

public class StaticImport {
    public static void main(String[] args) {

        // no need to call through the class name after static import
        System.out.println(Circle.pi); //<-- no need to call through the class, although it prints --> 3.14
        System.out.println(pi); //3.14

        System.out.println("______________________________________________________");

        // find sum of 10, 20
        int r1 = sum(10, 20);
        System.out.println(r1); // 30

        // find the sum of 100,200
        int r2 = sum(100, 200);
        System.out.println(r2); // 300

        System.out.println("______________________________________________________");

        int r3 = subtract(500,325);
        System.out.println(r3); // 175


    }

}
