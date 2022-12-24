package day40_ProtectedAccessModifier_FinalKeyword;

public final class Dog extends Animal{ // --> this Class can not be a Parent due to being a final Class

    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating dog food");
    }

 //   public void drink(){// user is restricted to modify because the method in parent class is final
     //   System.out.println(getName() + " is drinking juice"); }


    public void bark(){
        System.out.println(getName() + " is barking");
    }
}
