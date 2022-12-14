package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;
    public static  String name;

    public static ArrayList <Integer> numbers;

    //public static Sheet sheet ; <--- requires few steps  1. locate the sheet; 2. read the sheet; 3. transfer the data from the sheet...

    public Circle(double radius){// we pass the argument if it will vary
        this.radius = radius;
        // do not declare static variables within Constructor, as it will repeat depending on the number of Objects, and it will take up a lot of space unnecessarily ---> pi = 3.14 (A BIG NO!)
    }

    static{ // static block gets executed automatically by itself  outside the class
        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);


    }
/*
// main method block can not be executed automatically by itself  outside the class
    public static void main(String[] args) {
        pi = 3.14;
        name = "Circle";
        numbers.add(10);
        numbers.add(20);
        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);

    }

 */


}
