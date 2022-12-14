package day18_NestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        // 30/7 ==> 4 with the remainder of 2

        int a = 30;
        int b = 7;
        int countSubtractionNumber = 0; // count = 4.2 --> integer only takes 4

        while (a >= b){ // we use while loop, because we don't know how many times we will be subtracting from b
            a-=b;
            countSubtractionNumber++; // count stops when a becomes less than b
        }
        System.out.println(countSubtractionNumber + " with a remainder of " + a); // a will store the remainder when loop finishes

    }
}

/*

Write a program that can divide two positive numbers without using / (division) and * (multiplication) and % operators running

                        20 / 6 ==> 3 with the reaminder of 2


                        a = 30
                        b = 7;


                        a -= b;  // a = 23
                        a -= b;  // a = 16
                        a -= b;  // a = 9
                        a -= b;  // a = 2


                        x = 100;
                        y = 8;

                        while(a >= b){
                                a -= b;
                                count++;
                        }
 */