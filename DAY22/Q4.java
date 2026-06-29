package DAY22;
import java.util.*;
public class Q4 
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        // Remove spaces
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                result += ch;
            }
        }

        System.out.println("String after removing spaces: " + result);

        sc.close();
    }
}
    

