package DAY7;
import java.util.*;
public class Q3 
{
    public static int SumOfDigit(int n,int s)
    {
        if(n==0)
            return s;
        s=s+n%10;
        return SumOfDigit(n/10,s);
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int n=sc.nextInt();
        int sum=SumOfDigit(n, 0);
        System.out.println(sum);
    }
}