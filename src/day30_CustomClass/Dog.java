package day30_CustomClass;

public class Dog {
    // Custom class is used for creating an object, not for running the codes
    // instance variables are declared inside the class, outside any other methods
   // The data stored in an object are called fields

// no static keyword means more copies for as many times for objects
    public String name;
    public String color;
    public int age;
    public char gender;
    public String breed;
    public String size;

    // set the attributes of the object
    public void setInfo(String dogName, String dogColor, int dogAge, char dogGender, String dogBreed,String dogSize ){
        name = dogName;
        color = dogColor;
        age = dogAge;
        gender = dogGender;
        breed = dogBreed;
        size = dogSize;
    }


   // instance methods:
    public void eat(){
        System.out.println(name + " is eating");
    }
    public void bark(){
        System.out.println(name +" is barking");
    }

   /* public String toString(){
        return "Name: " + name;
          }
        */

    // use the shortcut to print the custom objects by passing them in the print statement
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

/*
Fields (Attributes) --> instance variables (meaning they will have separate copies for each of the object):

name;
color;
age;
gender;
breed;
size;


Actions:
eat();
play();
bark();....

 */