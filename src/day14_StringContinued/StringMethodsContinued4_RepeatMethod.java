package day14_StringContinued;

public class StringMethodsContinued4_RepeatMethod {

    public static void main(String[] args) {

        System.out.println("_____________________ repeat() _______________________");

        // repeat(count): repeats the string for given number of times. Concatenates the String to itself
        // Returns --> String

        String str = "Cydeo ";
        String str1 = str.repeat(5);

        System.out.println(str1); // Cydeo Cydeo Cydeo Cydeo Cydeo

        System.out.println("___________________________________________________________");

        System.out.println("LOL\n".repeat(5));

        System.out.println("___________________________________________________________");

        // concatenate the String to a space then call the method to
        // repeat it as many times as I want.

        String word = "Success ";

       // System.out.println(word.repeat(5));
        System.out.println( (word + " ").repeat(5) ); // Success Success Success Success Success

    }


}
