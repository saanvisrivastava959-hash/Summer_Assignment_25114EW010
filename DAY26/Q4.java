package DAY26;
import java.util.*;
public class Q4 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;
        int answer;

        // Question 1
        System.out.println("Q1. What is the capital of India?");
        System.out.println("1. Mumbai");
        System.out.println("2. New Delhi");
        System.out.println("3. Kolkata");
        System.out.println("4. Chennai");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();
        if (answer == 2)
            score++;

        // Question 2
        System.out.println("\nQ2. Which language is used for Android development?");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. C");
        System.out.println("4. HTML");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();
        if (answer == 1)
            score++;

        // Question 3
        System.out.println("\nQ3. Which planet is known as the Red Planet?");
        System.out.println("1. Earth");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Jupiter");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();
        if (answer == 3)
            score++;

        // Display result
        System.out.println("\nQuiz Completed!");
        System.out.println("Your Score: " + score + "/3");

        sc.close();
    }
}
