package day20_Array;


import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        // Use this technique when sure how many elements, but  unsure what elements I need to store in the Array
        // syntax: data type [] variable name = new data type [length of Array or number of elements];
        // Then --> call the index 0 through the variable name and assign the element
        // REMEMBER -->  [] --> used to declare an Array variable or if calling the elements of the Array variable


        // E.g. create a variable that's capable enough to store 5 names/elements

        String [] names = new String [5]; // the length of this Array is set to 5


        names [0] = "Gunay"; // --> I call the index 0 through the variable names and assign the element
        names [1] = "Neira";// --> I call the index 1 through the variable names and assign the element
        names [2] = "Suat";// --> I call the index 2 through the variable names and assign the element
        names [3] = "Hulya";// --> I call the index 3 through the variable name and assign the element
        names [4] = "Mikael";// --> I call the index 4 through the variable name and assign the element




        System.out.println(names);// [Ljava.lang.String;@2f7c7260 <-- hashcode error message

        System.out.println("======================================================");

        System.out.println(Arrays.toString(names));//when object is initiated --> [Gunay, Neira, Suat, Hulya, Mikael]

        // [null, null, null, null, null] <-- when no object is initiated to non primitive data


        System.out.println("========================================================");

        // Use this technique when sure what & how many elements I need to store in the Array
        // syntax: data type [] variable name = {data1 or element1, data2/element2, data3/element3,...);

        //index numbers:      0         1           2           3          4          5          6
        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days)); // <-- calling the method to print all the elements of the Array. this method is only used for single dimensional Array

        System.out.println("========================================================");

        int n = 5; // this number is representing Friday
        if (n < 1 || n >7) {
            System.out.println("Invalid number");
            System.exit(0);
        }
        System.out.println(days[n-1]); // Friday

        System.out.println("========================================================");
// index number:            0            1        2        3       4       5       6        7        8
String [] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
   //        9           10        11
        "October", "November", "December"};

int number = 7;
        System.out.println(monthNames[number-1]); // July


    }
}
