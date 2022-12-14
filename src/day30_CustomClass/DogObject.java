package day30_CustomClass;

import java.util.ArrayList;

public class DogObject {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Lucy";
        dog1.color = "White";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.breed = "Husky";
        dog1.size = "Medium";

        Dog dog2 = new Dog(); // this object is independent from dog1 object. Each object has a separate copy of the instance variables.
        dog2.name = "Rex";
        dog2.color = "White & BLack";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.breed = "Husky";
        dog2.size = "Large";

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "Brown", 8, 'M', "German Shepard", "Large");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat(); // Lucy is eating

        dog3.bark(); // Jack is barking

        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Yellow", 8, 'M', "Pit-Bull", "Extra Large");

        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "White", 2, 'M', "Labrador", "Large");

        Dog [] dogs = {dog1, dog2, dog3, dog4};

        ArrayList <Dog> femaleDogs = new ArrayList<>();
        ArrayList <Dog> maleDogs = new ArrayList<>();

    }


}
