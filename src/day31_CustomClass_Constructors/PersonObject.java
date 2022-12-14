package day31_CustomClass_Constructors;

public class PersonObject {
    public static void main(String[] args) {

        Person person1 = new Person("Danny", 'M', 28);

        System.out.println(person1); // Person{name='Danny', gender=M, age=28}

        // for each Object the constructor gets executed separately!
        Person person2 = new Person("Angelica", 'F', 34);

        System.out.println(person2); // Person{name='Angelica', gender=F, age=34}
    }
}
