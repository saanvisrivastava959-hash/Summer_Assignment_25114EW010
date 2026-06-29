package DAY22;
import java.util.*;
public class Q1 
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reverse = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        // Check palindrome
        if (str.equals(reverse)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
}
    

