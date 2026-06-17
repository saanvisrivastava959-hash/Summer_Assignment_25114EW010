package DAY16;
import java.util.*;
public class Q1 
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        int arr[]=new int[n-1];
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<n-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        int expsum=(n*(n+1))/2;
        int actsum=0;
        for(int i=0;i<n-1;i++)
        {
            actsum=actsum+arr[i];
        }
        int missingn=expsum-actsum;
        System.out.println("Missing Number: "+missingn);
    }
}
