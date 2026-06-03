package DAY6;
import java.util.*;
public class Q3 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER :");
        int n=sc.nextInt();
        int c=0;
        String bin="";
        while(n!=0)
        {
            bin=(n%2)+bin;
            n=n/2;
        }
        int l=bin.length();
        for(int i=l-1;i>=0;i--)
        {
            if(bin.charAt(i) =='1')
            {
                c++;
            }
        }
        System.out.println("SET BITS IN A NUMBER :"+c);
    }
}
