package day34_GarbageCollection_AccessModifiers;

public class Test {

    public static void main(String[] args) {

        // Here static block is executed via Circle class
        System.out.println(Circle.pi); // 3.14
        System.out.println(Circle.name); // Circle
        System.out.println(Circle.numbers); // [10, 20]


    }
}
