package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {

        // static block: used for initializing static variables
        //			  gets executed as son as the class is loaded
        //			  runs first before everything, only runs one time

        System.out.println("Main method");
    }

    static{ // runs first before anything, and only runs one time
        System.out.println("Static Block 1");
    }

    static{
        System.out.println("Static Block 2");
    }

    static{
        System.out.println("Static Block 3");
    }

}
