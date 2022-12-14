package day36_Inheritence.animal;

import org.w3c.dom.ls.LSOutput;

public class Cat extends Animal{

    // subclass can have its own fields saved in the custom class.
    public void meow() {
        System.out.println(name + " is meowing"); // <-- method belongs to cat class
    }


    public void scratch() {
        System.out.println(name + " is scratching"); // <-- method belongs to cat class
    }


}

/*
the following the cat Class has inherited from Animal class:
        6 variables
        6 methods

        created 2 more methods relevant to cat Class
 */