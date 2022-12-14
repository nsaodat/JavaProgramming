package day37_TypesOfInheritance.phoneTask;

public class Nokia extends Phone {
    public Nokia(String model, String size, double price, String colour) {
        super("Nokia", model, size, price, colour);
    }

    public void selfDefence(){
        System.out.println("You can use " + make + model+ " as self defence tool");
    }
}
