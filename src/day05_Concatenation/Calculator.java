package day05_Concatenation;

public class Calculator {
    public static void main(String[] args) {

        // 100 + 50 = 150

        // 100 - 50 = 50

        // 10* 50= 5000

        int firstNumber = 100;

        int secondNumber = 50;

        int addition = firstNumber + secondNumber;

        int subtraction = firstNumber - secondNumber;

        int multiplication = firstNumber * secondNumber;


        System.out.println("_____one way of calculation______");

        System.out.println( firstNumber + " + " + secondNumber + " = " + (firstNumber+secondNumber)); // called grouping -->(firstNumber+secondNumber)

        System.out.println("_____another way of calculation______");

        System.out.println(firstNumber + " + " + secondNumber + " = "+ addition);

        System.out.println(firstNumber + " - " + secondNumber + " = " + subtraction);

        System.out.println(firstNumber + " * " + secondNumber + " = " + multiplication);




    }


}
