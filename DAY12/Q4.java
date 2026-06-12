package DAY12;
import java.util.*;
public class Q4 
{
    public static void PerfectNumber(int a)
    {
        int s=0;
        int b=a;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
                s=s+i;
        }
        if(s==b)
            System.out.println(b+" is a Perfect Number");
        else
            System.out.println(b+" is not a Perfect Number");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int a=sc.nextInt();
        PerfectNumber(a);
    }
}
