package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {

        /*
        Garbage Collection: Collection of unreferenced objects

		unreferenced objects:
			1. null keyword:
					String str = "Java";
					str = null;


			2. creating a new object

					String str = "Java";
					str = "Python";

         */
 /*
        //  int n = null;
       String str = null;
        System.out.println( str.toUpperCase() );
         */

        String str = "Wooden Spoon"; // after line 13, "Wooden Spoon" will be eligible for garbage collection
        str = null;

        System.out.println( str );



        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        dog1  =     new Dog();
        dog1.name = "Max";

        System.out.println(dog1);

        String language = "Python";
        language    =   "Java";

        System.out.println(language);

        System.out.println("-----------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1 ;

        list2.addAll(Arrays.asList(200, 300, 400));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2 );




        System.out.println("------------------------------");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = l1;
        l2.add("Python");


        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);




    }
}
