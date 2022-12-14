package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setInfo("Toyota","Camry", "Blue", 2022, 28000);

        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("Jaguar", "4455is", "white", 2018, 45000);
        System.out.println(car2);

        // how to create Array to store objects' data

        Car [] cars = {car1,car2};
        // however Array is limiting, best to use is ArrayList

        ArrayList <Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2));

        System.out.println(carsList);
        
        // print the objects' data split by categories, USE LOOPS:

        for (Car each : carsList) {
            System.out.println(each.make + ": " + each.price);
        }

        System.out.println("___________________________________________________________");

        /*
        eligible for recall:
        Toyota: 1995 ~ 1997
        Jaguar: 2018 ~ 2021
         */

        carsList.removeIf(p-> p.make.equals("Toyota") && p.year >= 1995 && p.year <= 1997);
        carsList.removeIf(p-> p.make.equals("Jaguar") && p.year >= 2018 && p.year <= 2021);



    }
}
