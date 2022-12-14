package day15_ForLoops;

import java.util.Scanner;

public class ReplaceX {

    public static void main(String[] args) {

        System.out.println("Enter a word"); //  "xcodeX"
        String word = new Scanner(System.in).next();

        if (word.contains("x") || word.contains("X")){
            word = word.replace("x", "a").replace("X", "a");
        }
        System.out.println(word);
    }
}
/*
2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea

 */