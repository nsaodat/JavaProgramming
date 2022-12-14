package day04_Variables;

public class Currencies {
    public static void main(String[] args) {
        /*
        Convert dollar to other currencies, 16.09.2022
         */

        int dollar = 100;
        double lira = 18.274 * dollar;
        double poundSterling = 0.878 * dollar;
        double euro = dollar * 1.003;

        System.out.println("The given dollar amount in other currencies below = $" + dollar);
        System.out.println("lira = " + lira);
        System.out.println("poundSterling = " + poundSterling);
        System.out.println("euro = " + euro);
    }
}
