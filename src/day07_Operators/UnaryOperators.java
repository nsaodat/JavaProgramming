package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        // + unary plus operator, indicates positive value, optional to declare
        // - unary negative operator, indicates negative value

        int num1 = +25;// plus operator is optional to declare, by default the number 25 is taken as a positive number
        int num2 = -25;

        System.out.println(num1 < 0); // false
        System.out.println(num2 < 0); // true

        System.out.println("-----------Pre - Increment Operator VS Pre - Decrement Operator-----------------");

        int a = 5;
        ++a; //pre increment: increases the value by 1 right away

        System.out.println(a);  //6

        --a;   //pre decrement: decreases the value by 1 right away

        System.out.println(a); //5

        System.out.println("--------------------------------------------");

        int b = 100;

        System.out.println(++b); // 101   pre increment: increases the value by 1 right away

        int c = 100;

        System.out.println(c++); // 100     post increment: first passes the current value, then increases the value by 1
        System.out.println(c); // 101

        System.out.println("------------------------------------------------");

        int x = 200;

        System.out.println(--x); // 199     pre decrement:  decreases the value by 1 right away

        int y = 200;

        System.out.println(y--); // 200     post decrement: first passes the current value, then decreases the value by 1
        System.out.println(y); //199

        System.out.println("--------------------------------------------------");

        int z = 45;

        System.out.println(++z); // 46, z= 46
        System.out.println(z++); //46, z = 47
        System.out.println(z); //47


        int q = 30;

        System.out.println(--q); //29, q = 29
        System.out.println(q--); //29, q = 28
        System.out.println(q); //28


    }


    }

