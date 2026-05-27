package DAY1;
import java.util.*;
public class Q3 
{
    public static void main(String[] args)
    {
        int f=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        if(n==0)
        {
            System.out.println("Factorial=1");
        }
        else if(n<0)
        {
            System.out.println("Invalid input");
        }
        else
        {
         for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial="+f);
    }
    }
}
