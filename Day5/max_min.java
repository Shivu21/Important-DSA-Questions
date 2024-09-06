package Day5;

public class max_min {
    public static void main(String[] args) {
        int arr[] = {2,1,3,45,46,90,80,102};
        int min = arr[0],max=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        // System.out.println(min);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("minimum :"+min+ " maximum :"+max);
    }
}
