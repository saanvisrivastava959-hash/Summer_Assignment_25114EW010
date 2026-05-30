package DAY4;
import java.util.*; 
public class Q3 
{
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int n=sc.nextInt();
        int temp=n;
        int c=0;
        while(n!=0)
        {
            n=n/10;
            c++;
        }
        int s=0;
        n=temp;
        while(n!=0)
        {
            int p=n%10;
            s=s+(int)Math.pow(p, c);
            n=n/10;
        }
        if(temp==s)
            System.out.println("ARMSTRONG NUMBER");
        else
            System.out.println("NOT AN ARMSTRONG NUMBER");
    }
    
}
