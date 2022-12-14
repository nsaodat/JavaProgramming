package day32_ConstructorOverloading;

public class CarObject {
    public static void main(String[] args) {

        Car car1 = new Car("Volvo");

        Car car2 = new Car("Volvo", "sportage");

        Car car3 = new Car("Lexus", "RX350", 2021);

        Car car4 = new Car("BMW", "X6", 2020, 50000);

        Car car5 = new Car("Tesla", "Model 3", 2019, 70000, "Black");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

    }
}
