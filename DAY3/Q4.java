package DAY3;
import java.util.*;
public class Q4 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a=sc.nextInt();
        System.out.println("Enter the second number :");
        int b=sc.nextInt();
        int x=a;
        int y=b;
        System.out.print("LCM of "+x+" and "+y+" is :");
        while(y!=0)
        {
            int temp=y;
            y=x%y;
            x=temp;
        }
        int gcd=x;
        int lcm=(a*b)/gcd;
        System.out.print(lcm);
    }
}
