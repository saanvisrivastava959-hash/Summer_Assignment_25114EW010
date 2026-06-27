package DAY18;
import java.util.*;
public class Q2 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            int small=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[small]>arr[j])
                    small=j;
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
        System.out.print("Sorted Array :");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
