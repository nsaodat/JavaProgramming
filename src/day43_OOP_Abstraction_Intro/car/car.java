package day43_OOP_Abstraction_Intro.car;

public abstract class car { // we can not create Objects from abstract classes, because they are not concrete!
    private final String make, model;
    private String color;
    private final int year;
    private double price;

    public car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        setColor(color);

        if (year < 1886){
            throw new RuntimeException("Invalid Year: "+ year);
        }
        this.year = year;// create a condition that the right data is provided, otherwise the programme gets terminated. Condition --> line 14

        if (price <= 0){ // we give the conditions before setting the year, so that it can throw an exception if requirements are not met!
            throw new RuntimeException("Invalid price: " + price);
        }
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }


   public  abstract void stop(); // class MUST be abstract class for abstract methods to compile!!!
// Abstract method is meant to be overridden and has no body, so that sub-classes can add implementation to the method!
    // final and abstract keywords DO NOT GET ALONG!



}
