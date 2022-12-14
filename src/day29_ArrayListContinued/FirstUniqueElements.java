package day29_ArrayListContinued;

import java.util.ArrayList;

public class FirstUniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);

        System.out.println(list); // [1, 2, 1, 2, 3, 4, 5, 5]

        ArrayList<Integer> result = new ArrayList<>();


        for (Integer each : list) {
            int countFrequency = 0;
            for (Integer element : list) { // accessed every single element of the ArrayList
                if (element == each) { // finding the frequency of element against each other --> swapped element 1 to each
                    countFrequency++;
                }
            }

       /*
       for (Integer element : list) { // accessed every single element of the ArrayList
            if (element == 1) { // finding the frequency of element 1
                countFrequency++; // if condition is true then increase the frequency

            }

              }

        */
if (countFrequency == 1){
    System.out.println(each);
    break; // soon the 1st unique element is found exit the loop
}

        }

    }}

/*
1. Write a program that can return the first unique elements from an arraylist

			Do not use indexOf & lastIndexOf methods
 */