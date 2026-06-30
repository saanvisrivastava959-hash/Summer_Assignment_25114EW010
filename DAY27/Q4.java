package DAY27;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int m1, m2, m3, m4, m5;
    int total;
    double percentage;
    String grade;

    // Input student details
    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks of Subject 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        m3 = sc.nextInt();

        System.out.print("Enter Marks of Subject 4: ");
        m4 = sc.nextInt();

        System.out.print("Enter Marks of Subject 5: ");
        m5 = sc.nextInt();
        sc.close();
    }

    // Calculate result
    void calculateResult() {
        total = m1 + m2 + m3 + m4 + m5;
        percentage = total / 5.0;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "Fail";
    }

    // Display marksheet
    void displayMarksheet() {
        System.out.println("\n========== MARKSHEET ==========");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Student Name: " + name);
        System.out.println("-------------------------------");
        System.out.println("Subject 1 : " + m1);
        System.out.println("Subject 2 : " + m2);
        System.out.println("Subject 3 : " + m3);
        System.out.println("Subject 4 : " + m4);
        System.out.println("Subject 5 : " + m5);
        System.out.println("-------------------------------");
        System.out.println("Total      : " + total);
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade      : " + grade);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Student s = new Student();

        s.getData();
        s.calculateResult();
        s.displayMarksheet();
    }
}
