import java.io.*;
class SumDiagonalR
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a[][]=new int[3][3];
        int Sum=0;
        System.out.println(" Enter 9 elements for array one :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }
        System.out.println(" Matrix ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i+j==2)
                {
                    Sum = Sum + a[i][j];
                }
            }
        }
        System.out.println("Sum of Right Diagonal = "+Sum);
    }
} 