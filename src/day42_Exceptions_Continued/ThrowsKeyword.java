package day42_Exceptions_Continued;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("_________________ Test1 _____________________");
        System.out.println("Hello");

        Thread.sleep(3000);
        System.out.println("Cydeo");

        System.out.println("_________________ Test1 completed _____________________");

        System.out.println("_________________ Test2 _____________________");

        System.out.println("Hello");
        Thread.sleep(3000);


        System.out.println("World!");

        System.out.println("_________________ Test2 completed _____________________");

    }
}
