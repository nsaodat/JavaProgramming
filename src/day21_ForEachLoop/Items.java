package day21_ForEachLoop;

public class Items {
    public static void main(String[] args) {


        // only common thing in these Arrays are index numbers
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        //                   0           1        2          3         4         5

        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        //                   0           1        2         3         4         5

        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        //                   0           1        2        3         4          5


        // for each loop can not be used because it is meant to be used only for 1 Array at a time, hence best to use for loop
        for (int i = 0; i < items.length; i++) {
            String itemName = items[i];
             double price = prices [i];
             int id = itemIDs[i];
            System.out.println(itemName + " - " +id+ " - $" + price);
        }


    }
}

/*
    Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

 */