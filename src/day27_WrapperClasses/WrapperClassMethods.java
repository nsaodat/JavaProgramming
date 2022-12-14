package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        System.out.println("______________parse methods: converts String to primitive_______________________");

                String str = "123";

        int num = Integer.parseInt(str); // parse method converts String into primitive data type
        System.out.println(num + 3);// 126

        System.out.println("_____________________________");

        String str2 = "2.89";
        double num2 = Double.parseDouble(str2);
        System.out.println(num2 + 56.3); // 59.19

        System.out.println("_____________________________");

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max); // max = 2147483647
        System.out.println("min = " + min); // min = -2147483648

        System.out.println("_____________________________");

       long max2 = Long.MAX_VALUE;
       long min2 = Long.MIN_VALUE;

        System.out.println("max2 = " + max2); //max2 = 9223372036854775807
        System.out.println("min2 = " + min2); // min = -2147483648

        System.out.println("_____________________________");

String s1 = "true";

boolean r1 = Boolean.parseBoolean(s1); // as long as the String has the word true, then boolean primitive returns true. Otherwise, by default it will return false. Parse method is typically used for converting the String into int or double
        System.out.println("r1 = " + r1); // r1 = true

        System.out.println("______________valueOf methods: converts String to wrapper class____________________");

String s2 = "123"; // convert the String into Integer wrapper class
        Integer x = Integer.valueOf(s2); // integer
        System.out.println(x); // 123
        // if valueOf method returns the Integer,  it can be assigned to a primitive

        int y = x;

        System.out.println(y); // 123     unboxing

        String s3 = "12.5";
         Double z = Double.valueOf(s3);
         double w = z;// unboxing
        System.out.println(w); // 12.5

        System.out.println("-----------------------------------------------------");


        char ch1 = '!';

        //isDigit()
        boolean r2 = Character.isDigit(ch1);

        //isLetter()
        boolean r3 = Character.isLetter(ch1);

        // special char
        boolean r4= !Character.isLetterOrDigit(ch1);

        // upperCase
        boolean r5 = Character.isUpperCase(ch1);

        //lowerCase
        boolean r6 = Character.isLowerCase(ch1);

        System.out.println(r2); // false
        System.out.println(r3); // false
        System.out.println(r4); // true
        System.out.println(r5); // false
        System.out.println(r6); // false

        System.out.println("----------------------------------");

        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()) {

            if( Character.isDigit(each) ){
                sum +=  Integer.parseInt(""+each);
            }

        }

        System.out.println("sum = " + sum);// sum = 10

    }
}
