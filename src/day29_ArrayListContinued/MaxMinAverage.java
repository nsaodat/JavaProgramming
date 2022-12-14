package day29_ArrayListContinued;

import java.util.ArrayList;

public class MaxMinAverage {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        System.out.println(list);

        int max = list.get(0);
        int min = list.get(0);
        int sum =  0;

        for (Integer each : list) { // <-- using this loop to find the sum of all the numbers as well
            if (each > max){
                max = each;
            }
             if (each < min){
                 min = each;
             }
             sum += each; // finding the sum of the numbers
        }
        System.out.println(sum); // 45
        System.out.println(list.size()); // size of the ArrayList is 9

// average number is decimal most of the time, hence we are using double below
        double average = (double) sum / list.size(); // casting of integer to double --> 45.0/9 = 5.0



        System.out.println("max = " + max); //9
        System.out.println("min = " + min);// 1
        System.out.println("average = " + average);// 5.0




    }
}
