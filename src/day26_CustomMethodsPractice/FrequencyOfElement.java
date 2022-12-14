package day26_CustomMethodsPractice;

public class FrequencyOfElement {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 1, 1};

        int n = frequencyOfElement(arr, 1);

        System.out.println(n);

        System.out.println("__________");

        double[] arr1 = {1.1,2.3,3.3,3.3,5.5,3.3};
      double n2 =  frequencyOfElement(arr1,3.3);
        System.out.println(n2);

        System.out.println("__________");

        char[]arr3 = {'a','b','c','k', 'k','k'};
        System.out.println(frequencyOfElement(arr3, 'k'));;
    }

    // the method returns the frequency of the given element from the given Array
    public static int frequencyOfElement(int[] array, int element) {

        int count = 0; // we need to count each time the given number is matching with the elements in the Array

        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }
    
    // the method returns the frequency of the given element from the given Array
    public static int frequencyOfElement(double[] array, double element) {

        int count = 0; // we need to count each time the given number is matching with the elements in the Array

        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    // the method returns the frequency of the given element from the given Array
    public static int frequencyOfElement(char[] array, char element) {

        int count = 0; // we need to count each time the given number is matching with the elements in the Array

        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }
    
    // the method returns the frequency of the given element from the given Array
    public static int frequencyOfElement(String[] array, String element) {

        int count = 0; // we need to count each time the given number is matching with the elements in the Array

        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
    }
}

