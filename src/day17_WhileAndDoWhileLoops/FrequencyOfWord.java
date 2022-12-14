package day17_WhileAndDoWhileLoops;

public class FrequencyOfWord {
    public static void main(String[] args) {
//                     012345678910
        String word = "JavaJavaJavajavaJaVA";// Java has 4 characters. I will need to think of possible substrings for the String that has 4 characters.
        // we need to use the index numbers of the String, instead of creating substring method one by one, we better use For Loop

        int countFrequency = 0;

        for (int i = 0; i <= word.length()-4; i++) {//subtraction  of 4: so that i does not go outside the range of index numbers when we subtract  each of them in Line 12.
           String eachSub = word.substring(i, i+4); // i: represents 0 in this scenario, since the beginning index is 0
                                   //  0+4: represents beginning of index plus all index numbers of the given String.

            //System.out.println(eachSub); // prints out possible substring for the given String

            if (eachSub.equalsIgnoreCase("Java")){ // if each extracted substring equalsIgnoreCase to "java", then increase the count by 1
                countFrequency++; // increasing the frequency of the count by 1
            }
        }

        System.out.println(countFrequency);
    }
}
/*
 write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3


           	Str = "JavaJava";

           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)

 */