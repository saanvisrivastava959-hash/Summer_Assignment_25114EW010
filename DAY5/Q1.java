package DAY5;
import java.util.*;
public class Q1 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        if(n==s)
        {
            System.out.println("PERFECT NUMBER");
        }
        else
        {
            System.out.println("NOT A PERFECT NUMBER");
        }
    }
 
}
