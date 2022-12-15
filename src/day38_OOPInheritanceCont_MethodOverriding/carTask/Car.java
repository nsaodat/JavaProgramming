package day38_OOPInheritanceCont_MethodOverriding.carTask;
import java.lang.Object; // Object class is imported implicitly. It is built in the parent Class and inherited by children Classes

public class Car {
    public String brand, model;
    public int year;
    public double price;
    public String color;
    public int miles;

    public Car(String brand, String model, int year, double price, String color, int miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

 public void start() {
        System.out.println(brand + model + " is starting");
    }
        public void drive () {
            System.out.println(brand + model + " is driving");
        }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }
}


/*
carTask:
		Create a class called Car
			instance variables:
				brand, model, year, price, color, miles

				add a constructor to set all the fields

			instance methods:
				start(), drive(),toString()
 */