package day20_Array;

public class UniqueElementsOfArray {
    public static void main(String[] args) {

        String[] words = {"Java", "Java", "Java", "C#", "Python", "Python"}; // C# is unique
// the is no firstIndexOf or lastIndexOf methods in the Array, therefore we need to find the frequency of every single element in the Array. Starting from the first element and so forth....

        for (int j = 0; j < words.length; j++) { // outer loop is responsible for assigning every element within the array during each time when the loop runs
            String element = words[j]; // j: represents index numbers of the Array
            int frequencyOfCount = 0; // whatever the frequency of the element is we will store in this variable

            for (int i = 0; i < words.length; i++) { // inner loop is responsible for finding the frequency of element from Array
                if (words[i].equals(element)) {
                    frequencyOfCount++;
                }
            }

            if (frequencyOfCount == 1) {
                System.out.println(element); // C#
            }
        }
    }
}
