package day35_Encapsulation.encapsualtion;

public class EmployeeObject {
    public static void main(String[] args) {

    Employee employee1 =  new Employee("Marianna", 'Q', 22, 45000);
        System.out.println(employee1); // Employee{name='Marianna', gender= , age=22, salary=$45000.0}

        employee1.setAge(28); // setting the age to 28
        System.out.println(employee1);// Employee{name='Marianna', gender= , age=28, salary=$45000.0}

        Employee employee2 = new Employee("Aygun", 'F', 31, 115000);
        employee2.setName("Elvira");
        employee2.setSalary( employee2.getSalary() + 15000 ); // setting the salary after getting the original salary

        System.out.println(employee1);// Employee{name='Marianna', gender= , age=28, salary=$45000.0}
        System.out.println(employee2);// Employee{name='Elvira', gender=F, age=31, salary=$130000.0}

}

    }