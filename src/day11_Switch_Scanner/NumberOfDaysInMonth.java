package day11_Switch_Scanner;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {

        int year = 2000;
        int n = 2;
        String result;

        if (n >= 1 && n <= 12) { // precondition -  numbers can be between 1 ~ 12

            switch (n) { // switch - case
                case 2:
                    if (year % 4 == 0) {  // if & else statement. We turn it to ternaries if wanted to
                                             // eg -->  result = (year % 4 ==0)? "29 days" : "28 days";
                        result = "29 Days";
                    } else {
                        result = "28 Days";
                    }
                    break;

                case 4: // case blocks are created back to back because they have the same output
                case 6:
                case 9:
                case 11:
                    result = "30 Days";
                    break;
                default: // Use default block because we need the 3rd condition to execute under the pre-condition
                    result = "31 Days";
            }

        } else {
            result = "Invalid Number";
        }

        System.out.println(result);

    }
}


/*
4. NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12
			If(1~12){
			}else{
				Invalid
			}
 */