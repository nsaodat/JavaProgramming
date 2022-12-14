package day18_NestedLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {
// A loop can be nested inside another loop
// used for repeating a loop
// Each time the outer loop is repeated, the inner loop(s) is/are reentered and started a new. In another words, one iteration of the outer loop, executes all the iteration of the inner loop
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.println("Wooden Spoon");
            }
        }

    }

}
