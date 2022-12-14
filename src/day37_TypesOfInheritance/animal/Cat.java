package day37_TypesOfInheritance.animal;

public class Cat extends Animal{

    // place the cursor after Super class, then hold ALT and hit enter button twice to generate the constructor from Parent  Class
    public Cat(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
    }

    public void scratch(){
        System.out.println(name + " is scratching");
    }
}
