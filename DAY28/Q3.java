package DAY28;
import java.util.Scanner;

class Ticket {
    int ticketNo;
    String customerName;
    int numberOfTickets;
    double ticketPrice = 250.0;
    double totalAmount;

    // Input booking details
    void bookTicket() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Ticket Number: ");
        ticketNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        numberOfTickets = sc.nextInt();

        totalAmount = numberOfTickets * ticketPrice;
    }

    // Display booking details
    void displayTicket() {
        System.out.println("\n------ Ticket Details ------");
        System.out.println("Ticket Number     : " + ticketNo);
        System.out.println("Customer Name     : " + customerName);
        System.out.println("Tickets Booked    : " + numberOfTickets);
        System.out.println("Ticket Price      : ₹" + ticketPrice);
        System.out.println("Total Amount      : ₹" + totalAmount);
        System.out.println("Booking Status    : Confirmed");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Ticket t = new Ticket();

        t.bookTicket();
        t.displayTicket();
    }
}
