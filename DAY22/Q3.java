package DAY22;
import java.util.*;
public class Q3 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Character Frequencies:");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Skip spaces
            if (ch == ' ')
                continue;

            int count = 1;

            // Count frequency of current character
            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            // Print only first occurrence
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (ch == str.charAt(k)) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (!alreadyPrinted) {
                System.out.println(ch + " = " + count);
            }
        }

        sc.close();
    }
}
    

