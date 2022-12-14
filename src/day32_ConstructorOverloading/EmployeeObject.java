package day32_ConstructorOverloading;

import java.util.Arrays;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Welma");
        Employee employee2 = new Employee("Dave",'M');

        System.out.println(employee1); // Employee{name='Welma', gender= , jobTitle='null', salary=0.0}
        System.out.println(employee2); // Employee{name='Dave', gender=M, jobTitle='null', salary=0.0}

        Employee employee3 = new Employee("Swanky", 'F', "SDET"); // Employee{name='Swanky', gender=F, jobTitle='SDET', salary=0.0}
        Employee employee4 = new Employee("Freddie", 'M', "QA", 120000); // Employee{name='Swanky', gender=F, jobTitle='SDET', salary=0.0}

        System.out.println(employee3);
        System.out.println(employee4);

    }
}
