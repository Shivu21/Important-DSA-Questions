package Day4;

import Day1.reverse_string;

public class palindrome {
    public static void main(String[] args) {
        String str = "mom";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {

            System.out.println("It is Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
