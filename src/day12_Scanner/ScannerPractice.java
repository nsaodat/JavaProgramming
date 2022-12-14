package day12_Scanner;

   //import java.util.*;  //wild import: imports everything from the package
import java.util.Scanner; // regular import: imports one class

        public class ScannerPractice {

            public static void main(String[] args) {

          /*
        new Scanner(System.in).nextInt(); // one time use, this will take more memory usage
        new Scanner(System.in).nextInt(); // one time use, this will take more memory usage
        ...
         */

                Scanner scan = new Scanner(System.in);

                System.out.println("Enter a number between 1 to 7:");// displaying a message to make it readable for USER

                int num =scan.nextInt(); // <-- assigning the scanner's object to the Scanner's applicable method, then we are assigning it to the variable to make it reusable

                String result = "" ; // temp value


                if(num >= 1 && num <= 7){ //num: 1~7

                    result =(num==1)?"Monday"  :(num==2)?"Tuesday"  :(num==3)?"Wednesday"
                            :(num==4)?"Thursday" :(num==5)?"Friday" :(num==6)?"Saturday" : "Sunday";

                }else{
                    result = "Invalid Number";
                }


                System.out.println(result);

                scan.close();// give close method in order to close the scanner.
                             // We need to create a new object after closing the scanner



            }

        }


