package day39_Encapsulation_Inheritance_RECAP.CydeoTask;

public class Developer extends Employee{


    public Developer(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    public void fixingBugs(){
        System.out.println(getName() + " " + getJobTitle() + " is fixing bugs");
    }

    @Override
    public void work() {
        System.out.println(getName() + " " + getJobTitle() + " is developing a software");
    }
}

/*

    4. Create a subclass of Employee named Developer

            Override the work method

            Extra methods:
                fixingBugs()
 */