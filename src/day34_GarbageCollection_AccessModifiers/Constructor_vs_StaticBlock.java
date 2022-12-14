package day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {

    static{
        System.out.println("Static Block"); // static block is always executed first and only one time
    }

    public Constructor_vs_StaticBlock(){
        System.out.println("Constructor");// constructors are called via Objects, and they need to be declared or initialized accordingly first. Otherwise, they won't print.
    }

    public static void main(String[] args) {
        System.out.println("Main method");

        // we are declaring the Objects below, so that the Constructor can be executed. The word "Constructor will be printed 3 times
        new Constructor_vs_StaticBlock();// Constructor
        new Constructor_vs_StaticBlock(); // Constructor
        new Constructor_vs_StaticBlock(); // Constructor
    }



}
