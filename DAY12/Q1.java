package DAY12;
import java.util.*;
public class Q1 
{
    public static void PalindromeNumber(int a)
    {
        int r=0;
        int n=a;
        while(a>0)
        {
            r=(r*10)+(a%10);
            a=a/10;
        }
        if(n==r)
            System.out.println(n+" is a Palindrome Number");
        else
            System.out.println(n+" is not a Palindrome Number");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int a=sc.nextInt();
        PalindromeNumber(a);
    }
}
