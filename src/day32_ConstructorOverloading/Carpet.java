package day32_ConstructorOverloading;

public class Carpet {

// this class is used to create Object somewhere else
    public double width, length, unitPrice;
    public  boolean isPersian;

// initialised all instances by the Constructor which will be used for each Object
    public Carpet(double width, double length, double unitPrice, boolean isPersian) {// <-- local variables
        this.width = width; // using this. is pointing to instance variables
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }
 // instance method because price for each of the Object will be different
    public double calculateCost(){
    double totalPrice = (width * length)*unitPrice;
    if (isPersian == true){ // if persian add 200 on top of the total price
        totalPrice +=200;
           }
    return totalPrice;
    }

    // instance method --> to display the full info of the Carpet object
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price= $" + calculateCost() +
                '}';
    }
}
/*
1.Carpet Task:
		1.1 create a custom class for the Carpet class that should contain the following:
                Attributes:
                        width, length, unitPrice, isPersian (boolean)

				Add a constructor to set all the instances

                Actions:
                    calcCost(): should be able to calculate the total cost of the carpet and return it as double
                    toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitprice

            if the carpet is persian  carpet, add 200$ to the totalPrice
 */