package day15_ForLoops;

public class Alphabet {
    public static void main(String[] args) {
        //A~Z ===> 65 ~90

        for (int i = 65; i <= 90; i++){ // since initialisation is from 65, I should go forward and increase by 1 number, since we are increasing one by one -- i++

            // I can not apply relational operators to String in For Loop
            System.out.print((char)i + " "); // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        }
        System.out.println();
        System.out.println("________________________________________________________");
        for (char i = 'a'; i <= 'z'; i++){
            System.out.print(i + " "); // a b c d e f g h i j k l m n o p q r s t u v w x y z 
        }
        System.out.println();
        System.out.println("________________________________________________________");

        for (char i = 'Z'; i >= 'A'; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("________________________________________________________");
        for (char i = 'z'; i >= 'a'; i--){
            System.out.print(i + " "); // z y x w v u t s r q p o n m l k j i h g f e d c b a
        }
        System.out.println();
        System.out.println("________________________________________________________");
        for (int i = 90; i >= 65; i--){
            System.out.print((char) i + " "); // Z Y X W V U T S R Q P O N M L K J I H G F E D C B A
        }

    }
}

/*
        Print:
            A~Z
            a~z
            Z~A
            z~a
         */
