package DAY14;
import java.util.*;
public class Q2 
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
        System.out.println("Enter element whose frequency is to be found: ");
        int f=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==f)
                c++;
        }
        if(c!=0)
            System.out.println("Frequency of element found is "+c);
        else
            System.out.println("Element not found");
    }
}
