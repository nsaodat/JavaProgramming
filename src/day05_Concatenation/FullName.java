package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {


        String firstName = "Nafisa";

        String lastName = "Ravshanova";

        int age = 39;

        String jobTitle = "Senior SDET";

        String companyName = "Microsoft";

        double salary = 120000.83;


        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        // Full name of the person is___

        System.out.println("Full name of the person is " + fullName); // output --> Full name of the person is Nafisa Ravshanova

        //___ is years old

        System.out.println(fullName + " is " + age + " old"); // output --> Nafisa Ravshanova is 39 old

        // fullName is jobTitle +, he works at + companyName

        System.out.println(fullName + " is " + jobTitle + ", she works at " + companyName
        + ", and " + fullName + "'s salary is £" +salary);

    }

}
