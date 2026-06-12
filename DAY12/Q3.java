package DAY12;
import java.util.*;
public class Q3 
{
    public static void FiboNumber(int n)
    {
        int a=0;
        int b=1;
        int c=0;
        System.out.print(a+" "+b+" ");
        for(int i=3;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int n=sc.nextInt();
        FiboNumber(n);
    }
}
