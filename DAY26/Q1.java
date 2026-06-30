package DAY26;
import java.util.*;
public class Q1 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int number = random.nextInt(100) + 1;
        int guess;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too High!");
            } else if (guess < number) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
            }
        } while (guess != number);

        sc.close();
    }
}
