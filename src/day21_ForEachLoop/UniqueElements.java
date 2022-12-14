package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {
        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};


        for (String each : words) { // outer for each loop
            int count = 0;

            for (String element : words) {// inner for each loop
                if (element.equals(each)){
                    count++;
                }
            }
if (count == 1)

    System.out.println(each);// printing each, because counts are initiated within the outer loop
        }
     }
}
