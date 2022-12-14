package day17_WhileAndDoWhileLoops;

public class FrequencyOfWord_WithWhileLoop {
    public static void main(String[] args) {

        System.out.println("_______________ Count the total numbers of Java in the String ________________");

    String str = "Java java JaVa Python"; // the approach we take is deleting the word Java until no more Java is left in the String. And take the count of the number of deletion. We use replaceFirst method
        str = str.toLowerCase();
        int count = 0;

        while(str.contains("java")){
            str = str.replaceFirst("java", "");// replaceFirst() method deals with "java" one by one, therefore we need to increase the count to run the Loop to keep on removing "java" from the String and storing the number of counts in the variable named count.
            count++;
        }

        System.out.println(count);

        System.out.println("_________ Count the total numbers of Java & python in the String __________");

        String s = "java java java python python python";

        int countJava =0;
        int countPython = 0;

        while(s.contains("java") || s.contains("python")){

            if(s.contains("java")){
                s = s.replaceFirst("java", "");
                countJava++;
            }

            if(s.contains("python")){
                s = s.replaceFirst("python", "");
                countPython++;
            }

        }

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);



    }
 }