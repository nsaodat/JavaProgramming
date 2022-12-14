package day36_Inheritence.animal;

public class Zoo {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setInfo("Almos", "Husky", 'M', "medium", 5, "black and white");
        dog.eat();
        dog.sleep();
        dog.sleep();
        dog.move();
        dog.bark();
        dog.drink();
        // dog.scratch; --> scratch can not be used as it belongs to Cat class.

        Cat cat = new Cat();
        cat.setInfo("Bagira", "persian cat", 'F', "small", 5, "white");
        cat.eat();
        cat.sleep();
        cat.move();
        // cat.bark; --> belongs to Dog class
        cat.scratch();
        cat.sleep();
        cat.drink();

        Tiger tiger = new Tiger();
        tiger.setInfo("Sherhan", "siberian", 'M', "massive", 8, "orange");
        tiger.hunt();
        tiger.eat();
        tiger.move();
        tiger.sleep();
        tiger.drink();
        tiger.roar();

        System.out.println(dog); // Animal{name='Almos', breed='Husky', gender=M, size='medium', age=5, color='black and white'}


    }
}


