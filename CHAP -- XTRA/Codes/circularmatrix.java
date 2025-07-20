import java.io.*;
class circularmatrix
{
    public static void main (String args [])throws IOException
    {
        int i,j,n,z=0,k=1;
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter the size of the array");
        n=Integer.parseInt(br.readLine());  
        int a[][]=new int[n][n];
        while(z<(n/2))
        {
            for(i=0+z;i<n-z;i++)
            {
                a[z][i]=k;
                k++;
            }
  
            for(i=z+1;i<n-z;i++)
            {
                a[i][n-z-1]=k;
                k++;
            }
            
            for(i=n-z-2;i>=0+z;i--)
            {
                a[n-z-1][i]=k;
                k++;
            }
            for(i=n-z-2;i>0+z;i--)
            {
                a[i][0+z]=k;
                k++;
            }
            z++;
        }
        if(n%2==1)
        {
            a[n/2][n/2]=k;
        }
        System.out.println("CIRCULAR MATRIX");
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