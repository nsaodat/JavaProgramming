package day25_CustomMethod_Overloading;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = sumOf2Numbers(5, 8);
        System.out.println("sum = " + sum);

        System.out.println("______________________");
        int sum2 = sumOf3Numbers(5,8,63);
        System.out.println("sum2 = " + sum2);

        System.out.println("______________________");

        int sum3 = sumOf4Numbers(89,75,64,12);
        System.out.println("sum3 = " + sum3);
    }

    // 1. create a method that can find the sum of two numbers         method name: sumOf2Numbers
    public static int sumOf2Numbers(int num1, int num2) {

        return num1 + num2;

    }

    // 2. create a method that can find the sum of three numbers       method name: sumOf3Numbers
    public static int sumOf3Numbers(int num1,int num2, int num3){
        return num1 + num2 +num3;
    }

   // 3. create a method that can find the sum of four numbers         method name: sumOf4Numbers
    public static int sumOf4Numbers ( int num1, int num2, int num3, int num4){

        return num1 + num2 + num3;
    }

}





