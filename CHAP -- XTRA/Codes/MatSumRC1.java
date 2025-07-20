import java.io.*;
class MatSumRC1
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,j,sr=0,sc=0;
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
System.out.println("The values in the matrix are as follows : - ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]);
if(j!=n-1)
System.out.print("+");
sr=sr+a[i][j];
    }
System.out.println("="+sr);
sr=0;if(i<n)
System.out.println("+ + +");
    }
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
sc=sc+a[j][i];
System.out.print(sc+" ");
}
    }
}