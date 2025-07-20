import java.io.*;
class matrix_01
{
public static void main (String args[]) throws IOException
{
int i,j;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
int a[][]=new int [3][4];
System.out.println ("   Enter the values of the matrix  ");
for (i=0;i<3;i++)
{
for (j=0;j<4;j++)
{
a[i][j]=Integer.parseInt (br.readLine());
    }
    System.out.println ();
}
System.out.println ("The matrix are as follows");
for (i=0;i<3;i++)
{
for (j=0;j<4;j++)
{
System.out.print ("  "+a[i][j]);
    }
    System.out.println (   );
}
    }
}