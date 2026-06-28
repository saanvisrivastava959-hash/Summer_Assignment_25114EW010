package DAY19;
import java.util.*;
public class Q2 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int r=sc.nextInt();
        System.out.println("Enter number of columns :");
        int c=sc.nextInt();
        int mat1[][]=new int[r][c];
        int mat2[][]=new int[r][c];
        int diff[][]=new int[r][c];
        System.out.println("Enter elements first matrix :");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements second matrix :");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                diff[i][j]=mat1[i][j]-mat2[i][j];
            }
        }
        System.out.println("Subtraction of two matrix :");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(diff[i][j]+" ");
            }
            System.out.println();
        }
    }
}

    

