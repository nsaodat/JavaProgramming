package day14_StringContinued;

public class StringMethodsContinued3_Substring {

    public static void main(String[] args) {
        System.out.println("_____________________ substring(beginningIndex , endingIndex) _______________________");
        // substring() method: creates substring starting from the given beginning index till the given
                                 // ending index (ending index is excluded) ---> substring(beginningIndex , endingIndex)
        // return type --> String

        //String str ="Cydeo School";
        //				   str.substring(0,  4+1) ==> Cydeo



        String word = "Cydeo School";
//                     012345678910


        String brand = word.substring(0, 4+1);// 0 represents 1st char, 4+1 represents last char

        System.out.println(brand); // Cydeo

        String str1 = word.substring(6); // to create a substring from the beginning of the last string, I only focus in
                              // finding the 1st index number of the last String and until the end of the String
                              // no need in passing the last index, as it is give by a default

        System.out.println(str1); // School

        System.out.println("-----------------------------------");
        String word2 = "Python C# Ruby";

        String s1 = word2.substring(0,  word2.indexOf(" ") ); //Python

        String s2 = word2.substring( word2.indexOf(" ")+1 ,   word2.lastIndexOf(" ") ); //C#

        //substring(beginningIndex): creates substring starting from the given beginning index till the end of the String
        //
        //					String str = "Cydeo School";
        //						  str.substring(6) ==> School

        String s3 = word2.substring( word2.lastIndexOf(" ")+1  ); // no need in passing the last index, as it is give by a default
                                                                                 // Ruby

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);




    }
}
