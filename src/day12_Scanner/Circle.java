package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle in decimals");
        double radius = input.nextDouble(); // this allows me to get the User input. Line 11 --> I used the last time the methods of the Scanner

        double area = radius * radius * 3.14;
        double perimeter = 2 * radius * 3.14;

        System.out.println(area);
        System.out.println(perimeter);


        input.close();// closing the Scanner


    }
}

/*
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
            	Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = 2 * radius * PI
 */