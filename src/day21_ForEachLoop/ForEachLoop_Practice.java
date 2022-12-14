package day21_ForEachLoop;

public class ForEachLoop_Practice {
    public static void main(String[] args) {
// print the first and the last characters of each element
        String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        for (String each : words) {
            System.out.println(each.charAt(0) + ""+ each.charAt(each.length()-1));
        }
    }
}
