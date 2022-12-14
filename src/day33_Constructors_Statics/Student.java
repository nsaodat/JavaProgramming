package day33_Constructors_Statics;

public class Student {
    // Create a class called Student:
    //				Attributes:
    //					name, gender, age, studentID, grade
    public String name;
    public char gender;
    public int age;
    public int studentID;
    public char grade;

    //Add a constructor that allows user to create object by setting the name of student
    public Student(String name) {
        this.name = name;
    }

    // Add a constructor that allows user to create object by setting the name and gender of the student
    public Student(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    // Add a constructor that allows user to create object by setting the name and studentID of the student
    public Student(String name, int studentID) {
        this(name);
        this.studentID = studentID;
    }

    //Add a constructor that allows user to create object by setting the name, studentID and grade of the student
    public Student(String name, int studentID, char grade) {
        this(name, studentID);
        this.grade = grade;
    }

    // Add a constructor that allows user to create object by setting the name, gender and age of the student
    public Student(String name, char gender, int age) {
        this(name, gender);
        this.age = age;
    }

//Add a constructor that allows user to create object by setting the name, gende, age and studentID of the student
    public Student(String name, char gender, int age, int studentID){
        this(name, gender, age);
        this.studentID = studentID;
    }

    // Add a constructor that allows user to create object by setting the name, gende, age, studentID and grade of the student

    public Student(String name, char gender, int age, int studentID, char grade){
        this(name, gender, age, studentID);
        this.gender = gender;
    }

    public String toString() { // instance method
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }

    public void study(){
        System.out.println(name + " is studying");

    }
}


