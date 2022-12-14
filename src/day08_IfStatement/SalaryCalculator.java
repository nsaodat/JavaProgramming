package day08_IfStatement;

public class SalaryCalculator {

    /*
    Create a class called SalaryCalculator.java
			3.1 declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

			3.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax

					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52
     */
    public static void main(String[] args) {


        int hourlyRate = 50,
                weeklyHours = 40;        double stateTaxRate = 6.5,
                federalTaxRate = 26.2;

        //_______________________________

        int salaryBeforeTax = hourlyRate * weeklyHours * 52; // salary is equal to one week's salary * 52 weeks
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double netIncome = salaryBeforeTax - totalTax;

        //_______________________________


        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("State Tax = $" + stateTax);
        System.out.println("Federal Tax = $" + federalTax);
        System.out.println("Total Tax = $" + totalTax);
        System.out.println("Net Income = $" +netIncome);




    }

}
