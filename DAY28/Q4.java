package DAY28;
import java.util.Scanner;

class Contact {
    int contactId;
    String name;
    String phone;
    String email;

    // Input contact details
    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Contact ID: ");
        contactId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        phone = sc.nextLine();

        System.out.print("Enter Email: ");
        email = sc.nextLine();
    }

    // Display contact details
    void displayData() {
        System.out.println("\n------ Contact Details ------");
        System.out.println("Contact ID   : " + contactId);
        System.out.println("Name         : " + name);
        System.out.println("Phone Number : " + phone);
        System.out.println("Email        : " + email);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Contact c = new Contact();

        c.getData();
        c.displayData();
    }
}
