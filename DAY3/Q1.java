package DAY3;
import java.util.*;
public class Q1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(n==0)
            System.out.println("Niether Prime nor Composite");
        else if(c==2)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}
