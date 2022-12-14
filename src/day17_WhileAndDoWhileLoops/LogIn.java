package day17_WhileAndDoWhileLoops;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

// username: "Cydeo"
// password: "Cydeo123"


        // while (invalidPassword && hasAttempts)

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = scan.next();

        System.out.println("Enter your password:");
        String p = scan.next();


        if (u.equals("Cydeo") && p.equals("Cydeo123")) {// if credentials are valid

            System.out.println("Logged in");

        } else {
            int attempt = 3; // 3, 2, 1

            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempt > 0) {// while the credentials are invalid and user still has attempt
                System.out.println("Incorrect Username or Password, please re-enter");
                System.err.println("Enter your username:");
                u = scan.next();

                System.err.println("Enter your password:");
                p = scan.next();
                attempt--; // decrease the attempts by one.  3 to 0
            }

            if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                System.out.println("Logged in");
            } else {
                System.out.println("Your account is locked");
            }


        }
        scan.close();
    }
}

/*

you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123
        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts
                to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
 */