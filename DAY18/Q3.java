package DAY18;
import java.util.*;
public class Q3 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        //array input
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //sorting
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("Sorted array :");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        //searching
        System.out.println("Enter the element to be searched :");
        int key=sc.nextInt();
        int low=0;
        int high=n-1;
        boolean found =false;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(key==arr[mid])
            {
                System.out.println("Element found at index "+mid);
                found=true;
                break;
            }
            else if(key<arr[mid])
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        if(!found)
            System.out.println("Element not found.");
    }
}