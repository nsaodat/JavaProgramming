package day37_TypesOfInheritance.animal;

public class Parrot extends Animal {

    public String parrotWingColour; // <-- independent variables characteristic to the class can be set like this

    public Parrot(String name, String breed, char gender, String size, int age, String color, String parrotWingColour) { // add the additional instance variable into the parameter
        super(name, breed, gender, size, age, color);
        this.parrotWingColour = parrotWingColour; //  initialize the instance variable

    }
}
