package day39_Encapsulation_Inheritance_RECAP.ShapeTask;

public class Rectangle extends Shape {
    // TOP TIP: Before extending the child class to parent class, it is advisable to add additional fields and methods, so that constructor can include them.
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0){ // adding additional conditions before setting length
            System.err.println("Invalid length: " + length);
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0){ // adding additional conditions before setting width
            System.err.println("Invalid width: " + width);
            System.exit(1);
        }
        this.width = width;
    }

    public Rectangle(double length, double width) {
        super("Rectangle"); // remove the additional data structure for name within the parameters and pass it when calling parent instance variable
       setLength(length);
    setWidth(width);
    }
// we need a different implementation of the method to the object of the subclass. Hence we override the method/s


    @Override
    public double area() { // Every single Object has its own copy of the instance. Meaning this method will stay within the object
        return width*length;
    }

    @Override
    public double parameter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area='" + area() + '\'' +
                ", parameter='" + parameter() + '\'' +
                '}';
    }
}

