package day17_WhileAndDoWhileLoops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AAABCDDD";
        String result = "";
               for (char i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i);// took each char in the String names str and converted the data type from ch to the String. This way we will be able to use String methods down the line for our code. contains() method only takes a String

            if (result.contains(ch))// if result already contains the same character
                continue;// skip
                result += ch;

        }
        System.out.println(result);

    }
}
