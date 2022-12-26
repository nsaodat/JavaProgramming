package day42_Exceptions_Continued;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("___________________ Push up started ________________________");


        for (int i = 1; i <= 30; i++) {
            System.out.print("\rPush up " + i);

 /* Instead of constantly writing the below try & catch blocks for slowing time, I can call the custom method starting on line 41 every time I need to handle the exception for Throw.sleep method
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

  */
       sleep(1.5);

        }
        System.out.println("\n___________________ Push up completed ________________________");

        System.out.println("___________________ Pull up started ________________________");

        for (int i = 1; i <=20 ; i++) {
            System.out.print("\rPull up " + i);
         /* Instead of constantly writing the below try & catch blocks for slowing time, I can call the custom method starting on line 41 every time I need to handle the exception for Throw.sleep method
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

          */

            sleep(2.5);
        }



        System.out.println("\n___________________ Pull up completed ________________________");
    }


    public static void sleep (double seconds){
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
    }

}

/*
	MorningWorkOut:
			1. Do 30 push-ups and try pausing 1 seconds in each


			2. Do 20 Pull-ups and try pausing 1.5 seconds in each
 */