package day37_TypesOfInheritance.scrumTask;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }

    public void testing(){
        System.out.println(jobTitle + "-" + name + " is responsible for testing");
    }
}
