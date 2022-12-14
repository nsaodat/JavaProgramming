package day28_ArrayList;


import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        System.out.println("________________ add(element): ________________");
        //add(Data): adds the data after the last index of the ArrayList

        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(30);// this process is called autoboxing
        numbers.add(50);
        numbers.add(90);
        numbers.add(8);
        numbers.add(5);
        numbers.add(0,100);   // add(index, Data): inserts the data at the given index

        System.out.println(numbers); // [100, 30, 50, 90, 8, 5]

        System.out.println("________________ size(): ________________");
        // returns the element at the given index from the ArrayList
        System.out.println(numbers.size()); // 6

        int lastIndexNumber = numbers.size()-1; // returns the total number of elements
        System.out.println("Last Index Number = " + lastIndexNumber); // 5

        System.out.println("________________ get(element) ________________");

        // returns the element at the given index

        int num = numbers.get(4);
        System.out.println(num);// 8

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " "); // 100 30 50 90 8 5

        }
        System.out.println();
        System.out.println("________________________________");

        ArrayList <String> students = new ArrayList<>();
        students.add("Dasha");
        students.add("Pasha");
        students.add("Kesha");
        students.add("Masha");
        students.add("Kesha");

        System.out.println("_______________ set(): _________________");
        // replaces the element at given index with the new element.

        students.set(1,"Vanya");// replaces with new given element E.g. "Vanya"
        students.set(2,"Lyonya");
        System.out.println(students); // [Dasha, Vanya, Lyonya, Masha, Kesha]

        System.out.println("_____________ remove(): ___________________");
        // removes the given object from the ArrayList (first matching), and returns boolean
// don't use inside the Loop


        ArrayList <String> employees = new ArrayList <>();

        employees.add("Leyla");
        employees.add("Maria");
        employees.add("Stuart");
        employees.add("Hilola");
        employees.add("Olga");

        System.out.println(employees); // [Leyla, Maria, Stuart, Hilola, Olga]

        employees.remove(0);
        System.out.println(employees); // [Maria, Stuart, Hilola, Olga]
        employees.remove(0);
        employees.remove(0);
        System.out.println(employees); // [Hilola, Olga]
        employees.remove(employees.size()-1);
        System.out.println(employees); // [Hilola]

        System.out.println("________________________________");
        boolean r1 = employees.remove("Hilola");
        System.out.println(employees); // []
        System.out.println(r1); // true


        // Also removes the element at the given index from the ArrayList

        ArrayList <String> groceryList =  new ArrayList<>();

        groceryList.add("Apple");
        groceryList.add("Banana");
        groceryList.add("Pear");

        System.out.println(groceryList); // [Apple, Banana, Pear]
        groceryList.remove(2);

        System.out.println(groceryList); // [Apple, Banana]


    }
}
