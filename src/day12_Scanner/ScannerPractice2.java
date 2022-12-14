package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {


        System.out.println("___________________ Use of next.Boolean() method in Scanner _________________");

        Scanner scan = new Scanner(System.in);

        System.out.println("Pls enter true or false");

        boolean result = scan.nextBoolean();

        System.out.println("___________________ Use of next() method in Scanner _________________");
        // next() --> reads the input as a String and reads till the space
        System.out.println("Enter your name");
        String name = scan.next(); // java
        System.out.println("name = " + name);

        scan.close();



    }

}
