package day24_CustomMethod_Return;

public class ReturnMethodIntro_Reverse {
    public static void main(String[] args) {

        String str = "lEvel";
String result = reverse(str);

        System.out.println(result);

        if (str.equalsIgnoreCase(result)){
            System.out.println(str + " is palindrome");
        }else{
            System.out.println(str + " is not palindrome ");
        }

    }

    public static String reverse(String str){

        String result = "";

        for(int i = str.length()-1; i >=0; i--){
           result += str.charAt(i);
        }
        return result;



    }
}
