package DAY5;
import java.util.*;
public class Q3 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int n=sc.nextInt();
        System.out.print("Factors of a number :");
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                System.out.print(i+" ");
        }
    }
}
