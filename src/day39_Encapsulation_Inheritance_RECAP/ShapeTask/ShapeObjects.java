package day39_Encapsulation_Inheritance_RECAP.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Square square = new Square(52.3);
        square.setSide(12);
        System.out.println(square );


        System.out.println("_____________________________");

        Rectangle rectangle = new Rectangle(5, 6);
        rectangle.setLength(10);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle);

        System.out.println("_____________________");

        Circle circle= new Circle(-10);
        System.out.println(circle);

    }
}
