package utilities;

import day40_ProtectedAccessModifier_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiersTest4 extends ProtectedAccessModifier {
    public static void main(String[] args) {

        //System.out.println(AccessModifiersTest4.name1); // default access modifier is not visible in subclass. Only visible inside the same package
        System.out.println(AccessModifiersTest4.name2); // // protected is visible outside the package in subclass
// AccessModifiersTest4.method1(); --> default access modifier is used in this method and can not be called outside the package
AccessModifiersTest4.method2();

    }
}
