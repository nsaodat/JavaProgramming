package day36_Inheritence.animal;

public class Tiger extends Animal {// Tiger is Animal. Soon Tiger becomes subclass, it takes all the variables and methods from Animal Class

    public void roar (){
        System.out.println(name + " is roaring");
    }

    public void hunt(){
        System.out.println(name + " is hunting");
    }


}
/*
Tiger class has inherited from animal class:
        6 variables
        6 methods

        created 2 more methods relevant to Tiger Class

 */