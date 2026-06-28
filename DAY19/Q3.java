package DAY19;
import java.util.*;
public class Q3 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int r=sc.nextInt();
        System.out.println("Enter number of columns :");
        int c=sc.nextInt();
        int mat[][]=new int[r][c];
        int trans[][]=new int[r][c];

        System.out.println("Enter elements of matrix :");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                trans[j][i]=mat[i][j];
            }
        }
        System.out.println("Original matrix :");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
