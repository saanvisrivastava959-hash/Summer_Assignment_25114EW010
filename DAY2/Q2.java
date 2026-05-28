package DAY2;
import java.util.*;
public class Q2 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int n=sc.nextInt();
        int m=0;
        int p;
        while(n>0)
        {
            p=n%10;
            m=(m*10)+p;
            n=n/10;
        }
        System.out.println("Reversed Number :"+m);
    }
}
