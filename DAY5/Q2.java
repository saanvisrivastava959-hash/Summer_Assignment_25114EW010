package DAY5;
import java.util.*;
public class Q2 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        int s=0;
        int temp=n;
        while(n!=0)
        {
            int p=1;
            int d=n%10;
            for(int i=1;i<=d;i++)
            {
                p=p*i;
            }
            s=s+p;
            n=n/10;
        }
        if(temp==s)
            System.out.println("STRONG NUMBER");
        else
            System.out.println("NOT A STRONG NUMBER");
    }
}