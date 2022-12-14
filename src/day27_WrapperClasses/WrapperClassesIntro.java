package day27_WrapperClasses;

public class WrapperClassesIntro {
    public static void main(String[] args) {


        int num1 = 200;

        Integer n1 = num1; // autoboxing <-- turning the primitive into Object.
        // Object --> instance of the Class

        int n2 = n1; // unboxing

        System.out.println("_________________________________________");

        Integer integerValue = 100;

        long longValue = integerValue; // primitives accept any wrapper class values as long as they are within the range

        Byte b1 = 25;
        byte b2 = b1;

        System.out.println("_________________________________________");

        int num2 = 10;
       // Long l2 = num2; <-- can not convert the int primitive to Long wrapper class
      //  Double d1 = num3;

        Integer num4 = num2; //autoboxing


        System.out.println("------------------------------------");

        Integer z = 900;
        Integer y =z;

        System.out.println("---------------------------------");

        int[] numbers1 = {1,2,3,4,5};
        Integer[] numbers2 = {1,2,3,4,5}; // Array supports both the primitive and non-primitive




    }
}
