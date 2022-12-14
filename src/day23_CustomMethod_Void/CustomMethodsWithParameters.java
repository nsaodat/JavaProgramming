package day23_CustomMethod_Void;

public class CustomMethodsWithParameters {


    public static void main(String[] args) {

        oddOrEven(10895);// method demands additional information/argument within the parenthesis to complete its task
        System.out.println("_______________________________________________");

        ageOfPerson(1983);

        System.out.println("_______________________________________________");


    }
    // create a function that can check if a number is odd or even number
    public static void oddOrEven(int number){// without knowing the number we cant write the codes to check whether it is odd or even. Hence, we need an information given to the method in order to complete the task. We need a parameter. The moment we call the method, we pass the argument and that argument will be the parameter of the method. Parameters passed to the method act like variables!

        if (number % 2 == 0 ){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }


    }


// create a function that can display the age of the person

    public static void ageOfPerson (int birthYear){ // parameters passed to the method act like variables

        int age = 2022 - birthYear;

        System.out.println("Your age is " + age);

    }

// create  a function that can print all the numbers between X and Y
public static void printNumbers (int x,int y){


}

}
