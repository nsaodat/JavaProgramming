package day19_RecapLoopsAndStrings;

public class LoopsWithoutCurlyBraces {
    public static void main(String[] args) {

        System.out.println("_________________ Without Curly Braces ____________________");

        // only first statement gets executed within the loop conditions if we don't give curly braces. The second and more statements that follow after the first statement are executed only once and do not comply with Loop rules as they are outside the Loop. We need to place curly braces, if we want to execute more than one statement within the Loop

        for (int i = 0; i < 5; i++)

            System.out.println("EU 10"); // prints 5 times per loop's condition

        System.out.println("Cydeo"); // this statement is executed only once


    }

}
