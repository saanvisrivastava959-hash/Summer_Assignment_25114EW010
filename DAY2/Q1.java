package DAY2;
import java.util.*;
public class Q1 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int n=sc.nextInt();
        int s=0;
        int p;
        while(n>0)
        {
            p=n%10;
            s=s+p;
            n=n/10;
        }
        System.out.println("Sum of digits of a number entered ="+s);
    }
}
