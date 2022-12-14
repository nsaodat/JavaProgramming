package day37_TypesOfInheritance.animal;

public class Dog extends Animal{

//  place the cursor after Super class, then hold ALT and hit enter button twice to generate the constructor from Parent  Class
    public Dog(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
    }

    public void bark(){
        System.out.println(name + " is barking");
    }

}
