package DAY6;
import java.util.*;
public class Q1 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);  
        System.out.println("ENTER ANY DECIMAL :");
        int n=sc.nextInt();
        int og=n;
        if(n<0)
        {
            n=-n;
        }
        if(n==0)
        {
            System.out.println("Binary Number : 0");
            return;
        }
        String bin="";
        while(n>0)
        {
            bin=(n%2)+bin;
            n=n/2;
        }
        if(og>0)
            System.out.println("Binary Number : "+bin);
        else
            System.out.println("Binary Number : -"+bin);
    }
}
