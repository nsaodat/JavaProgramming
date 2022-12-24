package day40_ProtectedAccessModifier_FinalKeyword;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", 'M', "black", "big", 4);
        dog.setName("Charlie");

        System.out.println(dog.getName());
        System.out.println(dog.getGender());
        System.out.println(dog.getSize());
        System.out.println(dog.getBreed());
        dog.drink();
        dog.eat();
    }
}
