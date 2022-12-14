package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        System.out.println("_____________ remove(): ___________________");
// removes the element at the given index. Don't use inside the Loop
        ArrayList <Integer> list = new ArrayList<>();
        list.add(100);
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println("list = " + list); // list = [100, 100, 200, 300, 300, 400, 500]

    // int num =  list.remove(1); // [100, 200, 300, 300, 400, 500]
Integer num = 200; // non primitive, because it is a wrapper class
boolean r1 = list.remove(num);
        System.out.println(list); // [100, 100, 300, 300, 400, 500]

      //  list.remove(200); // 200 is taken as primitive - as index number. If we try printing the output then out of bound for length message will be displayed

        System.out.println(r1);// true

        System.out.println("_____________ clear(): ___________________");
// removes all the elements of the arraylist, size will be 0

        System.out.println(list.size()); // 6

        list.clear(); // the method removes all the elements from the ArrayList
        System.out.println(list.size()); // 0
        System.out.println(list); // []

        System.out.println("_____________ indexOf(Data) & lastIndexOf(Data): ___________________");
        // indexOf(Data) --> returns the first matching element's index number, returns int
        // lastIndexOf(Data) --> returns the last matching element's index number, returns int

        ArrayList <Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A');
        int b = characters.lastIndexOf('A');
        System.out.println(a); // 0
        System.out.println(b); // 5

        System.out.println("_____________ contains(Data): ___________________");
// returns true if the element is contained in the arraylist, otherwise returns false

      boolean r3 =  characters.contains('A'); // true
      boolean r4 = characters.contains('Z'); // false

        System.out.println(r3);
        System.out.println(r4);

        System.out.println("_____________ equals(ArrayList): ___________________");
// returns true if two arraylists are equal (same elements in same order), otherwise returns false

        ArrayList<Integer> list1 = new ArrayList<>(); // every time we use 'new' in the constructor we are creating a new object in a heap memory.
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2); // false <-- 2 different objects
        System.out.println(list1.equals(list2)); // true <-- returns true if two arraylists are equal (same elements in same order)

        System.out.println("_____________ isEmpty(): ___________________");

       boolean r5 = list1.isEmpty();
        System.out.println(r5); // false



    }
}
