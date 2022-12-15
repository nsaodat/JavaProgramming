package day38_OOPInheritanceCont_MethodOverriding.carTask;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry", 2020, 20000, "silver", 124568);
        Tesla tesla = new Tesla("Model S", 2022, 100000, "black", 3000);
        BMW bmw = new BMW("S200", 2018,45000, "yellow", 45000);

        // One method, but different implementations when we override methods
        toyota.start(); // Twist the key to ignition to start Toyota Camry
        tesla.start(); // Say "Start" to start Tesla Model S
        bmw.start(); // Call mechanic to jump start BMW S200



    }
}
