//A 1D array in Java is a linear collection of elements of the same type stored in a single row. It’s like a list of items.

// Syntax:
//datatype[] arrayName = new datatype[size];

// int[] marks = new int[5];  // Array of 5 integers

// int[] marks = {90, 85, 70, 88, 76};
//    marks[0] = 90;
//    marks[1] = 85;
//    marks[2] = 70;
//    marks[3] = 88;
//    marks[4] = 76;


// Program to demonstrate 1D array in Java with grocery item prices

public class array1d{

    public static void main(String[] args) {

        double[] prices = new double[5];
        //{25.5, 40.0, 60.75, 15.25, 90.99};
        prices[0] = 25.5;
        prices[1] = 40.0;
        prices[2] = 60.75;
        prices[3] = 15.25;
        prices[4] = 90.99;
        prices[5] = 122.00;
        System.out.println(prices[3]);

        System.out.println("Grocery Item Prices:");

        for (int i = 0; i < prices.length; i++) {
            System.out.println("Item " + (i + 1) + " Price: " + prices[i]);
        }

            System.out.println(prices[3]);
    }
}
