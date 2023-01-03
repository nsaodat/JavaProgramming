package day43_OOP_Abstraction_Intro.car;

public final class Honda extends Car  {// If I turn the subclass to abstract class, then I won't be able to create an Object from the abstract class! Hence, it is not a good idea!

    public Honda(String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    @Override
    public void start() {// we can not have abstract from the parent in Sub class. Hence, we remove abstract keyword and complete the details by giving the implementation to the method
        System.out.println("Twist the key to ignition");
    }
}
