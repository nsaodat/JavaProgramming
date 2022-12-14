package day31_CustomClass_Constructors;

public class Person {

    public String name;
    public char gender;
    public int age;

 /* default constructor: We can not set the parameters if no arguments within the parenthesis.

        public Person (){

        }

  */

    public Person( String name, char gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }




}
