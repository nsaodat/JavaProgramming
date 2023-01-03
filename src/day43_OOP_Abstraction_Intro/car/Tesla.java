package day43_OOP_Abstraction_Intro.car;

public final class Tesla extends Car{ // we make the class final, to stop the inheritance by other classes
    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Say \"start\"");
    }

    public void autoPilot(){
        System.out.println(getMake() + " " + getModel() + " has auto-pilot feature");
    }
}
