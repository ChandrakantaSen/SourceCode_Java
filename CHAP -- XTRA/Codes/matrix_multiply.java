import java.io.*;
class matrix_multiply
{
public static void main(String args[])throws IOException
{int sum=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the size of the square matrix");
int n=Integer.parseInt(br.readLine());
int b[][]=new int[n][n];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.println("enter a value");
b[i][j]=Integer.parseInt(br.readLine());
    }
}
System.out.println("input the second matrix:");
int a[][]=new int[n][n];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.println("enter a value");
a[i][j]=Integer.parseInt(br.readLine());
    }
}
int i=0,j=0,r=0,c=0,k=0;
int arr[][]=new int[n][n];
for( r=0;r<n;r++)
{
for( c=0;c<n;c++)
{
for(k=0;k<n;k++)
{
sum=sum+(a[r][c]*b[c][r]);
    }
    arr[r][c]=sum;
sum=0;
 System.out.println();
           }
        } 
for(int i1=0;i1<n;i1++)
{
for(int j1=0;j1<n;j1++)
{
System.out.print(arr[i1][j1]+" ");
    }
    System.out.println();
}
    }
}