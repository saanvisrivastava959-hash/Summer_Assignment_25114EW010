package DAY21;
import java.util.*;
public class Q4 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String upper = str.toUpperCase();

        System.out.println("Uppercase String: " + upper);

        sc.close();
    }
}
