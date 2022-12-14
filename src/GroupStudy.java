import utilities.ArraysUtility;

import java.util.Arrays;

public class GroupStudy {

    public class Methods {



/*
    1.	What is a method and why do we need it?

    The method is creating a function. In other words, grouping the codes.
            Advantages: Improves the re-usability of the codes.

    declaring a method:

    Access-Modifier     Specifier   ReturnType     MethodName(Parameter){




2.	Please, explain the difference between void and return methods.
Return type MUST be included in the method syntax.

Return type:
•	Void  does not return a value. Only performs the task/displays the output
•	Any datatype (primitive or non-primitive)  must return a VALUE


Custom Methods:
   1. void methods
   2. void methods with arguments
   3. return methods
   4. returns with argument
   5. overloading

Tasks:
Day 23/15 - Create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result.



Day 23/ 17 - Create a method that can check if two strings are anagrams
E.g.
anagram("silent", "listen")


output:
silent and listen are anagram
Day 24/2 - Create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
E.g.
str1 = "cba"
str2 = "bac";

isAnagram(str1, str2) ====> true


Day 24/3 - Create a method named reverse that passes one string parameter, the method can return the reversed string
E.g.
str = "Java";

reverse(str) ==> avaJ


Day 24/4 - By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false
E.g.
str = "Level"

isPalindrome(str) ===> true

3.	Please, define the custom method - Overloading. State the advantages.

Method Overloading: multiple different methods sharing the same method name, different parameters

			return type, access modifiers and specifiers can be same or can be different

			Advantage:
				1. easy to memorize
				2. easy to read
				3. reusable
				4. flexible


Things to Remember
• Parameters of the overloaded method must be different
• Return Type of the overloaded method can be same or different
• Method can be overloaded any number of times
• Any method can be overloaded

E.g.
Utility Classes:
	StringUtility
	ArrayUtility
	NumberUtility








Day25/Task1:
    1. create a method that can merge two integer arrays.

	2. create a method that can merge two double arrays.

	3. create a method that can merge two char arrays.

	4. create a method that can merge two String arrays.

Day25/Task 4:
	1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array


 */



    }
    // Day25/Task1: merge the given two arrays and return a new array
    public static int[] merge(int[] array1, int[] array2) {

        int[] result = {};

        for (int each : array1) {
            result = ArraysUtility.addElements(result, each);
        }
        for (int each : array2) {
            result = ArraysUtility.addElements(result, each);
        }
        return result;
    }


    //Day25/Task 4:   reverses the given array, returns a new array
    public static int[] reverse ( int[] array){

        int[] result = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;

    }

}

