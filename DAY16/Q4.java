package DAY16;
import java.util.*;
public class Q4 
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Array after duplication:");
        for(int i=0;i<n;i++)
        {
            boolean isDup=false;
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    isDup=true;
                    break;
                }
            }
            if(!isDup)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
