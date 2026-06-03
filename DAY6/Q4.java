package DAY6;
import java.util.*;
public class Q4 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER :");
        int n=sc.nextInt();
        System.out.println("ENTER POWER :");
        int p=sc.nextInt();
        double a=1.0;
        if(p>0)
        {
           for(int i=1;i<=p;i++)
            {
                a=a*n;  
            }
            System.out.println(n+"^"+p+"="+a);
        }
        else if(p<0)
        {
            for(int i=-1;i>=p;i--)
            {
                a=a*(1.0/n);
            }
            System.out.println(n+"^"+p+"="+a);
        }
        else
             System.out.println(n+"^"+p+"=0");

    }
    
}
