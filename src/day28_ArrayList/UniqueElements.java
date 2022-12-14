package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();

        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("C#");
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("Python");
        list.add("Ruby");
        list.add("Python");
        list.add("C#");
        list.add("C#");
        list.add("C#");
        System.out.println(list); // [Java, Java, Java, C#, Java, Python, Java, Python, Ruby, Python, C#, C#, C#]

        ArrayList <String> unique = new ArrayList<>();

        for (String each : list) {
            if (list.indexOf(each) == list.lastIndexOf(each)){
                unique.add(each);
            }
        }
        System.out.println(unique); // [Ruby]



    }
}
