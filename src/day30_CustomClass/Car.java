package day30_CustomClass;

public class Car {

    // custom classes are used for creating the templates of the objects.

    public String make;
    public String model;
    public String color;
    public int year;
    public double price;


    public void setInfo(String carMake, String carModel, String carColor, int carYear, double carPrice) {
        make = carMake;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }

    public void drive() {
        System.out.println("Driving "+ make + " "+ model);
    }

    public void start() {
        System.out.println("Starting "+ make + " "+ model);
    }

    public void stop() {
        System.out.println("Stopping "+ make + " "+ model);

    }

}


/*

	Attributes:
		make, model, color, year, price

	Actions:
		drive(), start(), stop(), toString(), setInfo()
 */