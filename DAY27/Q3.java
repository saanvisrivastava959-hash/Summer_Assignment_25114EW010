package DAY27;

import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double basicSalary;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
        sc.close();
    }

    void calculateSalary() {
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double netSalary = basicSalary + hra + da;

        System.out.println("\n----- Salary Details -----");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Net Salary    : " + netSalary);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.getData();
        emp.calculateSalary();
    }
}
