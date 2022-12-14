package day33_Constructors_Statics;

import java.sql.SQLOutput;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Ali";
        employee1.salary = 100000;
        Employee employee2 = new Employee();
        employee2.name = "Leyla";
        employee2.salary = 780000;
        Employee employee3 = new Employee();
        employee3.name = "Karl";
        employee3.salary = 40000;

        System.out.println(employee1.name + ": " +employee1.salary);
        System.out.println(employee2.name + ": " + employee2.salary);
        System.out.println(employee3.name+ ": " + employee3.salary);

        System.out.println(employee1.isHuman); // true
        System.out.println(employee2.isHuman); // true
        System.out.println(employee3.isHuman); // true


    }
}
