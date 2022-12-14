package day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {

    public String studentName;
    public static String schoolName;
  //  public static String schoolName = "Cydeo School";//  <-- If there is a static variable that can be set within 1 step, then we can directly assign it like in this example. Otherwise; we will need a static block for multiple steps to initialise the variable

    public CydeoStudent(String studentName){
        this.studentName = studentName;

    }

    static {
        schoolName = "Cydeo School"; // <-- get only executed once
    }

}
class CydeoStudentObject{
    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Jimmy");
        CydeoStudent student2 = new CydeoStudent("Monica");

        System.out.println(student1.schoolName); // Cydeo School
        System.out.println(student2.schoolName); // Cydeo School


    }
}