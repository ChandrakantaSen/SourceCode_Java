import java.io.*;
class matrix_04
{
public static void main (String args[]) throws IOException
{
int i,j,m,n,s=0;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("   Enter the size of the matrix  ");
n=Integer.parseInt (br.readLine ());
int a[][]=new int [n][n];
System.out.println ("   Enter the values of the matrix  ");
for (i=0;i<n;i++)
{
for (j=0;j<n;j++)
{
a[i][j]=Integer.parseInt (br.readLine());
    }
    System.out.println ();
}
System.out.println ("The matrix are as follows");
for (i=0;i<n;i++)
{
for (j=0;j<n;j++)
{
System.out.print ("  "+a[i][j]);
    }
    System.out.println (   );
}
System.out.println ("   The left diagonal of the matrix is as follows   ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==j)
{
System.out.print("  "+a[i][j]);
}
else
{
System.out.print("  ");                    
}
}
System.out.println();
    }
}
    }
               