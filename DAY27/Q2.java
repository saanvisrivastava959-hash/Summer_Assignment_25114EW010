package DAY27;
import java.util.*;
class Employee 
{
    int empId;
    String name;
    String department;
    double salary;
}
public class Q2 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];

        // Input employee details
        for (int i = 0; i < n; i++) {
            employees[i] = new Employee();

            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Employee ID: ");
            employees[i].empId = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Employee Name: ");
            employees[i].name = sc.nextLine();

            System.out.print("Department: ");
            employees[i].department = sc.nextLine();

            System.out.print("Salary: ");
            employees[i].salary = sc.nextDouble();
        }

        // Display employee records
        System.out.println("\n----- Employee Records -----");
        System.out.println("ID\tName\t\tDepartment\tSalary");

        for (Employee emp : employees) {
            System.out.println(emp.empId + "\t" +
                               emp.name + "\t\t" +
                               emp.department + "\t\t₹" +
                               emp.salary);
        }
        sc.close();
    }
}
