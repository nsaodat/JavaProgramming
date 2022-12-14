package day03_EscapeSequences;

/*
Escape sequences: MUST be given with double quote

    \n: starts a new line
    \t: paragraph space(tab)
    \\: single back slash
    \": double quote


 */

public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("Java \nPython \nC#");

        System.out.println("_______________________________");

        System.out.println("Hello Team! \nHow are you all today? \nIt's nice to meet you all!");
        System.out.println("_______________________________");
        System.out.println("\tJava is cool \tProgramming Language");
        System.out.println("_________________________________");
        System.out.println("/ \\"); // in order to print one backward slash we need to give two backward slashes
        System.out.println("_________________________________");
        System.out.println("My favourite show is \"Strictly Come Dancing\".");// in order to print double quote, we need to use \"



    }

}
