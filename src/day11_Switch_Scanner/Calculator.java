package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {

        double n1 = 125.5;
        double n2 = 300.25;
        char arithmeticOperator = '+';


        if (arithmeticOperator == '+' || arithmeticOperator == '_' || arithmeticOperator == '/' || arithmeticOperator == '*'){
            switch (arithmeticOperator){
                case '+':
                    System.out.println(n1 + n2);
                    break;

                case '-':
                    System.out.println(n1 - n2);
                    break;

                case '/':
                    System.out.println(n1 / n2);
                    break;

                default:
                    System.out.println(n1 * n2);
                }

            }else{
            System.err.println("Invalid operator: " + arithmeticOperator);
        }


    }


}

/*
Given two double variables n1, n2 and a char variable named operator.
use switch statement to calculate the result of n1 & n2 based on the given operator
		Valid operators are: -, +, *, /
		       Eg. invalid operator ---> @


 */