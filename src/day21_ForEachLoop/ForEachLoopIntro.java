package day21_ForEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {
// we use for each loop when we need to access the value of the Data structure

        int[]numbers =  {10,20,30,40,50,60,70,80,90,100};
        //                0  1  2  3  4  5  6  7  8  9

        for (int i = 0; i < numbers.length; i++) {
            int eachElement = numbers[i]; //from the array pass the index number to get each element
            System.out.println(eachElement);
        }

        System.out.println("_________________________________________________");

        for (int eachElement : numbers){
            System.out.println(eachElement);
        }





    }
}
