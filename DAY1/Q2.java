package DAY1;
import java.util.*;
public class Q2 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of which table is to be written :");
        int m=sc.nextInt();
        System.out.println("Enter the number upto which multiplication is to be done :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(m+"*"+i+"="+(m*i));
        }
    }
}
