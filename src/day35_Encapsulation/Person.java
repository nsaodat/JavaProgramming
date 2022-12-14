package day35_Encapsulation;

public class Person {

    // instance variable --> if multiple copies are required when we create Objects

    // static variable -->  if object needs multiple steps to initialise/set, then we need a block of code (static block of code)

    // public modifier --> can be used in any package -->  E.g. public String name;

    // default modifier --> can not be used/reached outside the package it is located -->   E.g. String name;

    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman;
    public static  boolean hasNose;
    public static int numberOfWings, numberOfHead;


    // constructor is used for setting the instances
    public Person(String name, int age, char gender, String language) {
        this.name = name; // the only time we need to use this. is when the parameter is having the same name for the local variables
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    static{ // static block: designed for initialising the static variables. Static blocks or methods don't have direct access to instance variables
        // when value is common for every single object, then it is static

        // Static variables are called through the Class. Once the class is called static variable gets executed first and only once.
        
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfHead = 1;
        numberOfWings = 0;
    }

    public static void printPlanetName(){
        System.out.println("Planet name is "+planet);
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }


}




/*
1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize all the fields

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()

 */