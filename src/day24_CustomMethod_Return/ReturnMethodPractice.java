package day24_CustomMethod_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {
// find the max number between 100 & 200

int maxNumber = maxNumberBetween2Numbers(200, -856); // reassigning the value to the variable in order to re-use it

        System.out.println("maximum number: "   + maxNumber);


// multiply the max number by 2

int multiplication = maxNumber*2;
        System.out.println("Multiplication of maximum number : " + multiplication);

}

public static int maxNumberBetween2Numbers (int a, int b){

int result = 0;

if (a > b){
    result = a;// either a or b block will get executed. This means either a or b will be assigned to the variable named result.  It is safe to say after if block execution variable result will contain the max number
}else{
    result = b;
}

return result; // return method makes the variable result data reusable

}

}