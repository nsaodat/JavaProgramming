package day31_CustomClass_Constructors;

public class Rectangle {

    // instance variables
    public double length, width;

    // Constructor
    public Rectangle(double length, double width) { // we want to set 2 attributes/instance variables of this class, hence we are passing parameters. The moment we create the Object from the class, we need to use the constructor, and it means by the time we are ready to use the object the parameters will be ready to be  initialized
        // Constructor gets executed as soon as we create the Object from this class
        this.length = length;
        this.width = width;
    }
    // instance method --> to calculate the area of the rectangle
    public double calculateArea(){
        return length * width;
    }
    // instance method --> to calculate the perimeter of the rectangle
    public double calculatePerimeter(){
        return 2* (length + width);
    }
// instance method --> to display the full info of the Rectangle object
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calculateArea() +
                ", perimeter=" + calculatePerimeter() +
                '}';
    }
}

/*
create a custom class named Rectangle
    Attributes:
        length, width
    Add a constructor that can set all the fields
    Actions:
        calculateArea(): calculates the area of the rectangle, returns it as double
        calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
     	toString(): displays the width, length, area and perimeter of the rectangle when an object of rectangle passed in the print statement
 */