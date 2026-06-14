package DAY14;
import java.util.*;
public class Q4 
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
        for(int i=0;i<n;i++)
        {
            for(int k=i+1;k<n;k++)
            {
                if(arr[k]==arr[i])
                {
                    System.out.println("Duplicate Element ="+arr[k]);
                    break;
                }
            }
        }
    }
}
