package DAY1;
import java.util.*;
public class Q1 
{
        public static void main(String[] args)
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int N=sc.nextInt();
        for(int i=1;i<=N;i++)
        {
            sum=sum+i;
        }
        System.out.print("The sum of first "+N+" natural numbers is :");
        System.out.print(sum);
    }
}
