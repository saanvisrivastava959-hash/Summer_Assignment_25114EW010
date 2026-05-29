package DAY3;
import java.util.*;
public class Q2 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range :");
        int r=sc.nextInt();
        System.out.print("Range of Prime Numbers are :");
        for(int i=1;i<=r;i++)
        {
            int c=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                    c++;
            }
                if(c==2)
                    System.out.print(i+"  ");
        }
    }
}
