package DAY13;
import java.util.*;
public class Q3 
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
        int largest=arr[0];
        for(int i=1;i<n;i++)
        {
            if(largest<arr[i])
                largest=arr[i];
        }
        System.out.println("LARGEST ELEMENT IN AN ARRAY:"+largest);
        int smallest=arr[0];
        for(int i=1;i<n;i++)
        {
            if(smallest>arr[i])
                smallest=arr[i];
        }
        System.out.println("SMALLEST ELEMENT IN AN ARRAY:"+smallest);
    }
}
