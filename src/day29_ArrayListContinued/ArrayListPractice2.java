package day29_ArrayListContinued;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList <String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Ahmad", "Adam", "Ali", "Jim","David", "Mike", "Leyla", "Neo"));

        employees.retainAll(Arrays.asList("Ahmad", "David")); // this method decreases the size of the ArrayList and removes un - matching elements
        System.out.println(employees); //[Ahmad, David]

        System.out.println( "_____________________________________________________________________");

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};
        ArrayList <String> list = new ArrayList<>(Arrays.asList(names)); //  new ArrayList<>: only takes Collection type, hence names variable is converted to Collection by using asList method.

        list.removeIf(p-> p.charAt(0) == 'M'); // remove the elements from the list, if the first char in each of the element equals to 'M'

        System.out.println(list); // [Sumeyra, Hasan, Beril]

        names = list.toArray(new String [0]); // use toArray (data type [size]) method in order to convert ArrayList to Array

        System.out.println(Arrays.toString(names)); // [Sumeyra, Hasan, Beril]



    }
}
