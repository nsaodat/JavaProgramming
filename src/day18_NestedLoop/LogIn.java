package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username");
        String username = scan.next();

        System.out.println("Enter your password");
        String password = scan.next();

        boolean validCredentials = username.equals("Cydeo") && password.equals("Cydeo123");
        int attempt = 0;

        if (validCredentials) {
            System.out.println("Logged In");

        } else {
            for (int i = 1; i < 3; i++) {
                System.err.println("Incorrect Username or Password, please re-enter");
                System.out.println("Enter your username");
                username = scan.next();

                System.out.println("Enter your password");
                password = scan.next();



                if (validCredentials) {
                    System.out.println("Logged In");
                                        break;
                }

            }

            if (!validCredentials){
                System.out.println("Account Locked, contact technical team");
        }
    }
scan.close();
    }
}
