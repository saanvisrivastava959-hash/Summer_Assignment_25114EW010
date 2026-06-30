package DAY28;
import java.util.Scanner;

class BankAccount {
    int accountNo;
    String accountHolder;
    double balance;

    // Input account details
    void createAccount() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        accountNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        accountHolder = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
        sc.close();
    }

    // Deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited Successfully.");
    }

    // Withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn Successfully.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    // Display account details
    void display() {
        System.out.println("\n----- Bank Account Details -----");
        System.out.println("Account Number : " + accountNo);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class Q2
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount();

        acc.createAccount();

        System.out.print("Enter amount to deposit: ₹");
        double depositAmount = sc.nextDouble();
        acc.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ₹");
        double withdrawAmount = sc.nextDouble();
        acc.withdraw(withdrawAmount);

        acc.display();

        sc.close();
    }
}
