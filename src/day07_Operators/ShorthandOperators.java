package day07_Operators;

public class ShorthandOperators {
    public static void main(String[] args) {


        System.out.println("____________Assignment Operator: = _________________");
        int number = 200;

        System.out.println("number = " + number); // number = 200

        number = 300;

        System.out.println("number = " + number); // number = 300

        String word = "Java Programming";
        System.out.println("word = " + word); // Java Programming

        word = "Wooden Spoon";

        System.out.println("word = " + word); // Wooden Spoon
        // Last initialised value gets printed. One regular variable can only contain one value!

        System.out.println("_______________Addition Assignment Operator: += _______________________");

        int x = 100;

        System.out.println("x = " + x);

        System.out.println(x + 200); // increase the value of x by 200 --> 300

        // x = x + 200; // original x value + 200 will return 300, which is assigned back to x
        x += 200; // 200 is added to the value of x variable and assigns back to the x variable

        System.out.println("x = " + x); // x = 300


        String str = "Wooden"; // We can use += operator to concatenate string "Spoon"
        str += "Spoon";

        System.out.println("str = " + str); // str = WoodenSpoon

        double num1 = 2.5;
        System.out.println("num1 = " + num1);// 2.5

        num1 += 5.5;

        System.out.println("num1 = " + num1); // num1 = 8.0

        // DEPOSITING £542

        double availableBalance = 10800.85; // deposit £542 into my bank account
        availableBalance += 542;

        System.out.println("availableBalance = " + "£" + availableBalance); //availableBalance = £11342.85

        // += addition assignment operator, when used with numerate primitives, increases the numbers
        // += addition assignment operator, when used with String non - primitive, concatenates. Only + shorthand operator is can be applied for String

        System.out.println("_____________________Subtraction Assignment Operator: -= _________________________");

        // WITHDRAWING £542

        availableBalance -= 542;

        System.out.println("availableBalance = " + "£" + availableBalance); // availableBalance = £10800.85

        // withdrawing £200, then depositing £400

        availableBalance -= 200; // withdrawing £200

        System.out.println("availableBalance = " + "£" + availableBalance); // availableBalance = £10600.85

        availableBalance += 400; // depositing £400

        System.out.println("availableBalance = " + "£" +  availableBalance); // availableBalance = £11000.85

        System.out.println("__________________Multiplication Assignment Operator: *= ____________");

        // first multiplies then  assigns back to the variable

        double salary = 50000.80;

        System.out.println(salary); // 50000.8

        salary *= 2;

        System.out.println("salary = " + salary); // salary = 100001.6

        double doge = 0.00000001;
        doge *= 1000000;


        System.out.println("doge = " + doge); // doge = 0.01


        System.out.println("__________________Division Assignment Operator: /= ____________");
        
        double num2 = 25000.0;
        
      //  num2 = num2 / 2; or another way of coding is in Line 103
        
        num2 /= 2;

        System.out.println("num2 = " + num2); // num2 = 12500.0

        System.out.println("__________________Remainder Assignment Operator: %= ____________");

        double num3 = 100;

        num3 %= 3;// remainder of the original value divided by 3

        System.out.println("num3 = " + num3); // num3 = 1.0

        System.out.println("-----------------------------");

        int amount = 127;  // cents

        int quarters = amount / 25;
        int cents = amount % 25;

        System.out.println("quarters = " + quarters); // quarters = 5
        System.out.println("cents = " + cents); // cents = 2


        System.out.println("-------------------------");
        int cents2 = 127;

        cents2 %= 25;

        System.out.println("cents2 = " + cents2); // cents2 = 2


        System.out.println("---------------------------------");

        int y = 300;

        y %= 16; // remainder of 300 divided by 16

        System.out.println("y = " + y); // y = 12

        System.out.println("----------------------------------");

        int balance =  3500;

        // insurance fee: $153 per month

        balance %= 153; //  balance = 3500 % 153

        System.out.println("balance = " + balance); // balance = 134








    }


}
