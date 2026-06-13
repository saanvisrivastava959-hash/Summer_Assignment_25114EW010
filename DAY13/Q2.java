package DAY13;
import java.util.*;
public class Q2 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF AN ARRAY: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("ENTER THE ELEMENTS OF AN ARRAY: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int s=0;
        int avg=0;
        for(int i=0;i<n;i++)
        {
            s=s+arr[i];
        }
        avg=s/n;
        System.out.println("SUM :"+s);
        System.out.println("AVERAGE :"+avg);
    }
}
