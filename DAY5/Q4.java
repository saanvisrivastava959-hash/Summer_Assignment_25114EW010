package DAY5;
import java.util.*;
public class Q4 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range :");
        int z=0;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int c=0;
                for(int a=1;a<=i;a++)
                {
                    if(i%a==0)
                        c++;
                }
                if(c==2)
                    z=i;
                           
        }
        System.out.println("Largest prime factor :"+z);
    }
}
