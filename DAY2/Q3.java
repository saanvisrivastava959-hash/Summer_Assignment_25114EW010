package DAY2;
import java.util.*;
public class Q3 
{
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int n=sc.nextInt();
        int p=1;
        while(n>0)
        {
            int s=n%10;
            p=p*s;
            n=n/10;
        }
        System.out.println("Product of Digits :"+p);
    }
}
