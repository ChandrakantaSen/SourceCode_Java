import java.io.*;
class matrix_00
{
public static void main (String args[]) throws IOException
{
int i,j;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
int a[][]= {{1,2,3,4,5,6,7,8,9,10},{10,9,8,7,6,5,4,3,2,1}};
System.out.println ("The matrix are as follows");
for (i=0;i<2;i++)
{
for (j=0;j<10;j++)
{
System.out.print ("  "+a[i][j]);
    }
    System.out.println (   );
}
    }
}