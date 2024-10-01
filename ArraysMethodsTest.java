import java.util.Arrays;

public class ArraysMethodsTest {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 9};

        // 1. sort() - Sorts the array
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // 2. binarySearch() - Searches for a value in a sorted array
        int index = Arrays.binarySearch(arr, 8);
        System.out.println("Index of 8 in sorted array: " + index);

        // 3. fill() - Fills the array with a specific value
        Arrays.fill(arr, 0);
        System.out.println("Array after fill with 0: " + Arrays.toString(arr));

        // 4. equals() - Compares two arrays for equality
        int[] arr2 = {0, 0, 0, 0, 0};
        System.out.println("Are arr and arr2 equal? " + Arrays.equals(arr, arr2));

        // 5. toString() - Converts the array to a string
        System.out.println("Array as a string: " + Arrays.toString(arr));
    }
}

