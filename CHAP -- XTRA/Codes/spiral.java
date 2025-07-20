import java.io.*;
class spiral

    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int i,j=0,n,k=1;
            System.out.println("Enter the size of the row of the matrix : - ");
            n=Integer.parseInt(br.readLine());
            int a[][]=new int[n][n];
            System.out.println("Enter the values in the matrix : - ");
            for(i=0;i<n;i++)
            {
                if(i%2==0)
                {
             for(j=0;j<n;j++)
            {
             a[i][j]=k;   
                         k++;
            }
        }
            else
            {
                for(j=n-1;j>=0;j--)
            {
             a[i][j]=k;   
                         k++;
            }
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
        }
    }
               