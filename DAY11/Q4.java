package DAY11;
import java.util.*;
public class Q4 
{
    public static void FactorialNumber(int a)
    {
        int fac=1;
        if(a==0||a==1)
            System.out.println("1 is the factorial of "+a);
        else if(a<0)
            System.out.println("Invalid Input");
        else
        {
            for(int i=1;i<=a;i++)
            {
               fac=fac*i;
            }
            System.out.println(fac+" is the factorial of "+a);
        }
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int a=sc.nextInt();
        FactorialNumber(a);
    }
}
