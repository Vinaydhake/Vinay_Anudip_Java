/*A 2D array (two-dimensional array) is an array of arrays. It represents data in the form of a table (rows and columns) — like a matrix or spreadsheet.

Syntax:

datatype[][] arrayName = new datatype[rows][columns];
int[][] array = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

we have 3 employees, and we track their sales for 4 weeks. This forms a 3x4 table, where each row = employee and each column = weekly sales.*/

// Program to demonstrate 2D array in Java with employee sales data

public class array2d {

    public static void main(String[] args) {

        // Declaring and initializing a 2D array
        int[][] sales = {
            {120, 130, 125, 140},  // Employee 1 sales for 4 weeks
            {100, 110, 115, 120},  // Employee 2
            {150, 160, 155, 165}   // Employee 3
        };

        // Displaying the sales data
        System.out.println("Weekly Sales Data (Employees × Weeks):");

        for (int i = 0; i < sales.length; i++) {
            System.out.print("Employee " + (i + 1) + ": ");
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print(sales[i][j] + " ");
            }
            System.out.println(); // Move to next employee
        }
    }
}

