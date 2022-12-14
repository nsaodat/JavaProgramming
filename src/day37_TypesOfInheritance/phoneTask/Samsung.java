package day37_TypesOfInheritance.phoneTask;

public class Samsung extends Phone{
    public Samsung(String model, String size, double price, String colour) {
        super("Samsung", model, size, price, colour);
    }

    public void freeze (){
        System.out.println(make + model + " is freezing");
    }

}
