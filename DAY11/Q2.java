package DAY11;
import java.util.*;
public class Q2 
{
    public static void MaxNumber(int a,int b)
    {
        if(a>b)
            System.out.println(a+" is the maximum");
        else
            System.out.println(b+" is the maximum");
        return;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY TWO NUMBERS: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        MaxNumber(a, b);
    }
}
