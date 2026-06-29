package DAY21;
import java.util.*;
public class Q2 
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

        System.out.println("Reversed String: " + reverse);

        sc.close();
    }
}
    

