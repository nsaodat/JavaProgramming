package day16_ForLoop_StringPractices;

public class Reverse {
    public static void main(String[] args) {

        String str = "Wooden Spoon";

        String result = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            result+= str.charAt(i);
           }

        System.out.println(result);
    }
}

/*
Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */