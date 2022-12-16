package day39_Encapsulation_Inheritance_RECAP.ShapeTask;

public class Square extends Shape{// side variable can not be inherited from Shape to Square Class

    private double side;

    public double getSide() {

        return side;
    }

    public void setSide(double side) {
        if (side <=0){
            System.err.println("Invalid entry");
        System.exit(1);
        }
        this.side = side;
    }

    public Square( double side) {
        super("Square");
        setSide(side);// we want to include setSide, because we want all the requirements to be transferred over from setter to the constructor

    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double parameter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "area=" + area() +
                "parameter=" + parameter() +
                '}';
    }
}

/*

/*
Square extends Shape:
	variables:
		side;
	Encapsulate the field
	Add a constructor to set the filed
	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */
