package DAY17;
import java.util.*;
public class Q2 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the first array:");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        System.out.println("Enter the elements of first array:");
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of the second array:");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter the elements of second array:");
        for(int j=0;j<n2;j++)
        {
            arr2[j]=sc.nextInt();
        }
        int merge[]=new int[n1+n2];
        for(int i=0;i<n1;i++)
        {
            merge[i]=arr1[i];
        }
        for(int j=0;j<n2;j++)
        {
            merge[n1+j]=arr2[j];
        }
        System.out.print("Array after union :");
        for(int i=0;i<(n1+n2);i++)
        {
            boolean isDup=false;
            for(int j=0;j<i;j++)
            {
                if(merge[i]==merge[j])
                {
                    isDup=true;
                    break;
                }
            }
            if(!isDup)
            {
                System.out.print(merge[i]+" ");
            }
        }
    }
}
