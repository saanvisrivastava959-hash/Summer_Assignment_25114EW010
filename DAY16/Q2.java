package DAY16;
import java.util.*;
public class Q2 
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
        int maxfreq=0;
        int maxelement=arr[0];
        for(int i=0;i<n;i++)
        {
            int c=1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                    c++;
            }
            if(c>maxfreq)
            {
                maxfreq=c;
                maxelement=arr[i];
            }
        }
        System.out.println("Maximum Frequency:"+maxfreq);
        System.out.println("Maximum Element:"+maxelement);
    }
}
