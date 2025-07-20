
import java.io.*;
class spiral2

    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int i,j=0,n,k=0;
            System.out.println("Enter the size of the row of the matrix : - ");
            n=Integer.parseInt(br.readLine());
            int a[][]=new int[n][n];
             k=(n*n);
            System.out.println("Enter the values in the matrix : - ");
            for(i=n-1;i>=0;i--)
            {
                if(i%2==0)
                {
             for(j=n-1;j>=0;j--)
            {
             a[i][j]=k;   
                         k--;
            }
        }
            else
            {
                for(j=0;j<n;j++)
            {
             a[i][j]=k;   
                         k--;
            }
            }
            }
        
            System.out.println("The values in the matrix are as follows: - ");
            for(i=n-1;i>=0;i--)
            {
             for(j=n-1;j>=0;j--)
            {
             System.out.print(a[i][j]+" "); 
            }
            System.out.println();
        }
        }
    }
               