package DAY2;
import java.util.*;
public class Q4 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int n=sc.nextInt();
        int a=n;
        int m=0;
        while(n>0)
        {
            int p=n%10;
            m=(m*10)+p;
            n=n/10;
        }
        if(a==m)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome Number");
    }
}
