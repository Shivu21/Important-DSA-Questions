package Day3;

import java.util.Arrays;

public class EasyMergeSortedArray {
    public static void main(String[] args) {
        int arr1[] = {2, 3, 4, 5, 6};
        int arr2[] = {7, 8, 11, 14, 20};
        
        // Create a new array with the combined size of arr1 and arr2
        int arr3[] = new int[arr1.length + arr2.length];
        
        // Copy elements from arr1 and arr2 into arr3
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        
        // Sort the merged array
        Arrays.sort(arr3);
        
        // Print the merged and sorted array
        System.out.println("Merged sorted array: " + Arrays.toString(arr3));
    }
}
