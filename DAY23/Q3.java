package DAY23;
import java.util.*;
public class Q3 
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().replaceAll("\\s", "").toLowerCase();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams.");
        } else {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        }

        sc.close();
    }
}
    

