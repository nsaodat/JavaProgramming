package day32_ConstructorOverloading;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, char gender) {
        this(name); // calling the previous Constructor to execute the name function
        this.gender = gender;
    }

    public Employee(String name, char gender, String jobTitle){
        this(name,gender); // calling the constructor with the arguments
        this.jobTitle = jobTitle;
    }
    public Employee(String name, char gender, String jobTitle, double salary){
        this(name,gender,jobTitle);
        this.salary = salary;

    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}


    /*
    5 RULES:

this: refers to the instances

	this. : to call instance variables & instance methods
	this() : used for calling the constructors


Constructor Call:
		1. Constructor can not be called by its name ( this() need to be used )
		2. Only a constructor can call another constructor
		3. Constructor call MUST be at the first step
		4. One constructor can not call more than one constructor
		5. Constructor can not call or contain itself


     */