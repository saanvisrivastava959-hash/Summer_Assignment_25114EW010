package DAY29;
import java.util.Scanner;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;
    double totalValue;

    // Input product details
    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        productId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        productName = sc.nextLine();

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();

        System.out.print("Enter Price per Item: ");
        price = sc.nextDouble();
    }

    // Calculate total inventory value
    void calculateValue() {
        totalValue = quantity * price;
    }

    // Display inventory details
    void displayData() {
        System.out.println("\n----- Inventory Details -----");
        System.out.println("Product ID      : " + productId);
        System.out.println("Product Name    : " + productName);
        System.out.println("Quantity        : " + quantity);
        System.out.println("Price per Item  : " + price);
        System.out.println("Total Value     : " + totalValue);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Product p = new Product();

        p.getData();
        p.calculateValue();
        p.displayData();
    }
}
