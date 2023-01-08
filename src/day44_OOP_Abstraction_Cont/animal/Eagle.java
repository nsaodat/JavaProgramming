package day44_OOP_Abstraction_Cont.animal;

import day44_OOP_Abstraction_Cont.Animal;

public final class Eagle extends Animal {
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats snake");
    }
}

/*
Eagle
					eat(): eats snake

 */