package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {


        System.out.println("______________IMPLICIT casting!_____________");

        byte a = 100;

        short b = a; //  (short)a <--- this is what's happening in the background,in the compiler <--- implicit casting, hence no need to cast


        // in order to cast we need to use this casting operator --> ()

        int c = b; // int c = (int)b <---- implicit casting is happening in the background!!!

        long d = c; // again we are assigning smaller primitive type to a larger primitive type ---> implicit casting!

        float e = d;

        double f = e;

        System.out.println(e); // output --> 100.0

        System.out.println("__________EXPLICIT casting!_____ALWAYS DONE MANUALLY___________");

        // If I want to cast a larger primitive to a smaller primitive, then I will need to d it manually.
        // It is called Explicit casting!

        int  g = 1000;
        byte h = (byte)g;

        System.out.println(g); //output --> 1000

        System.out.println(g + ":" + h); // output --> 1000:-24     If the cast number is not within the range of data primitive data type, then we will not get the same number.
                                         // it will give a different number!


        double l = 2.5;
        float m = (float)l;

        System.out.println(l + " : " + m); //output --> 2.5:2.5


        double n = 10.8;
        int s = (int) n;
        System.out.println(n + " : " + s); //output --> 10.8 : 10


        System.out.println("_________SHORTCUT - after semicolon hold ALT +hit Enter_____________");

        double d1 = 20.5;
        short s1 = (short) d1; // after semicolon hold ALT +hit Enter











    }
}
