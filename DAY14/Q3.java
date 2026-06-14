package DAY14;
import java.util.*;
public class Q3 
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
        int larg=-1;
        int secl=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>larg)
            {
                secl=larg;
                larg=arr[i];
            }
            else if(arr[i]>secl && arr[i]!=larg)
            {
                secl=arr[i];
            }
        }
        System.out.println("Second largest element :"+secl);
    }
}
