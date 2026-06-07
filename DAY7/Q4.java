package DAY7;
import java.util.*;
public class Q4 
{
    public static int RevNumber(int n,int rev)
    {
        if(n==0)
            return rev;
        rev=(rev*10)+n%10;
        return RevNumber(n/10,rev);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        int r=RevNumber(n,0);
        System.out.println("REVERSE NUMBER :"+r);
    }
}
