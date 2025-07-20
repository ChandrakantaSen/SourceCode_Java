import java.io.*;
class matrix12
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int i,j,n;
            System.out.println("Enter the size of the row of the matrix : - ");
            n=Integer.parseInt(br.readLine());
            int a[][]=new int[n][n];
            int b[][]=new int[n][n];
            int c[][]=new int[n][n];
            System.out.println("Enter the values in the first matrix : - ");
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
            System.out.println("Enter the values in the second matrix : - ");
            for(i=0;i<n;i++)
            {
             for(j=0;j<n;j++)
            {
                b[i][j]=Integer.parseInt(br.readLine());
            }
        }
            System.out.println("The values in the matrix are as follows: - ");
            for(i=0;i<n;i++)
            {
             for(j=0;j<n;j++)
            {
             System.out.print(b[i][j]+" "); 
            }
            System.out.println();
           }
           int s=0,p=0,t=0;
           for(int k=0;k<n;k++)
           {
            for(i=0;i<n;i++)
            {
             for(j=0;j<n;j++)
            {
            s=s+(a[i][j]*b[j][i]);
             }
            c[k][i]=s;
            s=0;
            System.out.println();
           }
        }
           System.out.println("The third matrix are as follows: - ");
            for(i=0;i<n;i++)
            {
             for(j=0;j<n;j++)
            {
             System.out.print(c[i][j]+" "); 
            }
            System.out.println();
           }
           }
    }
               