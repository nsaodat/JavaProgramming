package day29_ArrayListContinued;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {

        System.out.println("_______________ converting Array to ArrayList & vice versa __________________");
      String [] countries = {"Armenia", "Uzbekistan", "United Kingdom", "United States", "Japan", "Russia"};

      System.out.println(Arrays.toString(countries));//[Armenia, Uzbekistan, United Kingdom, United States, Japan, Russia]

        ArrayList <String> list = new ArrayList<>(Arrays.asList(countries));

        System.out.println(list);//[Armenia, Uzbekistan, United Kingdom, United States, Japan, Russia]

        list.removeIf(p-> p.length() >=10);

        System.out.println(list);// [Armenia, Japan, Russia]

       //  converting ArrayList to Array
        countries = list.toArray(new String[0]); // [0]: represents temporary size which is going to be replaced by the size of the ArrayList we are replacing it with

        System.out.println(Arrays.toString(countries));



    }
}
/*
1. create an Array of string called countries
2. write a program that can remove all the country names that have length of 10 or greater
 */