package day37_TypesOfInheritance.animal;

public class AnimalObjects {
    public static void main(String[] args) {

       Dog dog1 = new Dog("TRex", "German Shepard",'F', "Large", 5, "black");

        System.out.println(dog1); // Animal{name='Cute', breed='Siamese', gender=M, size='small', age=2, color='white'}
        dog1.bark(); // TRex is barking

        Cat cat1 = new Cat("Cute", "Siamese", 'M', "small", 2, "white");

        System.out.println(cat1); // Animal{name='Cute', breed='Siamese', gender=M, size='small', age=2, color='white'}
        cat1.scratch(); // Cute is scratching



    }
 }