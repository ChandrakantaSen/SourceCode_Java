import java.io.*;
class matrix11
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int i,j,n,k,sdr=0,sl=0,sr=0,sc=0,flag=0;
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
        k=n-1;
        for(i=0;i<n;i++)
            {
             for(j=0;j<n;j++)
            {
                if(j==k)
                {
                    sdr=sdr+a[i][j];
                }
                if(i==j)
                {
                    sl=sl+a[i][j];
                }
            }
            k--;
            System.out.println();
        }
        if(sl==sdr)
        {
        for(i=0;i<n;i++)
            {
             for(j=0;j<n;j++)
            { 
                sr=sr+a[i][j];
                sc=sc+a[j][i];
            }
             if(sr!=sc)
            {
                flag=1;
            }
            sr=0;
            sc=0;
           
        }
        }
        else
        {
         flag=1;   
        }
        if(flag==0)
        {
    System.out.println("The matrix is a magic matrix: - ");                    
        }
        else
        {
    System.out.println("The matrix is not a magic matrix: - ");                                
        }
        }
    }