package DAY15;
import java.util.*;
public class Q4 
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int index=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<n)
        {
            arr[index]=0;
            index++;
        }
        System.out.println("Array after moving all zeroes at the end :");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
