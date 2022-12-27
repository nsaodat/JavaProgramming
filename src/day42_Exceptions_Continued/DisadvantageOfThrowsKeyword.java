package day42_Exceptions_Continued;

public class DisadvantageOfThrowsKeyword {


    // Whoever calls the method that has throws keyword in its signature is responsible to handle it or declare it again
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");
        sleep(2.5); // throws


        System.out.println("World!");

        System.out.println("_____________________________________");
        System.out.println("Hello");
        MorningWorkOut.sleep(2.5); // try & catch    Calling the sleep method through the class named MorningWorkout since the sleep method is static

        System.out.println("Cydeo!");
    }

    public static void sleep(double seconds) throws InterruptedException {
        Thread.sleep((long) (seconds * 1000));
    }

}