import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {

        // converts an array into a readable string representation.
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Readable string: " + Arrays.toString(arr));

        // sort an array in ascending order
        int[] arr2 = { 8, 2, 5, 1, 8, 4, 0, 3, 1 };

        Arrays.sort(arr2);
        System.out.println("Sorted Array: " + Arrays.toString(arr2));

        // fill the array with specific value
        int[] arr3 = new int[5];
        Arrays.fill(arr3, 100);
        System.out.println("Filled Array: " + Arrays.toString(arr3));

        // copies an array up to a specific length.
        int[] newArr = Arrays.copyOf(arr3, 3);
        System.out.println("Copied Array: " + Arrays.toString(newArr));

        // copies elements within a given range.
        int[] newArr2 = Arrays.copyOfRange(arr3, 0, 2);
        System.out.println("Range Copy Array: " + Arrays.toString(newArr2));

        // compare two arrays
        System.out.println("Compare: " + Arrays.equals(arr, arr2));
    }
}
