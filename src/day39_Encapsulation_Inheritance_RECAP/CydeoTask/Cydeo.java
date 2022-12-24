package day39_Encapsulation_Inheritance_RECAP.CydeoTask;

public class Cydeo {
    public static void main(String[] args) {
        Developer developer = new Developer("Dave", 45, 'M', 12345, "Java Developer", 124500);
        Tester tester = new Tester("Almaz", 24, 'F', 1245, "SDET", 117890);

        Teacher teacher = new Teacher("Lola", 32, 'F', 12457, "Math Teacher", 100000);

        Student student = new Student("Ryan", 30, 'M', 13, "SDET");

        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(tester);
        System.out.println(student);

        System.out.println("_______________________________________");

        developer.setAge(50);
        tester.setName("Bill");
        tester.setSalary(100000);

        System.out.println(developer.getAge());
        System.out.println(developer);

        System.out.println(tester.getSalary());
        System.out.println(tester);

        System.out.println("_______________________________________");

        developer.work(); // Dave Java Developer is developing a software
        tester.work(); // SDET Bill is testing the application
        teacher.work(); // Lola Math Teacher is teaching
        student.drink(); // Ryan is drinking
        //  student.work(); --> can not call work method, as it is not property of the student Class in our scenario

        System.out.println("_______________________________________");
        // calling methods from Person class
        developer.eat(); // developer is a person --> hence is a relationship


    }
}
