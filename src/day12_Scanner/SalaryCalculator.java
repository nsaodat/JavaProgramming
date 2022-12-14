package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter your hourly Rate");
        double hourlyRate = scan.nextDouble();

        System.out.println("How many hours do you work in a week?");
        int weeklyHours = scan.nextInt();

        System.out.println("Enter state tax (in percentage)");
        double stateTax = scan.nextDouble();

        System.out.println("Enter federal tax (in percentage)");
        double federalTax = scan.nextDouble();

        double grossSalary = hourlyRate * weeklyHours * 52;

        double stateTaxPaid = grossSalary*stateTax;

        double federalTaxPaid = grossSalary * federalTax;

        double totalTax = stateTaxPaid + federalTaxPaid;

        double netSalary = grossSalary - totalTax;

        System.out.println("grossSalary = " + grossSalary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netSalary = " + netSalary);

        scan.close();
    }
}

/*
 SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */