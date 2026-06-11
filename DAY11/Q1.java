package DAY11;
import java.util.*;
public class Q1 
{
    public static void SumOfNumber(int a,int b)
    {
        int sum=a+b;
        System.out.println("Sum:"+sum);
        return;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY TWO NUMBERS: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        SumOfNumber(a, b);
    }
}
