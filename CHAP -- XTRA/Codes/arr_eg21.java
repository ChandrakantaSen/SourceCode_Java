import java.io.*;
class arr_eg21
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,j,t;
System.out.println("Enter the size of the matrix : - ");
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
System.out.println("The values in the original matrix are as follows : - ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
    }
System.out.println();    
}
System.out.println("interchanging the values of 1st & 4th row : - ");
for(j=0;j<n;j++)
{
t=a[0][j];
a[0][j]=a[n-1][j];
a[n-1][j]=t;
    }
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