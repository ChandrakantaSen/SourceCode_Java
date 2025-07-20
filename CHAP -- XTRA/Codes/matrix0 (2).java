import java.io.*;
class matrix0
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int i,j;
            int a[][]=new int[4][5];
            System.out.println("Enter the values in the matrix : - ");
            for(i=0;i<4;i++)
            {
             for(j=0;j<5;j++)
            {
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }
            System.out.println("The values in the matrix are as follows: - ");
            for(i=0;i<4;i++)
            {
             for(j=0;j<5;j++)
            {
             System.out.print(a[i][j]+" "); 
            }
            System.out.println();
        }
        }
    }
               