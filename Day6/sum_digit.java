package Day6;

public class sum_digit {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 2,7,4};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
