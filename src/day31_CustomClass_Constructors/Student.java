package day31_CustomClass_Constructors;

public class Student {

    public String name;
    public int age;
    public char gender;
    public char grade;
    public int iD;

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", iD=" + iD +
                '}';
    }

    public Student(String name, int age, char gender, char grade, int iD) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.iD = iD;





    }
}
