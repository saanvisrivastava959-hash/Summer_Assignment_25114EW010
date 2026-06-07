package DAY7;
import java.util.*;
public class Q1 
{
    public static int calcFactorial(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        int nm=calcFactorial(n-1);
        int fac=n*nm;
        return fac;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER :");
        int n=sc.nextInt();
        int ans=calcFactorial(n);
        System.out.println(ans);
    }
}
