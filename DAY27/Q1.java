package DAY27;
import java.util.*;
class Student 
{
    int rollNo;
    String name;
    double marks;
}
public class Q1 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            students[i] = new Student();

            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Roll Number: ");
            students[i].rollNo = sc.nextInt();

            sc.nextLine(); // Consume newline

            System.out.print("Name: ");
            students[i].name = sc.nextLine();

            System.out.print("Marks: ");
            students[i].marks = sc.nextDouble();
        }

        // Display student records
        System.out.println("\n----- Student Records -----");
        System.out.println("Roll No\tName\t\tMarks");

        for (Student s : students) {
            System.out.println(s.rollNo + "\t" + s.name + "\t\t" + s.marks);
        }

        sc.close();
    }
}
