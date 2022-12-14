package day37_TypesOfInheritance.scrumTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Product Owner", id, salary, companyName);
    }

    public void requirementGathering(){
        System.out.println(jobTitle +  "-" + name + " is responsible for gathering requirements from the business");
    }
}
