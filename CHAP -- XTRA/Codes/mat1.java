import java.io.*;
class mat1
{
public static void main( String args [])throws IOException
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);


int b[][]=new int [3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.println("enter values");
b[i][j]=Integer.parseInt(br.readLine());

    }    }
    
    for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
 System.out.print(b[i][j]+"\t");
}
System.out.println();
    }
}
    }