package DAY10;
import java.util.*;
public class Q4 
{
    public static void main(String[] args)
    {
         for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)('A'+j-1));
            }
            for(int j=i-1;j>=1;j--)
            {
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }
    }
    
}
