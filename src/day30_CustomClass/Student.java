package day30_CustomClass;

public class Student {

    public String name; // instance variable
    public char gender;
    public int age;
    public int ID;
    public char grade;

    /*
    public void setInfo(String name, char gender, int age, int ID, char grade) { // local variables
        this.name = name; // this. ---> calls the instance variable
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }


     */

// right click --> select generate --> choose Constructor -->highlight all -- click OK --> take out the class name and write void for returnType --> name as setInfo
    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

public void code(){
    System.out.println(name + " is coding");
}
public void sleep(){
    System.out.println(name + " is sleeping");
}

}
