package DAY12;
import java.util.*;
public class Q2 
{
    public static void ArmstrongNumber(int a)
    {
        int c=0;
        int r=a;
        int b=a;
        int n=0;
        while(a>0)
        {
            a=a/10;
            c++;
        }
        while(r>0)
        {
            n=n+(int)Math.pow(r%10 , c);
            r=r/10;
        }
        if(n==b)
            System.out.println(n+" is an Armstrong Number");
        else
            System.out.println(n+" is not an Armstrong Number");
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int a=sc.nextInt();
        ArmstrongNumber(a);
    }
}
