package DAY7;
import java.util.*;
public class Q2 
{
    public static void PrintFibo(int a, int b, int n)
    {
        if(n==0)
            return;
        int c=a+b;
        System.out.print(c+" ");
        PrintFibo(b, c, n-1);
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF TERMS :");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        PrintFibo(a, b, n-2);
    }
  
}
