package day31_CustomClass_Constructors;

public class RectangleObjects {
    public static void main(String[] args) {


        Rectangle rectangle1 = new Rectangle(2.8,3.9);

        Rectangle rectangle2 = new Rectangle(8.8,5.9);


        System.out.println(rectangle1); // toString method is already calling the instance method to calculate the area
        System.out.println(rectangle2);// toString method is already calling the instance method to calculate the perimeter



    }
}
