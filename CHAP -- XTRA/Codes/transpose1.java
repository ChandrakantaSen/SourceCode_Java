import java.io.*;
class transpose1
{
public static void main(String args[])throws IOException
{
int m[][]=new int[4][4];
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
int i,j;
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
System.out.println("Enter no in"+i+"and"+j+"cell");

            m[i][j]=Integer.parseInt(br.readLine());
}
}
int temp[][]=new int [m.length][m[1].length];                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
System.out.println("transposed matrix");
for( i=0;i<m.length;i++)
{
for( j=0;j<m[0].length;j++)
{
temp[i][j]=m[j][i];
System.out.print(temp[i][j]+"\t");
}
System.out.println();
}
}
}



