package DAY6;
import java.util.*;
public class Q2 
{
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY BINARY NUMBER :");
        int n=sc.nextInt();
        int og=n;
        int on=n;
        if(n==0)
        {
            System.out.println("DECIMAL NUMBER :0");
            return;
        }
        int c=0;
        while(on!=0)
        {
            on=on/10;
            c++;
        }
        if(n<0)
        {
            on=-n;
        }
        else
            on=n;
        int dec=0;
        for(int i=0;i<c;i++)
            {   
                if((on%10==0)||(on%10==1))
                {
                    dec=dec+(on%10)*((int)Math.pow(2,i));
                    on=on/10;
                }
                else
                {
                    System.out.println("INVALID INPUT");
                    return;
                }
            }
        if(og>0)
            System.out.println("DECIMAL NUMBER :"+dec);
        else
            System.out.println("DECIMAL NUMBER :-"+dec);
    }
}
