package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {


        System.out.println("___________________ Use of nextLine() method in Scanner _________________");

// the only method that reads Enter key is  ---> nextLine() method

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String name = input.nextLine(); // Nafisa RavshanovaEnterkey

        System.out.println("Write your age");
        int age = input.nextInt(); // enter key stays in Scanner's memory and gets assigned to the next line.
                          // we need to take out the enter key that is ignored by the nextLine method

        input.nextLine(); // this method will clear out the above defect

        System.out.println("What is your profession?");
        String profession = input.nextLine();


        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("profession = " + profession);


input.close();

    }
}
