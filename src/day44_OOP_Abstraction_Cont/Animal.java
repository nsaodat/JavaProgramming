package day44_OOP_Abstraction_Cont;

public abstract class Animal {
    private String name;
    private final String breed;
    private final char gender; // final --> once the gender is set for the animal, then it can not change. In other words it locks the feature!
    private int age;
    private String size;
    private final String color;

    public final static boolean canBreathe; // static means only one copy that is shared by all the Animal object

    static {
        canBreathe = true;

    }


    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        this.breed = breed;

        if (!(gender == 'M' || gender == 'F')){
            throw new RuntimeException("Invalid gender: " + gender);
        }
        this.gender = gender;

        setAge(age);
        setSize(size);

        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            throw new RuntimeException("Invalid Name");
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public final void drink(){ // we made the implementation un-modifiable by using the final keyword, can not be overridden.
        // If we use static keyword in the method's signature, then it means static method can not access the instance variable, as it only can access static variables and methods!

        System.out.println( name + " is drinking");
    }

    //		eat(); ==> different animals eat different food
    public abstract void eat(); //  the abstract keyword allows to hide the implementation of the method!

    //toString() ==> to display the full info of the animal
    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" + // getClass().getSimpleName() <-- these methods will enable the printing the name of each class when we create the Object and print
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
Animal Task:
		Create an abstract class named Animal:
			Variables:
				name, breed(final), gender(final),  age, size, color(final)

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				eat(); ==> different animals eat different food
				drink() ==> all the animals drink water
				toString() ==> to display the full info of the animal



 */