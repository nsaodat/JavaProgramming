package day13_String;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {
        // charAt(index): expects to pass index number. Returns the character at the given index --> returns char

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        scan.close();

        char f = firstName.charAt(0); // always pass index number with char.At() method. Since it returns a char, I can assign it to the char variable
        char l = lastName.charAt(0); // always pass index number with char.At() method. Since it returns a char, I can assign it to the char variable
        String initials = f + "." + l;
        System.out.println("initials = " + initials);


    }
}