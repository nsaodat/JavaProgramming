package day37_TypesOfInheritance;

class A {
public A(){// default constructor

    System.out.println("A");
}

}

class B extends A{
public B (){
    // super () <-- we have super keyword by a default (implicit)

    System.out.println("B");
}
}


public class ConstructorPractice {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj); // A B
    }
}
