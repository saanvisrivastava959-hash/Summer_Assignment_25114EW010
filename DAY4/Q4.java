package DAY4;
import java.util.*;
public class Q4 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any range :");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            int temp=i;
            int n=i;
            int c=0;
            while(n!=0)
            {
               n=n/10;
               c++;
            }
            int s=0;
            n=temp;
            while(n!=0)
            {
               int p=n%10;
               s=s+(int)Math.pow(p, c);
               n=n/10;
            }
            if(temp==s)
                System.out.print(s+" ");
        }
    }
}
