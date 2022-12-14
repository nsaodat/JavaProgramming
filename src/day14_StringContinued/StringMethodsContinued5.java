package day14_StringContinued;

public class StringMethodsContinued5 {
    public static void main(String[] args) {

        System.out.println("_____________________ isEmpty() _______________________");

// isEmpty(): this method checks whether the String is empty, the length must be 0
// return type --> boolean

        String word = "   "; // The length must be o, otherwise it will return false
        boolean valid = word.isEmpty();
        System.out.println(valid); // false - there is white space. The length is not 0


        System.out.println("_____________________ isBlank() _______________________");

// isBlank(): this method looks for characters. It does not care about white spaces, only chars
// return type --> boolean

        boolean valid1 = word.isBlank();

        System.out.println(valid1); // returns true - it does not care about the white spaces.


        System.out.println("_____________________ equals() _______________________");
// equals(): compares 2 Strings for the same text.
// Looks at the entire String
// return type --> boolean

        // Java is very key sensitive language.
        // If one string starts with Lowercase and another with UpperCase, then method will return false,
        // despite both Strings have the same text.

        String word1 = "java";
        String word2 = "Java";
        boolean str = word1.equals(word2);
        System.out.println(str); // false


        System.out.println("_____________________ equalsIgnoreCase() _______________________");
// equalsIgnoreCase(): compares 2 Strings without a key sensitivity.
// return type --> boolean

        boolean str2 = word1.equalsIgnoreCase(word2);

        System.out.println(str2); // true

        System.out.println("_____________________ contains() _______________________");
// contains(): this method verifies whether a String is included within the String (word within a text).
// Looks for parts of the String
// return type --> boolean

        String sentence = "I love Java programming language and would like to build on my interest.";

        boolean hasCSharp = sentence.contains("C#"); //false
        boolean hasJava = sentence.contains("Java"); // true
        boolean hasJavaLowerCase = sentence.contains("java");// false

// contains() method can not ignore the key sensitivity on its own.

        boolean hasJavaLowerCase2 = sentence.toLowerCase().contains("java"); // true
// String of text is converted
// into smaller case to bypass,then contains() method is called to check whether "java" is present
// in the given text.

        // if we want to ignore the key sensitivity with the contains() method, then firstly, we create UpperCase or LowerCase version of that String

        System.out.println(hasCSharp); // false
        System.out.println(hasJava);// true
        System.out.println(hasJavaLowerCase);// false
        System.out.println(hasJavaLowerCase2);// true


        System.out.println("____________________________________________");


        System.out.println("_____________________ startsWith() _______________________");
//startsWith(): checks if the String started with specific character/s
// return type --> boolean

        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo"); // true
        System.out.println(x); // true

        boolean y = a.startsWith("Oo");// false
        System.out.println(y); // false


        System.out.println("_____________________ endsWith() _______________________");

        boolean z = a.endsWith("Spoon");
        boolean w = a.toLowerCase().startsWith("spoon"); // First create a lower case or upper case version of                                             the String.
                                              // this is a way of ignoring the case sensitivity

        System.out.println();


    }


}
