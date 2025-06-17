 public class arrays {

    public static void main(String[] args) {

        // 1D ARRAY: Prices of 5 grocery items
        System.out.println("1D Array Example - Grocery Item Prices:");
        double[] prices = {25.5, 40.0, 60.75, 15.25, 90.99};

        for (int i = 0; i < prices.length; i++) {
            System.out.println("Item " + (i + 1) + " Price: ₹" + prices[i]);
        }

        System.out.println();

        // 2D ARRAY: Weekly sales data for 3 products over 4 weeks
        System.out.println("2D Array Example - Weekly Sales Data:");
        int[][] sales = {
            {120, 135, 150, 160},  // Product 1
            {80,  95,  100, 110},  // Product 2
            {200, 210, 250, 270}   // Product 3
        };

        for (int i = 0; i < sales.length; i++) {
            System.out.print("Product " + (i + 1) + " Weekly Sales: ");
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print(sales[i][j] + " ");
            }
            System.out.println();
        }
    }
}

