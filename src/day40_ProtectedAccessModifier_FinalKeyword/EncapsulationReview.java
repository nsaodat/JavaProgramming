package day40_ProtectedAccessModifier_FinalKeyword;


import day39_Encapsulation_Inheritance_RECAP.ShapeTask.Circle;
import day39_Encapsulation_Inheritance_RECAP.ShapeTask.Square;

public class EncapsulationReview {

    public Circle circle;
    public Square square;



    public Circle getCircle (){
        return circle;
    }

    public void setCircle(Circle circle){
        if (circle.getRadius() < 5){
            return;
        }
        this. circle = circle;
    }


    public Square getSquare (){
        return square;
    }

    public void setSquare(Square square){
        this.square = square;
    }
}
