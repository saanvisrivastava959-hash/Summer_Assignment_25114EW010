package DAY16;
import java.util.*;
public class Q3 
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
        System.out.println("Enter the target sum:");
        int s=sc.nextInt();
        boolean f=false;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==s)
                {
                    System.out.println("Pair Found:"+arr[i]+"+"+arr[j]+"="+s);
                    f=true;
                }
            }
        }
        if(!f)
            System.out.println("No pair found");
    }
}
