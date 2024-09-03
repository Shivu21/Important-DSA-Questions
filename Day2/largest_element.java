package Day2;

import java.util.Arrays;

public class largest_element {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 1, 8, 3 };
        Arrays.sort(arr);
        int lastElement = arr[arr.length - 1];
        System.out.println("The Largest element is: " + lastElement);
    }
}
