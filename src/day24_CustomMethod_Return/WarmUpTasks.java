package day24_CustomMethod_Return;

public class WarmUpTasks {
    public static void main(String[] args) {

        initials("nafisa", "ravshanova");

        System.out.println("_________________________");

        domain("nafisa.ravshanova@outlook.com"); // without the argument within parenthesis the method is useless
        System.out.println("_________________________");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};
        for (String eachEmail : emails) {
            domain(eachEmail); // here we called the method and passed the arguments one by one by using the for each loop
        }
        System.out.println("_________________________");
        monthName(10);
        System.out.println("_________________________");

        nameOfDay(5);

        System.out.println("_________________________");
daysInMonth(25);

    }

    // 1. Create a method that can display the initials of the person. initials(String firstName, String lastName)

    public static void initials(String firstName, String lastName) {

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase(); // assign it back to initial as original String is immutable

        System.out.println("initial = " + initial);


    }

    // 2. Create a method that can display the domain of the email   domain(String email)
    public static void domain(String email) { // giving a signature to the method
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);


    }

    // 3. Create a method that can display the name of the month based on the given number to the method

    public static void monthName(int number) {
        String name = "";

        if (number >= 1 && number <= 12) { // precondition helps to run the compiler less, because it only checks the applicable if block
            name = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "April" : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August" : (number == 9) ? "September" : (number == 10) ? "October" : (number == 11) ? "November" : "December";
        } else {
            name = "Invalid number";
        }
        System.out.println("month name = " + name);
    }

    //4. Create a method that can print the name of the day based on the given number to the method

    public static void nameOfDay(int number) {

        String name = "";
        if (number >= 1 && number <= 7){ // precondition

            name = (number==1)?"Monday":(number==2)?"Tuesday":(number==3)?"Wednesday":(number==4)?"Thursday":(number==5)?"Friday":"Saturday";

        }else {
           name = "Invalid entry";
        }
        System.out.println("name of the day = " + name);

    }

    // 5. Create a method that can print how many days a month has

        public static void daysInMonth (int number){

        int days = 0;

            boolean has28Days= number == 2;// for the month that has 28 days

            boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11; // for the month that has 30 days

            boolean has31Days = !has28Days && !has30Days; //if the month does not have both 28 & 31 days


            if(has28Days){ // if the month has 28 days
                System.out.println("28 days");
            }
            if (has30Days){ // if the month has 30 days
                System.out.println("30 days");
            }
            if(has31Days){ // if the month has 31 days
                System.out.println("31 days");
            }




        }


    }


/*
6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)

 */

