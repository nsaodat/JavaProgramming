package day12_Scanner;

import java.util.Scanner;

public class NextLine_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();

        scan.nextLine(); // --> need to take out enter key left in the scanner

        System.out.println("Enter your full name");
        String name = scan.nextLine();

        System.out.println("Enter your GPA:");
        double gpa = scan.nextDouble();
        scan.nextLine();// this will take out the enter key created by nextDouble () method

        System.out.println("Enter your school name: ");
        String schoolName = scan.nextLine();

        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);

        scan.close();
    }

}
