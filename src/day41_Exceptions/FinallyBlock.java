package day41_Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

        // why needed? -- when we have a code that must be executed. After database testing, we will need to disconnect Java, otherwise it slows the performance down. DISCONNECTING is a MUST after our TESTING. If there is a MUST STEP then we place it inside --> the finally block!

        // This block is used during BACKEND TESTING!!!

        int []arr = {1,2,3,4};

        try{
            System.out.println(arr[10]);
            System.out.println("Try block");
        }catch (RuntimeException e){
            System.out.println("catch block");
            e.printStackTrace();

        }finally{ // finally block always gets executed regardless of exception being handled or not handled. If we want to stop the finally block from executing, then we MUST place exit -->  (System.exit(0) method inside catch block
            System.out.println("Finally block");
        }


    }
}
