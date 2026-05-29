package DAY3;
import java.util.*;
public class Q3 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a=sc.nextInt();
        System.out.println("Enter the second number :");
        int b=sc.nextInt();
        System.out.print("GCD of "+a+" and "+b+" is :");
        while (b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.print(a);
    }
}
