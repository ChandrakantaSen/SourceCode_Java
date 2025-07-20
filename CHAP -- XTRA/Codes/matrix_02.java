import java.io.*;
class matrix_02
{
public static void main (String args[]) throws IOException
{
int i,j,m,n;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("   Enter the size of row in the matrix  ");
n=Integer.parseInt (br.readLine ());
System.out.println ("   Enter the size of coloumn in the matrix  ");
m=Integer.parseInt (br.readLine ());
int a[][]=new int [n][m];
System.out.println ("   Enter the values of the matrix  ");
for (i=0;i<n;i++)
{
for (j=0;j<m;j++)
{
a[i][j]=Integer.parseInt (br.readLine());
    }
    System.out.println ();
}
System.out.println ("The matrix are as follows");
for (i=0;i<n;i++)
{
for (j=0;j<m;j++)
{
System.out.print ("  "+a[i][j]);
    }
    System.out.println (   );
}
    }
}