package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {

        char ch = 'F';

        String message;

        switch(ch){

            case 'A':
            case 'B':
            case 'C':
            case 'D':
            message = "Passed";
            break;
            case 'F':
                message = "Failed";

            default:
                message = "Invalid";

        }

        System.out.println(message);

    }
}
