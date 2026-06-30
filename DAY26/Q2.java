package DAY26;
import java.util.*;
public class Q2 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Check voting eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        sc.close();
    }
}
    

