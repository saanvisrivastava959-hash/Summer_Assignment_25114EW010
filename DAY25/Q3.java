package DAY25;
import java.util.*;
public class Q3 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of names
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        String[] names = new String[n];

        // Input names
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        // Sort names alphabetically
        Arrays.sort(names);

        // Display sorted names
        System.out.println("Names in Alphabetical Order:");
        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }
}
    

