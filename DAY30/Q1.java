package DAY30;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] rollNo = new int[n];
        String[] name = new String[n];
        double[] marks = new double[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Enter Roll Number: ");
            rollNo[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextDouble();
        }

        // Display student records
        System.out.println("\n------ Student Records ------");
        System.out.println("Roll No\tName\t\tMarks");

        for (int i = 0; i < n; i++) {
            System.out.println(rollNo[i] + "\t" + name[i] + "\t\t" + marks[i]);
        }

        sc.close();
    }
}
