package DAY14;
import java.util.*;
public class Q1 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of an array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element to be found: ");
        int f=sc.nextInt();
        int pos=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==f)
            {
                pos=i+1;
                break;
            }
        }
        if(pos!=-1)
            System.out.println("Element found at position "+pos);
        else
            System.out.println("Element not found");
    } 
    
}
