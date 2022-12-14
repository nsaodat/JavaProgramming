package day16_ForLoop_StringPractices;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {

        String str = "CYDeo12345&^$$  ^*()  WoodenSpoon";
        String digits = ""; // to contain/represent the numbers - 12345
        String letters = ""; //to contain/represent the letters - CYDeoWoodenSpoon
        String specialChars = ""; // to contain/represent the characters - &^$$^*()

        for (int i = 0; i < str.length(); i++) {//i: index number of String named str (0 ~ last index)

            char ch = str.charAt(i); // we get each of the character from the String named str by using charAt() method

            if (ch >= '0' && ch <= '9'){
                digits += ch;
            }else if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'){
                letters += ch;
            } else{
              //  if (ch != ' ') --> if the special character not a space
                specialChars += ch;
            }

        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);


    }
}

