package day19_RecapLoopsAndStrings;

public class ExitMethod {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) { // i: 0, 1, 2, 3, 4
            if (i == 3) {
                // break; // terminates teh loop after printing 0 1 2 Wooden Spoon
                // continue; // terminates the current iteration of the loop within the if condition  Prints: 0 1 2 4 Wooden Spoon
                System.exit(0); // terminates the program when the if condition becomes true

            }
            System.out.println(i);
        }
        System.out.println("Wooden Spoon");
    }

}
