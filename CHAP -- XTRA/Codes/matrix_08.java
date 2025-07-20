import java.io.*;
class matrix_08
{
public static void main (String args[]) throws IOException
{
int i,j,n,sc=0,sr=0;
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
System.out.println ("   The sum of the row is   ");
for (i=0;i<n;i++)
{
for (j=0;j<n;j++)
{
System.out.print (" "+a[i][j]);
sr=sr+a[i][j];
if (j!=(n-1))
{
System.out.print (" + ");
    }
}
System.out.println ("   =   "+sr);
sr=0;
if (i!=(n-1))
{
System.out.println (" +    +    + ");
    }
}
System.out.println (" ||   ||   || ");
for (i=0;i<n;i++)
{
for (j=0;j<n;j++)
{
sc=sc+a[j][i];
    }
 System.out.print ( sc  +   "    ");
 sc=0;
}
    }
}