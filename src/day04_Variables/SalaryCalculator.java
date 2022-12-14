package day04_Variables;

public class SalaryCalculator {
    // hourlyRate, weeklyHours
    public static void main(String[] args) {


    int hourlyRate = 60;
    int weeklyHours = 40;
    int numberOfWeeks  = 52;
    int salary = hourlyRate * weeklyHours *numberOfWeeks;

        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("hourlyRate = " + hourlyRate);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = " + salary);

    }




}
