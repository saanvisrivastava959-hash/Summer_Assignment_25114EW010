package DAY4;
import java.util.*;
public class Q2 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Nth term that is to be found out :");
        int n=sc.nextInt(); 
        int a=0;
        int b=1;
        if(n==0)
            System.out.println("Nth term :"+a);
        else
        {
        for(int i=1;i<=n;i++)
        {
            int c=a+b;
            a=b;
            b=c;
        }
        System.out.println("Nth ter :"+a);
    }
    }
}
