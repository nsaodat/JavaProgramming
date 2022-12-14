package day37_TypesOfInheritance.phoneTask;

public class Iphone extends Phone {

    public Iphone(String model, String size, double price, String colour) { // removed make variable from the parameter and inserted the make name "Apple" into super parenthesis to keep the repeat to minimum
        super("Apple", model, size, price, colour);
    }

    public void faceTime(long phoneNumber) {
        System.out.println(make + " " + model + " is having a Face time with phone number: " + phoneNumber);
    }
        public void faceTime (String email){
            System.out.println(make + " " + model + " is having a Face Time with email: " + email);

    }
}


/*
 1.2 Create a subclass of Phone named IPhone:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    faceTime(long phoneNumber)
                    faceTime(String email)
                    toString()
 */