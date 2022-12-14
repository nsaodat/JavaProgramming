package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {


        Student student1 = new Student();
        student1.setInfo("Ross", 'M', 39, 4587, 'A');

        System.out.println(student1); // Student{name='Ross', gender=M, age=39, ID=4587, grade=A}

        Student student2 = new Student();
        student2.setInfo("Yulya", 'F', 35, 78954, 'A');

        Student student3 = new Student();
        student3.setInfo("Ali", 'M', 25, 78945, 'A');

        Student student4 = new Student();
        student4.setInfo("Elminur", 'F', 26, 2215, 'A');

        Student student5 = new Student();
        student5.setInfo("Mert", 'M', 26, 2252, 'C');

        Student[] students = {student1, student2, student3, student4, student5};
        for (Student student : students) {
            System.out.println(student);

            System.out.println("____________________split for Early and Angry birds_______________________________");


            ArrayList<Student> earlyBirds = new ArrayList<>(); // grade: A
            ArrayList<Student> angryBirds = new ArrayList<>();

            for (Student each : students) {
                if (each.grade == 'A') {
                    earlyBirds.add(each);
                } else {
                    angryBirds.add(each);
                }
            }
            System.out.println("Early Bird: " +earlyBirds);
            System.out.println("Angry Bird" + angryBirds);

        }


    }
}