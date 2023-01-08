package day44_OOP_Abstraction_Cont.animal;

public final class Tiger extends Animal implements WildAnimal {

    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats deer");
    }

    @Override
    public void huntMethod() {
        System.out.println(getName() + " is hunting a prey");
    }
}

/*
Tiger
					eat(): eats deer
 */