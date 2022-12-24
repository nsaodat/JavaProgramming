package day40_ProtectedAccessModifier_FinalKeyword;

public class Animal {

    private String name;
    final private String breed; // if the instance variable value is constant for the particular animal, then we could make them final in order to prevent them from modification via getters & setters methods
    final private char gender;
    final private String color;
    private String size;
    private int age;

// in order to use the above instances we need an Object, because instance variables belong to the Object.

    public Animal(String name, String breed, char gender, String color, String size, int age){
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.age = age;
    }

    // setter can never be created for the unmodifiable variable, as it defeats the logic.

   public String getName(){
        return name;
   }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    // ------------ Setters --------------

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // ------------ Setters --------------

    public void eat(){
        System.out.println(name + " is eating");
    }

   public final void drink (){ // implementation of this method can not be changed/overridden because we used final word in the method
        System.out.println(name + " is drinking");
    }
}
