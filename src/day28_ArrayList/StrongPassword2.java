package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {

String password = "Cydeo83";

int countUpperCase = 0;
int countLowerCase = 0;
int countDigit= 0;
int countSpecialChar = 0;
        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);
            if (Character.isUpperCase(each)){
                countUpperCase++;
            }else if (Character.isLowerCase(each)){
                countLowerCase++;
            }else if (Character.isDigit(each)){
                countDigit++;
            } else{
                countSpecialChar++;
            }

        }
        System.out.println("countUpperCase = " + countUpperCase);
        System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countDigit = " + countDigit);
        System.out.println("countSpecialChar = " + countSpecialChar);

        boolean hasUpperCase = countUpperCase > 0;
        boolean hasLowerCase =countLowerCase > 0;
        boolean hasDigit = countDigit > 0;
        boolean hasSpecialChar = countSpecialChar > 0;

       // option1:  boolean strongPassword = password.length() >= 8 && !password.contains(" ") && hasDigit && hasLowerCase && hasUpperCase&&hasUpperCase; // as long as one condition is false, then the password is not strong

        boolean strongPassword = false; // option2
        if (password.length() >= 8){
            if (!password.contains(" ")){
                if (hasDigit){
                    if (hasLowerCase){
                        if (hasSpecialChar){
                            if (hasUpperCase){
                                strongPassword = true;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("strongPassword = " + strongPassword); // false
    }
}
