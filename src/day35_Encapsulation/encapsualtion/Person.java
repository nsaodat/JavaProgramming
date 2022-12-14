package day35_Encapsulation.encapsualtion;

public class Person {
    private String name;
    private int age;

    public String getName(){ // getdataName is reading the original data and returning it --> accessor
        return name;
    }

    public void setName(String name){ // Mutator --> for setting we use void method and pass the argument in the parameter since it is replacing the original data
        this.name = name; // this. is used to call the instance variables for the purpose of reassigning them to the local variables
    }


    public int getAge(){ // getdataName is reading the original data and returning it
        return age;
    }

    public void setAge(int age){ // // for setting we use void method and pass the argument in the parameter since it is replacing the original data
        if (age <= 0 || age >150){
            System.err.println("Invalid data");
            System.exit(0); // terminates the whole programme if the incorrect data is entered
        }
        this.age = age;  // this. is used to call the instance variables for the purpose of reassigning them to the local variables
    }

}
