package day17_WhileAndDoWhileLoops;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        String word = "Cat cat dog Dog dog caTcat";
        int countFrequency = 0;

        for (int i = 0; i <= word.length()-3; i++) {//subtraction  of 3: so that i does not go outside the range of index numbers when we subtract  each of them in Line 10.
            String eachSub = word.substring(i, i+3); // i: represents 0 in this scenario, since the beginning index is 0
            //  0+3: represents beginning of index plus all index numbers of the given String.

            //System.out.println(eachSub); // prints out possible substring for the given String

            if (eachSub.equalsIgnoreCase("cat")){ // if each extracted substring equalsIgnoreCase to "cat", then increase the count by 1
                countFrequency++; // increasing the frequency of the count by 1
            }
        }

        System.out.println(countFrequency);

    }
}
