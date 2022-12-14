package day29_ArrayListContinued;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        System.out.println("_____________ addAll(CollectionType): ___________________");

        // Bulk Operation: CollectionType
        // addAll(CollectionType): adds collection of values to the arrayList

        ArrayList<Integer> num1 = new ArrayList<>();

        // Arrays utility class --> asList(array of values) ===> returns the array as collectionType
        num1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 7));
        System.out.println(num1); // [1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 7]


        System.out.println("_____________ removeAll(CollectionType): ___________________");

        // removeAll(CollectionType): removes all the matching elements from the arraylist. We need to know what elements we want to remove
        num1.removeAll(Arrays.asList(1, 2, 3, 8));
        System.out.println(num1); // [4, 5, 6, 7, 7]

        System.out.println("_____________ retainAll(CollectionType): ___________________");

        // retainAll(CollectionType): removes all the non-matching elements from the arraylist (if the elements that we want to retain are known)

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(100, 500, 200, 300, 400, 700, 800));
        System.out.println(numbers); // [100, 500, 200, 300, 400, 700, 800]

        numbers.retainAll(Arrays.asList(100, 200, 300)); // retainAll method is going to remove the Objects that are not matching to the objects  passed within parenthesis. it is one of the Bulk operations, hence we still need to use asList method within Arrays utility.

        System.out.println(numbers); // [100, 200, 300]  // any elements that are not matching the argument will be removed.

        System.out.println("___________________________");

        ArrayList<String> jobTitles = new ArrayList<>();

        jobTitles.addAll(Arrays.asList("QA", "SDET", "Scrum master", "Developer", "SDET", "BA", "BA"));
        jobTitles.retainAll(Arrays.asList("SDET", "QA"));

        System.out.println(jobTitles); // [QA, SDET, SDET]

        System.out.println("_____________ containsAll(CollectionType): ___________________");

        // 	containsAll(CollectionType): checks if all the elements are contained in the arraylist

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        boolean r1 = nums.contains(2);
        boolean r2 = nums.contains(2) && nums.contains(4) && nums.contains(8);
        boolean r3 = nums.containsAll(Arrays.asList(2, 4, 8));

        System.out.println("r1 = " + r1); // r1 = true
        System.out.println("r2 = " + r2); // r2 = true
        System.out.println("r3 = " + r3); // r3 = true

        System.out.println("___________________________");

        String[] n = {"Josh", "Jack", "Daniel", "Shay", "Breanna"}; //
        /*
        option1:

        ArrayList <String> names = new ArrayList<>();
        names.addAll(Arrays.asList(n)); // <-- bulk operation and asList method from Arrays utility is used
        System.out.println(names); // [Josh, Jack, Daniel, Shay, Breanna]

         */

       // option2:
        ArrayList<String> names = new ArrayList<>(Arrays.asList(n)); // argument must be Collection type (one of the data structures).
        //	Collection: size is dynamic, does not support primitives. String is non-primitive, so passing Array variable within the parenthesis after calling asList method from Arrays utility converts it to the ArrayList

        System.out.println(names); // [Josh, Jack, Daniel, Shay, Breanna]

        System.out.println("___________________________");

        int[] arr = {1, 2, 3, 5, 6, 8, 9, 10}; // primitive Array data type, can not be converted into Collection type. In other words, can not use Arrays.asList method
        // We can not wrap the elements into objects by using autoboxing because there are more than 1 elements in Array variable named arr. Solution ---> create custom method and use loop!!!

        Integer[] arr2 = {1, 2, 3, 5, 6, 8, 9, 10}; // this is non-primitive Array

        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(arr2));  // Now we can add Array named arr2 directly into the ArrayList (part of the collection, it is a data structure).

        System.out.println(arr3); // [1, 2, 3, 5, 6, 8, 9, 10]

        System.out.println("___________________________");

        ArrayList <Integer> list2 = new ArrayList<>(convertArrayToArrayList(arr)); // arr Array variable declared in line 83
        System.out.println(list2); // [1, 2, 3, 5, 6, 8, 9, 10]


    }
    // this method converts primitive Array to the ArrayList
        public static ArrayList<Integer> convertArrayToArrayList(int[] array) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int each : array) { // take int array
            list.add(each); // add each of the element to the list in each iteration
        }
        return list;

    }

}
