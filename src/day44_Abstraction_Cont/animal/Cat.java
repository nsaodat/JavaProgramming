package day44_Abstraction_Cont.animal;

import day44_Abstraction_Cont.Animal;

public class Cat extends Animal {
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "eats Biryani");
    }

}

/*
Cat
					eat(): eats Biryani
 */