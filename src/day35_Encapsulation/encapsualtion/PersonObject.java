package day35_Encapsulation.encapsualtion;

public class PersonObject {
    public static void main(String[] args) {


        Person p1 = new Person(); // compiler gives a default constructor if not set by us in the class.
        Person p2 = new Person();

        System.out.println(p1.getName()); // null, since noname has been assigned to the name instance variable

        p1.setName("Boris");
        System.out.println(p1.getName()); // Boris

        p1.setAge(50); // as long as the given number is valid, setter will accept it and set to the instances of that particular Object. Conditions to setter method is given in the Class
        System.out.println(p1.getName() + " : " + p1.getAge()); // Boris : 50


    }

}
