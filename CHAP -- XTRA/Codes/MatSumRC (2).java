import java.io.*;
class MatSumRC
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
    }
System.out.println();    
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
sr=sr+a[i][j];
sc=sc+a[j][i];
    }
System.out.println("The sum of row "+(i+1)+" = "+sr);
System.out.println("The sum of column "+(i+1)+" = "+sc);
sr=0;sc=0;

    }
}
    }