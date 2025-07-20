import java.io.*;

class diagonal_zero
{
    public static void main()throws IOException
    {
        int a[][]=new int[10][10];
        int i,j;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the elements: ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j] = Integer.parseInt(in.readLine());
            }
            System.out.println();
        }

        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(a[i][j]==a[i][i])
                {
                    a[i][j] = 0;
                }
            }
        }

        System.out.println("Required Matrixx is: ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}