package day33_Constructors_Statics;

import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {
        Student student = new Student("Melany");

        Student student2 = new Student("Monica", 'F');

        Student student3 = new Student("Roxanne", 1245);

        Student student4 = new Student("Mert", 12, 'A');

        Student student5 = new Student("Cihad", 'M', 28);

        Student student6 = new Student("Suhaib", 'M', 27, 15);

        Student student7= new Student("Ali",'M',42,30, 'A');

        System.out.println(student7); // Student{name='Ali', gender=M, age=42, studentID=30, grade= }

        System.out.println(student7 ==  student5); // false

        System.out.println("___________________________________");

        Student [] students =  {student,student2,student3, student4, student5,student6,student7};
        System.out.println(Arrays.toString(students));


    }
}
