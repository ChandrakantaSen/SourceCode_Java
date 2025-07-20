import java.io.*;
class matrix3
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int i,j,n,s=0;
            System.out.println("Enter the size of the row of the matrix : - ");
            n=Integer.parseInt(br.readLine());
            int a[][]=new int[n][n];
            System.out.println("Enter the values in the matrix : - ");
            for(i=0;i<n;i++)
            {
             for(j=0;j<n;j++)
            {
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }
            System.out.println("The values in the matrix are as follows: - ");
            for(i=0;i<n;i++)
            {
             for(j=0;j<n;j++)
            {
             System.out.print(a[i][j]+" "); 
            }
            System.out.println();
        }
        for(i=0;i<n;i++)
            {
             for(j=0;j<n;j++)
            {
         s=s+a[i][j]; 
            }
            System.out.println();
        }
            System.out.println("The sum of the matrix is : - "+s);        
        }
    }
               