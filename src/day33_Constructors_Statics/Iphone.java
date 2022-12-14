package day33_Constructors_Statics;

public class Iphone {

    public static String brand = "Apple";

    public String model;

    public double price;

    public static String Os = "IOS";

    public String color;

    public String size;
    public static String madeIn = "China";

    public static boolean hasBattery =true;

    public static  boolean isTouchScreen = true;

    public static boolean hasFaceTime = true;


    public static void operatingSystem (){
        System.out.println(Os); // static method we call through the Class name, and that static is shared by all the Objects. No object is created
    }
    // public static void printModelAndPrice(){
    //    System.out.println(model+" : "+price); // static methods do not accept instances
    //  }


    public void method1(){
        System.out.println(model+" : "+price);

    }


}
