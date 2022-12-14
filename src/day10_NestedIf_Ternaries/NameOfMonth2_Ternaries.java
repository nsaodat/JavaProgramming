package day10_NestedIf_Ternaries;

public class NameOfMonth2_Ternaries {

    public static void main(String[] args) {

        // number of the question marks (?) and number is the columns (:) must be equal in Ternaries, otherwise we will have a compile error
        // parenthesis are optional in ternaries. The conditions are not required to be inside the parenthesis.
        // But, it is good to have to make it readable
        int n =15;

        String name = (n==1)? "Jan" :(n==2)? "Feb" :(n==3)? "Mar" :(n==4)? "April" :(n==5)? "May" :(n==6)?"Jun"
                :(n==7)? "Jul" :(n==8)? "Aug" :(n==9)? "Sep" :(n==10)? "Oct" :(n==11)?"Nov" : "Dec";

        System.out.println(name);


    }

    }

