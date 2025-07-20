import java.io.*;
class matrix1
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int i,j,m,n;
            System.out.println("Enter the size of the row of the matrix : - ");
            n=Integer.parseInt(br.readLine());
            System.out.println("Enter the size of the column of the matrix : - ");
            m=Integer.parseInt(br.readLine());
            int a[][]=new int[n][m];
            System.out.println("Enter the values in the matrix : - ");
            for(i=0;i<n;i++)
            {
             for(j=0;j<m;j++)
            {
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }
            System.out.println("The values in the matrix are as follows: - ");
            for(i=0;i<n;i++)
            {
             for(j=0;j<m;j++)
            {
             System.out.print(a[i][j]+" "); 
            }
            System.out.println();
        }
        }
    }
               