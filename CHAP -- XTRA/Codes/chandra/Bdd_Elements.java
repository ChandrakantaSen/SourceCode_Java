import java.io.*;

class Bdd_Elements
{
    public static void main()throws IOException
    {
        int n,i,j;
        int a[][]=new int[10][10];
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter the range: ");
        n = Integer.parseInt(in.readLine());

        System.out.println("enter array elements: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j] = Integer.parseInt(in.readLine());
            }
            System.out.println();
        }
        
        System.out.println("Boundary elements matrix is: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0||j==0||i==(n-1)||j==(n-1))
                {
                    System.out.print(a[i][j]+" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
