package DAY13;
import java.util.*;
public class Q1 
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
        System.out.println("ELEMENTS OF AN ARRAY ARE: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
