package DAY30;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] bookId = new int[n];
        String[] bookName = new String[n];
        String[] author = new String[n];

        // Input book details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Book " + (i + 1));

            System.out.print("Book ID: ");
            bookId[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Book Name: ");
            bookName[i] = sc.nextLine();

            System.out.print("Author Name: ");
            author[i] = sc.nextLine();
        }

        // Display book details
        System.out.println("\n----- Library Records -----");
        System.out.println("Book ID\tBook Name\tAuthor");

        for (int i = 0; i < n; i++) {
            System.out.println(bookId[i] + "\t" + bookName[i] + "\t" + author[i]);
        }

        sc.close();
    }
}
