package DAY1;
import java.util.*;
public class Q4 
{
    public static void main(String[] args)
    { 
        int c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        while(n>0)
        {
            n=n/10;
            c++;
        }
        System.out.println("Number of digits="+c);
    }
}
