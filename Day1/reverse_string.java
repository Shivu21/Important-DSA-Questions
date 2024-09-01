package Day1;

public class reverse_string {
    public static void main(String[] args) {
        String str = "shivam";
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
           rev += str.charAt(i);
        }
        System.out.println("Reverse String is :"+rev);
    }
}
