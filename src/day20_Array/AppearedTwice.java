package day20_Array;

public class AppearedTwice {
    public static void main(String[] args) {
        char[] chars = {'A', 'A', 'A', 'B', 'C', 'C', 'D', 'D', 'D'};

        for (int j = 0; j < chars.length; j++) {
            char ch = chars[j];
            int countFrequency = 0;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == ch) { // if element at Array named chars' is equal to each of chars at ch elements
                    countFrequency++; // then, increase the frequency
                }
            }
            if (countFrequency == 2){ //  if the frequency is equal to 2, then print out that character
                System.out.println(ch);
            }
        }


    }
}
