package day05_Concatenation;

public class ShippingAddress {

    /*

    Declare the following variables:
    name
    buildingNumber
    streetName
    city
    state
    zipCode
Use concatenation to print the full shipping address
    EX:
		Jimmy Joe
		7925 Jones Branch Dr
		McLean, VA 20125
     */

    public static void main(String[] args) {


        String name = "Barry Moore",
                buildingNumber = "58997B",
                streetName = "Ferry Lane",
                city = "Notting Hill",
                state = "LA",
                zipCode = "12548Y";

       // System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode);

        System.out.println("_______Concatenation returns a String value!!!______");

String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;

        System.out.println(address);


    }
}
