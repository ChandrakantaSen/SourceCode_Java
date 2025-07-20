import java.io.*;
class matrix_multiplication
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,j,k;
System.out.println("Enter the size of both matrix : - ");
n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];
int b[][]=new int[n][n];
System.out.println("Enter the values in the matrix A: - ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(br.readLine());
    }
}
System.out.println("Enter the values in the matrix B: - ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
b[i][j]=Integer.parseInt(br.readLine());
    }
}
System.out.println("The values in the matrix A are as follows : - ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]);
    }
System.out.println();    
}
System.out.println("The values in the matrix B are as follows : - ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(b[i][j]);
    }
System.out.println();    
}
int c[][]=new int[n][n];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
for(k=0;k<n;k++)
c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
    }
}
System.out.println("The values in the matrix C(A*B) are as follows : - ");
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