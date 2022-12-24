package day39_Encapsulation_Inheritance_RECAP.CydeoTask;

public class Person {

    // we keep the below instance variables private instead of public. We can apply getters & setters in order to complete the encapsulation and apply any conditions later on if the need arises in the following sprints of the project.
    //
    // Static variable can be kept public.
    private String  name;
    private  int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.isEmpty()){
            System.err.println(name + " is invalid");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18){
            System.err.println(age + " is invalid");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'F' || gender == 'M')){
            System.err.println(gender + " is invalid");
            System.exit(1);
        }
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {// best practice is to utilise the set method in the constructor. Benefit --> we are ensuring the right name, age and gender are given whenever the object of the Person is created. Because the setters check the set conditions.
       setName(name);
        setAge(age);
        setAge(age);

        // private variables and constructor of the current class will not be inherited to the subclass. However, the setters and getters methods and any other methods will be inherited.

    }

    public void eat(){
        System.out.println(name + " is eating");
    }
    public void drink(){
        System.out.println(name + " is drinking");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }

    }


/*
 1. Create a class named Person:
            Variables:
                name, age, gender

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                eat()
                drink()
                sleep()
                toString()
 */