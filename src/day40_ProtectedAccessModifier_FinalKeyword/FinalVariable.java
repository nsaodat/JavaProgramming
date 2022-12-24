package day40_ProtectedAccessModifier_FinalKeyword;

public class FinalVariable {

    final String birthDay; // if instance variable is not set by the time I have created an Object, then compiler will be flagging the error. Constructor helps to set the Object
    final static String name; // with final word we can not reassign the name variable in line 37
                              // to solve this we will need to remove the word final.

    static {
        name = "Maya"; // initiated the static variable inside the static block
    }

    public FinalVariable(String birthDay) { // once the object is set the variable will be un-modifiable
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {


        final double pi = 3.14;
        // pi = 4.14; //  // final variable can not be reassigned, because it is un-modifiable once initiated
        // pi = 5.14;

        final String name;
        name = "Java";
        // name = "Wooden Spoon"; // final variable can not be reassigned, because it is un-modifiable once initiated

        System.out.println(name);

        System.out.println("_______________________________");

        FinalVariable object = new FinalVariable("13/1988");
        // object.birthDay = "May / 2015"; // final variables can not be re-assigned
        System.out.println(object.birthDay);

        System.out.println("_______________________________");

        // FinalVariable.name = "Java";
        System.out.println(FinalVariable.name);

    }
}
