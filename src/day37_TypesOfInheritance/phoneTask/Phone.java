package day37_TypesOfInheritance.phoneTask;

public class Phone {// Only contains the common features of all subtasks

    public String make;
    public String model;
    public String size;
    public double price;
    public String colour;

    public static boolean hasBattery = true;

    public Phone(String make, String model, String size, double price, String colour) {
        this.make = make;
        this.model = model;
        this.size = size;
        this.price = price;
        this.colour = colour;
    }

   // static{
      //  hasBattery = true; // if static variable needs several steps to set it
   // }

    public void call(long phoneNumber){
        System.out.println(make + " " + model + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(make + " " + model + " is texting " + phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                ", colour='" + colour + '\'' +
                ", has battery='" + hasBattery + '\'' +
                '}';
    }
}

/*

 Create a class named Phone:
				Variables:
					brand, model, size, price, color
                Add Constructor to set all the fields
				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
  */