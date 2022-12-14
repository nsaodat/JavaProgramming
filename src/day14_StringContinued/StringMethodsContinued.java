package day14_StringContinued;

public class StringMethodsContinued {

    public static void main(String[] args) {

        System.out.println("_____________________ trim() _______________________");

        // trim method is used for removing white spaces (unnecessary spaces) from the String.
        // Any spaces we did not use is white spaces. If we are not using the space for separating, then these are White spaces.
        // Returns --> new String  without white spaces

        // white spaces normally are seen at the beginning and end of the String
        String str1 = "               batch EU10                              ";

        str1 = str1.trim(); // always assign it after calling the method to original variable, otherwise new Object will not
        // be recognised by the original variable

        System.out.println(str1);

        System.out.println("_____________________ indexOf() & lastIndexOf() _______________________");
        // We use both methods when we do not know the index numbers!
        // Both methods are used in getting the index numbers from the String, as long as we know
                        // what specific character we are looking for.

        // indexOf() method: pass the char I am looking for. The method checks the String and what index number the character has occurred,
        // Returns --> int - the index number for this char

        String str2 = "Cydeo School"; // I want to check char 'h'.
        int n1 = str2.indexOf('h'); // pass h. The method will start looking from the left of the String, once found the 'h',
        // the method will return int.

        System.out.println("n1 = " + n1); // n1 = 8

        int n2 = str2.indexOf("ool");// compiler reads from left to right. Here it will be looking at char 'o' and print the index number
        System.out.println("n1 = " + n2);// n1 = 9


        String str3 = "Java Programming language";

        int n3 = str3.indexOf("amm");// compiler reads from left to right. Here it will be looking at char 'a' and print the index number
        System.out.println(n3); // 10

        int n4 = str3.indexOf("gua"); // compiler reads from left to right. Here it will be looking at char 'g' and print the index number
        System.out.println(n4); //20

         // lastIndexOf() method: The best method for finding out index number of the last occurred char.
        // This method looks for the characters from right to the left, making it the opposite of indexOf() method.

        int n5 = str3.lastIndexOf("g"); // last occurred character 'g'

        System.out.println("n5 = " + n5); // 23

        System.out.println("__________________________________________________________________________");

        String s = "Java Nova Cava Wawa orange";
        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        // int fourthA = s.indexOf("ava W");
        // int fourthA = s.lastIndexOf("av");
        int fourthA = s.indexOf("Ca") + 1;
        // int fifthA = s.lastIndexOf("va") + 1;
        int fifthA = s.lastIndexOf("a W") ;
        int sixthA = s.lastIndexOf("aw");
        //int seventhA = s.indexOf("a o");
        int seventhA = s.lastIndexOf("a ");


        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);







    }
}
