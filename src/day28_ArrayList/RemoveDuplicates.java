package day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(10);
        list.add(10);
        list.add(40);

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            if (result.contains(each)){ // if result Arraylist contains each of the element
                continue;     // then skip
            }
            result.add(each); // add unique elements to result ArrayList
        }
        System.out.println(result); // [10, 20, 30, 40]
    }
}
