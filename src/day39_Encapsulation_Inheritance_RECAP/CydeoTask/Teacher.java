package day39_Encapsulation_Inheritance_RECAP.CydeoTask;

public class Teacher extends Employee {
    public Teacher(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " " + getJobTitle() + " is teaching");
    }
}

/*Create a subclass of Employee named Teacher

            Override the work method

 */