package DAY11;
import java.util.*;
public class Q3 
{
    public static void PrimeNumber(int a)
    {
        int c=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
                c++;
        }
        if(c==2)
            System.out.println(a+" is a Prime Number");
        else
            System.out.println(a+" is not a Prime Number");
        return;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int a=sc.nextInt();
        PrimeNumber(a);
    }
}
