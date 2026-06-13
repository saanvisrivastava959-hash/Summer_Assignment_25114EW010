package DAY13;
import java.util.*;
public class Q4 
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
        int ev=0;
        int od=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
                ev++;
            else
                od++;
        }
        System.out.println("NUMBER OF EVEN NUMBER: "+ev);
        System.out.println("NUMBER OF ODD NUMBERS: "+od);
    }
}
