import java.io.*;
class transpose1
{
public static void main(String args[])
{

int m[][]={{6,9,0,8},{3,2,1,5},{2,9,0,1},{4,1,9,6}};
int temp[][]=new int [m.length][m[0].length];                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
System.out.println("transposed matrix");
for(int i=0;i<m.length;i++)
{
for(int j=0;j<m[0].length;j++)
{
temp[i][j]=m[j][i];
System.out.print(temp[i][j]+"\t");
  }
    System.out.println();
}
    }
    }