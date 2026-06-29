package DAY22;
import java.util.*;
public class Q2 
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        int words = 0;
        boolean inWord = false;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ' && !inWord) {
                words++;
                inWord = true;
            } else if (ch == ' ') {
                inWord = false;
            }
        }

        System.out.println("Number of words = " + words);

        sc.close();
    }
}
