import java.io.*;

class Array_2D_Exp
{
    public static void main(String args[])throws IOException
    {
        int a[][]=new int[10][10];
        int i,j,n,k=1;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the order of matrix: ");
        n = Integer.parseInt(in.readLine());
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                {
                    a[i][j]=k;
                    System.out.print(" "+a[i][j]+" ");
                }
                else
                {
                    a[i][j]=0;
                    System.out.print(" "+a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
