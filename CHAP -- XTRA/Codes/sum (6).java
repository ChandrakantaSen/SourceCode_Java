import java.io.*;
class sum
{
    public static void main(String args[])throws IOException
    {
        int i,j,n,k=0,m,t,r=0,s=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the matrix");
        n=Integer.parseInt(br.readLine());
        int a[][]=new int[n][n];
        int b[]=new int[n*n];
        int c[][]=new int[n][n];
        System.out.println("Enter the elements in the array");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                {
                    a[i][j]=Integer.parseInt(br.readLine());
                }
             System.out.println();
       }
       System.out.println("The elements in the array are as follows:-");
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
            b[k++]=a[i][j];
        }
    }
    for(k=0;k<(n*n)-1;k++)
    {
        for(m=k+1;m<(n*n);m++)
        {
            if(b[k]>b[m])
            {
                t=b[k];
                b[k]=b[m];
                b[m]=t;
            }
        }
    }
    k=0;
    for(r=0;r<n;r++)
    {
    for(s=0;s<n;s++)
    {
        c[r][s]=b[k];
        k++;
    }
    }
    System.out.println("The elements in the array after sorting are as follows:-");
        for(r=0;r<n;r++)
        {
            for(s=0;s<n;s++)
             {
                 System.out.print(c[r][s]+" ");
             }
             System.out.println();
        }
    }
}   
    
    