package day35_Encapsulation.encapsualtion;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private double salary;

    // constructor allows us to set all the instance variable as soon as the Objects are created
    public Employee(String name, char gender, int age, double salary) {
        setName(name); // benefits --> we are using the setters to check the arguments/conditions and set the instances accordingly. We are using the setters to set the instance variables by using the constructor. We use the constructor when we create the Objects.
        setGender(gender);
        setAge(age);
        setSalary(salary); // setters will reject the data if entered incorrectly and prevent the Objects.

    }

    public String getName(){
       return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) { // isEmpty(): this method checks whether the String is empty, the length must be 0
            System.err.println("No data"); // whenever the error message is displayed,
         //   System.exit(0); //<-- programme should be terminated
             return; // or if there is no error message to be displayed, then we can use return to exit the method
        }
         this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')){
            return;
    }
        this.gender = gender;

    }

    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        if (age < 16 || age > 90){
            return;
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

   public void setSalary(double salary) {
        if (salary <= 0){
            return;
        }
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=$" + salary +
                '}';
    }
}

/*
private variables:
				name, gender, age, salary

				Encapsulate all the private fields --> once encapsulated we have a control over the data.
			 This means we can create our conditions/restrictions within the encapsulated data

				1. Name can not be empty
				2. gender can not anything other than female or male
				3. age can not be less than 16, and greater than 90
				4. salary can not be zero or negative
 */