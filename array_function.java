import java.util.Arrays;

public class array_function {

    public static void main(String[] args) {
      int[] arr = {3, 5, 1, 4};

           System.out.println("Original Array: " + Arrays.toString(arr));

        // Sort the array
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Search for an element using binarySearch
        int index = Arrays.binarySearch(arr, 4);
        if (index >= 0) {
            System.out.println("Element 4 found at index: " + index);
        } else {
            System.out.println("Element 4 not found in the array.");
        }
    }
}
