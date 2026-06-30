package DAY28;
import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    String author;
    boolean available;

    // Input book details
    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        bookId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        bookName = sc.nextLine();

        System.out.print("Enter Author Name: ");
        author = sc.nextLine();

        System.out.print("Is the book available? (true/false): ");
        available = sc.nextBoolean();
        sc.close();
    }

    // Display book details
    void displayData() {
        System.out.println("\n----- Library Record -----");
        System.out.println("Book ID      : " + bookId);
        System.out.println("Book Name    : " + bookName);
        System.out.println("Author Name  : " + author);

        if (available)
            System.out.println("Status       : Available");
        else
            System.out.println("Status       : Issued");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Book b = new Book();

        b.getData();
        b.displayData();
    }
}