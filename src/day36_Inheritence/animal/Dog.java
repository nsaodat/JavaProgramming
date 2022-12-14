package day36_Inheritence.animal;

public class Dog extends Animal { // Dog is an Animal
//           child       parent

// subclass can have its own unique method saved in the custom class.
    public void bark() {
        System.out.println(name + " is barking");// this relates to dog Class
    }

}

/*
dog class has inherited from animal class:
        6 variables
        6 methods

       created 1 more methods relevant to dog Class
 */